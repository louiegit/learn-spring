package com.learn.spring;

import lombok.Data;

import java.util.Optional;

/**
 * @author tianxiang.luo
 * Date: Created in 2019/4/19 17:45
 * Description:
 */
public class MyOptional {


    public static void main(String[] args) {

        Optional使用();

        Optional使用2();

        Optional使用3();
    }

    private static void Optional使用2() {
        Obj obj = new Obj("a");
        // orElse一定会执行,但是用的还是前面的值
        Obj now = Optional.ofNullable(obj).orElse(getObj());
        System.out.println(now.getName());
    }

    private static void Optional使用3() {
        Obj obj = new Obj("a");
        // orElse一定会执行,但是用的还是前面的值
        Obj now = Optional.ofNullable(obj).orElseGet(()->getObj());
        System.out.println(now.getName());
    }

    public static Obj getObj(){
        Obj obj1 = new Obj("b");
        System.out.println("居然进来了");
        return obj1;
    }

    private static void Optional使用() {
        Obj obj = new Obj();
        Obj obj1 = new Obj("1");

        Obj obj2  = Optional.ofNullable(obj).orElse(obj1);
        System.out.println(obj2.getName());
    }


    @Data
    static class Obj{
        public Obj() {
        }

        public Obj(String name) {
            this.name = name;
        }

        private String name;
    }



}
