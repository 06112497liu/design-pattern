package com.example.designpattern.factory.abstracts.factory;

import com.example.designpattern.factory.abstracts.factory.factory.*;
import com.example.designpattern.factory.abstracts.factory.listfacotry.ListLink;
import com.example.designpattern.factory.abstracts.factory.listfacotry.ListTray;

/**
 * @author liuweibo
 * @date 2018/12/27
 */
public class ListMain {

    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.example.designpattern.factory.abstracts.factory.listfacotry.ListFactory");
        Page page = factory.createPage("超链接集合", "刘维柏");

        Tray rb = factory.createTray("日报");
        Tray js = factory.createTray("检索引擎");
        Tray yh = factory.createTray("雅虎");

        Item rmzb = factory.createLink("人名日报", "www.people.com.cn");
        Item gmrb = factory.createLink("光明日报", "www.gmw.cn");
        rb.addItem(rmzb);
        rb.addItem(gmrb);

        Item google = factory.createLink("谷歌", "www.google");
        Item yahoo = factory.createLink("yahoo!", "www.yahoo.com");
        Item yahooJ = factory.createLink("yahoo-japen", "www.yahoo.co.jp");


        js.addItem(yh);
        js.addItem(google);
        yh.addItem(yahoo);
        yh.addItem(yahooJ);

        page.add(rb);
        page.add(js);

        page.output();

    }

}
