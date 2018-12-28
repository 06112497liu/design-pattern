package com.example.designpattern.Decorator;

import com.example.designpattern.factory.abstracts.factory.factory.Link;

/**
 * @author liuweibo
 * @date 2018/12/28
 */
public class Main {

    public static void main(String[] args) {
        Display display = new SingleDisplay("O");
        LeftRightBorder leftRightBorder = new LeftRightBorder(display, "&");
        LeftRightBorder leftRightBorder1 = new LeftRightBorder(leftRightBorder, "+");
        UpDownBorder upDownBorder = new UpDownBorder(leftRightBorder1, "*");
        UpDownBorder up = new UpDownBorder(upDownBorder, "$");
        up.show();

    }

}
