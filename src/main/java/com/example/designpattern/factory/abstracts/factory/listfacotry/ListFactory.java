package com.example.designpattern.factory.abstracts.factory.listfacotry;

import com.example.designpattern.factory.abstracts.factory.factory.*;

/**
 * @author liuweibo
 * @date 2018/12/27
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
