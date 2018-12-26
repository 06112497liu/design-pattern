package com.example.designpattern.adapter.obj.adapter;

import com.example.designpattern.adapter.clazz.adapter.Banner;
import com.example.designpattern.adapter.clazz.adapter.Print;

/**
 * @author liuweibo
 * @date 2018/12/7
 */
public class BannerAdapter implements Print {

    private Banner banner;

    public BannerAdapter(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeek(String str) {
        this.banner.showWithParen(str);
    }

    @Override
    public void printStrong(String str) {
        this.banner.showWithAster(str);
    }
}


