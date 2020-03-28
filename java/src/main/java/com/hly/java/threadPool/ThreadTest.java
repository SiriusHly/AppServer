package com.hly.java.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/27
 * @QQ :1136513099
 * @desc :
 * https://www.cnblogs.com/jxxblogs/p/11655670.html
 */
public class ThreadTest {


    public static void main(String[] args) {
        ExecutorService es1 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            es1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务");
                }
            });
        }
        es1.shutdown();
    }
}
