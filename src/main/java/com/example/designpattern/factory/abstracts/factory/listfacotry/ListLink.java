package com.example.designpattern.factory.abstracts.factory.listfacotry;

import com.example.designpattern.factory.abstracts.factory.factory.Link;

/**
 * 列表形式的超链接，就是将每个超链接用 <li>超链接<li/> 标签包裹起来
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 实现方法，转换成html中的一个标签
     * @return
     */
    @Override
    public String makeHtml() {
        return "<li> <a href=\"" + this.url + "\">" + this.caption + "</a></li>\n";
    }
}
