package com.example.designpattern.factory.abstracts.factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 产品抽象类（即一个完整的页面）
 * @author liuweibo
 * @date 2018/12/27
 */
public abstract class Page {

    /**
     * 页面名称
     */
    protected String title;

    /**
     * 作者
     */
    protected String author;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 包含各种各样的html元素
     */
    protected List<Item> content = new ArrayList<>();

    public void add(Item item) {
        this.content.add(item);
    }

    /**
     * 生成文件
     */
    public void output() {
        try {
            String filename = this.title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(filename + "：编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();


}
