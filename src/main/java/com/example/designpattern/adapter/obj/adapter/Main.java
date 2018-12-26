package com.example.designpattern.adapter.obj.adapter;

import com.example.designpattern.adapter.clazz.adapter.Banner;
import com.example.designpattern.adapter.clazz.adapter.Print;

/**
 * @author liuweibo
 * @date 2018/12/7
 */
public class Main {

    public static void main(String[] args) {
        Print print = new BannerAdapter(new Banner());
        print.printWeek("你好");
        print.printStrong("你好");
    }
}
