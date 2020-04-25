package com.hly.java.thread.callable;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/3/27
 * @QQ :1136513099
 * @desc :
 */
public class TestCallable {

    public static void main(String[] args) {
        CallableThreadDemo ctd = new CallableThreadDemo();
        //1.执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果
        FutureTask<Integer> result = new FutureTask<Integer>(ctd);
        new Thread(result).start();
        //2.接收线程运算后的结果
        try {
            Integer sum = result.get(); //FutureTask 可用于闭锁
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class CallableThreadDemo implements Callable<Integer> {
    HashMap
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
