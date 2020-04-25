package com.javahly.javajob.timeTask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/25
 * @QQ :1136513099
 * @desc :
 */
public class TimeTaskSchedule {

    public static void main(String[] args) {

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务执行》》》" + new Date());
            }
        };

        Timer timer = new Timer();
        //延迟多少时间后开始执行
        long delay = 0;
        //每隔多少时间执行，这里是 1 秒
        long period = 1000;
        timer.scheduleAtFixedRate(timerTask, delay, period);

    }

}
