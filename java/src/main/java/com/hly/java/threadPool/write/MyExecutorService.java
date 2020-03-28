package com.hly.java.threadPool.write;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/27
 * @QQ :1136513099
 * @desc :
 */
public class MyExecutorService {
    private List<WorkThread> workThreads;
    private BlockingQueue<Runnable> blockingQueue;
    private volatile Boolean working = true;

    public MyExecutorService(int workThreadSize, int taskQueueSize) {

        //初始化队列大小
        this.blockingQueue = new LinkedBlockingQueue<>(taskQueueSize);
        this.workThreads = new ArrayList<>();
        for (int i = 0; i < workThreadSize; i++) {
            WorkThread workThread = new WorkThread();
            workThread.start();
            this.workThreads.add(workThread);

        }
    }

    public boolean execute(Runnable runnable) {
        return blockingQueue.offer(runnable);
    }

    public void shutdown() {
        this.working = false;
    }

    class WorkThread extends Thread {
        @Override
        public void run() {
            while (working || blockingQueue.size() > 0) {
                Runnable task = blockingQueue.poll();
                if (task != null) {
                    task.run();
                }
            }
        }
    }


    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(10, 100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行>>>>>>>");
                }
            });
        }
        executorService.shutdown();
        //空闲这么处理
    }
}
