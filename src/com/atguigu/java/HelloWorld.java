package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陈小欢
 * @create 2018-12-16 20:56
 */
public class HelloWorld {

    private static final String A = "aa";
    //prsf
    private static final Customer CUST = null;
    //psfi
    public static final int B = 10;
    //psfs
    public static final String K = "ddd";

    //psvm
    public static void main(String[] args){
        //单行注释
        int j = 10;
        test(j);
        //TODO;
        String name = getName();

       String[] arr = new String[]{"AA","BB"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        List<String> al = new ArrayList<>();
        al.add("a");
        al.add("ab");

        for (Iterator<String> iterator = al.iterator(); iterator.hasNext(); ) {
            String next =  iterator.next();

        }

        //ifn
        if (al == null) {

        }

        //inn
        if (al != null) {

        }
        //xxx.null
        if (al == null) {

        }

        //xxx.nn
        if (al != null) {

        }


    }

    private static void test(int i) {
        if(i < 5) {
            System.out.println("aaaa");
        }
        System.out.println("hello world");
    }

    public static String getName(){
        return "aa";
    }
}
