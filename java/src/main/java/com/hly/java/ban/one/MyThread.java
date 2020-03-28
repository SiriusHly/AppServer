package com.hly.java.ban.one;

public class MyThread {

    static {
        //.so 文件
        System.loadLibrary("HlyThreadNative");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start0();

    }


    public void run(){

        System.out.println("i am new Thread\n");
    }

    private native void start0();
}
