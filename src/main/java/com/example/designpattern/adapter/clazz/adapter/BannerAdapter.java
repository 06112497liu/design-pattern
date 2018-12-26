package com.example.designpattern.adapter.clazz.adapter;

/**
 * @author liuweibo
 * @date 2018/12/7
 */
public class BannerAdapter extends Banner implements Print {
    @Override
    public void printWeek(String str) {
        this.showWithParen(str);
    }

    @Override
    public void printStrong(String str) {
        this.showWithAster(str);
    }
}


