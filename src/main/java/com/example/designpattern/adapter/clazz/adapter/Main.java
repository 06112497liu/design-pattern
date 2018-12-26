package com.example.designpattern.adapter.clazz.adapter;

/**
 * @author liuweibo
 * @date 2018/12/7
 */
public class Main {

    public static void main(String[] args) {
        Print print = new BannerAdapter();
        print.printWeek("你好");
        print.printStrong("你好");
    }
}


