package com.hly.java.onlinequestion.cpu;

/**
 * @author :hly
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2021/6/20
 * @desc :
 */
public class Test {

    //死循环
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                System.out.println("est");
            }
        }, "cpu-test-thread").start();
    }
}


