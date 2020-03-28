package com.hly.java.ban.two.concurrency;

public class ThreadExample {
    static Thread thread = null;
    int i;
    public volatile static boolean runing = true;

    public static void main(String[] args) throws InterruptedException {
        traditional();
        Thread.sleep(100);
        runing = false;


    }


    public static void traditional() {
        thread = new Thread() {
            @Override
            public void run() {
               while (runing){
                 //i++;
               }
            }
        };
        thread.start();
    }

public static void aa(){
        Integer i=1;
        i.toString();

    }
}
