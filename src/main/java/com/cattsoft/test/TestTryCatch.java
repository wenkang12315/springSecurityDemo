package com.cattsoft.test;

import com.cattsoft.eitity.test.TbUser;
import org.aspectj.weaver.ast.Test;
import org.omg.CORBA.portable.ValueOutputStream;

public class TestTryCatch {
    public static void main(String[] args) {
       // System.out.println(getNum());
        testClone();
    }

    /**
     * 测试finally
     * @return
     */
    public static int getNum() {
        try {
            int a = 1 / 0;
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    /**
     * 测试深拷贝 浅拷贝  针对clone方法
     */
    public static void testClone(){
        Person p1 = new Person(18,"张三");
        try {
            Person p2 = (Person)p1.clone();
            //System.out.println(p1==p2);
            System.out.println(p1.getName()==p2.getName());//属性为浅拷贝
            //p2.setName("李四");
            //System.out.println(p1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Cloneable{
    private int age;
    private String name;

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
