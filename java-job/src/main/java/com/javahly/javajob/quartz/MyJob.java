package com.javahly.javajob.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

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
public class MyJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("定时任务执行》》》" + new Date());
    }
}
