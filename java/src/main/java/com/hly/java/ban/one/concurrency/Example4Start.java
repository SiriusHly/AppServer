package com.hly.java.ban.one.concurrency;

public class Example4Start {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("i am new Thread!");
            }
        };

        thread.start();

    }
}
