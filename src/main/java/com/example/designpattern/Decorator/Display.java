package com.example.designpattern.Decorator;

/**
 * 用于显示字符串的顶层接口
 *
 * @author liuweibo
 * @date 2018/12/28
 */
public abstract class Display {

    /**
     * 行数
     *
     * @return
     */
    abstract int getRows();

    /**
     * 列数
     *
     * @return
     */
    abstract int getColumns();


    /**
     * 某一行数据
     *
     * @param row
     * @return
     */
    abstract String getRowText(int row);

    /**
     * 展示字符串
     *
     */
    public void show() {
        for (int i = 0; i < this.getRows(); i++) {
            System.out.println(this.getRowText(i));
        }
    }
}
