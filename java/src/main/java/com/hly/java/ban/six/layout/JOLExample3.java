package com.hly.java.ban.six.layout;
import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.System.out;

public class JOLExample3 {
   static A a;
    public static void main(String[] args) throws Exception {
        //Thread.sleep(5000);
        a= new A();
        //a.hashCode();
        out.println("befor lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());//无锁：偏向锁？
        synchronized (a){
            out.println("lock ing");
            out.println(ClassLayout.parseInstance(a).toPrintable());
        }


        out.println("after lock");
        out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}
