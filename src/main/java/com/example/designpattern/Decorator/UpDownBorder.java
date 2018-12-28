package com.example.designpattern.Decorator;

/**
 * @author liuweibo
 * @date 2018/12/28
 */
public class UpDownBorder extends Border {


    public UpDownBorder(Display display, String symbol) {
        super(display, symbol);
    }

    @Override
    int getRows() {
        return 1 + this.display.getRows() + 1;
    }

    @Override
    int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }

    @Override
    String getRowText(int row) {
        // 获取上下边框
        if (row == 0 || row == this.display.getRows() + 1) {
            return this.symbol + makeText("-", this.display.getColumns()) + this.symbol;
        } else { // 中间边框
            return "|" + this.display.getRowText(row - 1) + "|";
        }
    }

    private String makeText(String symbol, int columns) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<columns; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }

}
