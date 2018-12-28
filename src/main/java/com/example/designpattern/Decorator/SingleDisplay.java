package com.example.designpattern.Decorator;

/**
 * 单行显示字符串
 *
 * @author liuweibo
 * @date 2018/12/28
 */
public class SingleDisplay extends Display {

    private String str;

    public SingleDisplay(String str) {
        this.str = str;
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    int getColumns() {
        return this.str.getBytes().length;
    }

    @Override
    String getRowText(int row) {
        if (row == 0) {
            return this.str;
        }
        return null;
    }

}
