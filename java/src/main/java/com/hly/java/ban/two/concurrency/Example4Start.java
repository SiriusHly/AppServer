package com.hly.java.ban.two.concurrency;

public class Example4Start {
    Object o= new Object();
    static {
        System.loadLibrary( "LubanThreadNative" );
    }
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Example4Start example4Start = new Example4Start();
        example4Start.start();
    }

    public void start(){
        Thread thread = new Thread(){
            public void run() {
                while (true){
                    try {
                        //Thread.sleep(500);
                        sync();
                    } catch (InterruptedException e) {

                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        //Thread.sleep(500);
                        sync();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.setName("t1");
        thread2.setName("t2");

        thread.start();
       // thread2.start();


    }

    public native void tid();
    public  void sync() throws InterruptedException {
        synchronized(o) {
            //System.out.println(Thread.currentThread().getName());
            tid();
        }

          //  System.out.println(Thread.currentThread().getName() + "----xxxxttttxxx");
    }


}
