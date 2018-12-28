package com.example.designpattern.Decorator;

/**
 * 给字符串显示添加边框
 * @author liuweibo
 * @date 2018/12/28
 */
public abstract class Border extends Display {

    protected Display display;

    /**
     * 包裹形状
     */
    protected String symbol;

    public Border(Display display, String symbol) {
        this.display = display;
        this.symbol = symbol;
    }
}
