package com.learn.spring;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tianxiang.luo
 * Date: Created in 2019/4/19 17:14
 * Description:
 */
public class Stream {


    public static void main(String[] args) {

        获取对象的属性变成list();

        过滤空值();

        排序();

        统计();
    }

    public static void 排序(){
        List<Obj> list = getList("b","a");
        list.sort(Comparator.comparing(Obj::getName));
        System.out.println(list);
    }

    public static void 过滤空值(){
        List<Obj> list = getList("a","");

        List<Obj> objList = list.stream().filter(obj1->!"".equals(obj1.getName())).collect(Collectors.toList());
        System.out.println(objList);
    }


    public static void 获取对象的属性变成list(){
        List<Obj> list = getList("a");

        List<String> names = list.stream().map(Obj::getName).collect(Collectors.toList());
        System.out.println(names.size());
    }

    public static void 统计(){
        List<Obj> list = getList("1","2","3");
        long sum = list.stream().mapToInt(x->Integer.valueOf(x.getName())).sum();
        System.out.println(sum);
    }

    @Data
    static class Obj{
        private String name;
    }


    static List<Obj> getList(String... strings){
        List<Obj> list= new ArrayList<>();
        for (String str: strings){
            Obj obj = new Obj();
            obj.setName(str);
            list.add(obj);
        }
        return list;
    }
}
