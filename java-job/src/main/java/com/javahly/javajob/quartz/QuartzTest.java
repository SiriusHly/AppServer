package com.javahly.javajob.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2020/4/25
 * @QQ :1136513099
 * @desc :
 */
public class QuartzTest {

    public static void main(String[] args) throws SchedulerException {
        //1.创建Scheduler的工厂
        SchedulerFactory sf = new StdSchedulerFactory();
        //2.从工厂中获取调度器实例
        Scheduler scheduler = sf.getScheduler();

        //3.创建 JobDetail
        JobDetail jb = JobBuilder.newJob(MyJob.class)
                .withDescription("this is a ram job") //job的描述
                .withIdentity("ramJob", "ramGroup") //job 的 name 和 group
                .build();

        //任务运行的时间，SimpleSchedle 类型触发器有效
        long time = System.currentTimeMillis() + 2 * 1000L; //2 秒后启动任务
        Date statTime = new Date(time);

        //4.创建Trigger
        //使用SimpleScheduleBuilder或者CronScheduleBuilder
        Trigger t = TriggerBuilder.newTrigger()
                .withDescription("")
                .withIdentity("ramTrigger", "ramTriggerGroup")
                //.withSchedule(SimpleScheduleBuilder.simpleSchedule())
                .startAt(statTime)  //默认当前时间启动
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?")) //两秒执行一次
                .build();

        //5.注册任务和定时器
        scheduler.scheduleJob(jb, t);

        //6.启动 调度器
        scheduler.start();
    }
}
