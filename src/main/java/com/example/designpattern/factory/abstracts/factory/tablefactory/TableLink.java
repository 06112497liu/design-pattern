package com.example.designpattern.factory.abstracts.factory.tablefactory;

import com.example.designpattern.factory.abstracts.factory.factory.Link;

/**
 * @author liuweibo
 * @date 2018/12/27
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return null;
    }
}
