package com.example.designpattern.factory.abstracts.factory.factory;

/**
 * 超链接元素抽象类
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public abstract class Link extends Item {

    /**
     * 每个超链接都有一个连接
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
