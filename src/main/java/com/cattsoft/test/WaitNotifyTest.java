package com.cattsoft.test;

import com.sun.org.apache.xpath.internal.SourceTree;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Bussiness bussiness = new Bussiness();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    bussiness.subMethod();
                }
            }
        }).start();
        for (int i=0;i<3;i++){
            bussiness.mainMethod();
        }
    }

}

class Bussiness{
    private boolean flag = true;

    public synchronized void mainMethod() {
        while (true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":main thread running loop count--" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag=true;
            notify();
        }
    }

    public synchronized void subMethod(){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":sub thread running loop count--"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag=false;
        notify();
    }
}
