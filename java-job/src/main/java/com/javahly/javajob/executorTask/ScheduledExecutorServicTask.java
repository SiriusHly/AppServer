package com.javahly.javajob.executorTask;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/25
 * @QQ :1136513099
 * @desc : 线程池
 */
public class ScheduledExecutorServicTask {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("定时任务执行》》》"+new Date());
            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleAtFixedRate(runnable, 1, 1, TimeUnit.SECONDS);
    }

}
