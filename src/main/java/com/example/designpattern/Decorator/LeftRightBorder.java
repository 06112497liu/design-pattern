package com.example.designpattern.Decorator;

/**
 * 给字符串添加左右边框
 *
 * @author liuweibo
 * @date 2018/12/28
 */
public class LeftRightBorder extends Border {


    public LeftRightBorder(Display display, String symbol) {
        super(display, symbol);
    }

    @Override
    int getRows() {
        return this.display.getRows();
    }

    @Override
    int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }

    @Override
    String getRowText(int row) {
        return this.symbol + this.display.getRowText(row) + this.symbol;
    }
}
