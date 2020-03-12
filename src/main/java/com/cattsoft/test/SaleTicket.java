package com.cattsoft.test;

//卖票
public class SaleTicket {

    public static void main(String[] args) {
        ShareData shareData = new ShareData();
//        for(int i = 0; i < 4; i++){
//
//        }
        new Thread(new RunnableTask(shareData)).start();
        new Thread(new RunnableTask(shareData)).start();
        new Thread(new RunnableTask(shareData)).start();
        new Thread(new RunnableTask(shareData)).start();
    }
}

class RunnableTask implements Runnable{
    private  ShareData shareData;
    public RunnableTask(ShareData shareData){
        this.shareData = shareData;
    }
    @Override
    public void run() {
        shareData.dec();
    }
}

class ShareData{
    private volatile int num = 100;
    public void dec()  {
        while (num>0) {
            synchronized ("") {
                System.out.println(Thread.currentThread().getName() + " :invoke dec method num=" + num);
                --num;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public int getNum() {
        return num;
    }
}
