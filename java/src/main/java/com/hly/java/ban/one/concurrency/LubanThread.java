package com.hly.java.ban.one.concurrency;

public class LubanThread {

    static {
        System.loadLibrary( "LubanThreadNative" );
    }
    public static void main(String[] args) {
        LubanThread lubanThread =new LubanThread();
        lubanThread.start0();
    }

    public void run(){
        System.out.println("I am new Thread!!");
    }

    private native void start0();
}
