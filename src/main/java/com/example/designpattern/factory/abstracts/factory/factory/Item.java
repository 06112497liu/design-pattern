package com.example.designpattern.factory.abstracts.factory.factory;

/**
 * 抽象元素的父类（此类代表html文件中的一个元素）
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public abstract class Item {

    /**
     * 每个元素都有一个名称
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 将每个元素转换成html文件中的一个元素
     *
     * @return {@link String}
     */
    public abstract String makeHtml();
}
