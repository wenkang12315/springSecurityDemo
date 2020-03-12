package com.cattsoft.test;

public class ThreadLocalTest {

    /**
     * 注意threadLocal的意义 以及 用法
     * @param
     */
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return "zhangsan";
            }
        };
        System.out.println(tl.get());
    }
}
