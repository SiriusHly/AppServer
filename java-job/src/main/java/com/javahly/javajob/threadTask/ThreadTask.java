package com.javahly.javajob.threadTask;

import java.util.Date;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/25
 * @QQ :1136513099
 * @desc : 线程
 */
public class ThreadTask {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("定时任务执行》》》"+new Date());
                    } catch (InterruptedException e) {

                    }
                }
            }
        }).start();
    }
}
