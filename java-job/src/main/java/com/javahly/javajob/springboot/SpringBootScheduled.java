package com.javahly.javajob.springboot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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
@Component
public class SpringBootScheduled {

    @Scheduled(cron = "0/1 * * * * ?")
    public void scheduledTask() {
        System.out.println("定时任务执行》》》" + new Date());
    }
}
