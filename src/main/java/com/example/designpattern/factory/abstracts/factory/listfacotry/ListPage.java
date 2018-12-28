package com.example.designpattern.factory.abstracts.factory.listfacotry;

import com.example.designpattern.factory.abstracts.factory.factory.Item;
import com.example.designpattern.factory.abstracts.factory.factory.Page;

import java.util.Iterator;

/**
 * @author liuweibo
 * @date 2018/12/27
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {

        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>")
            .append(this.title)
            .append("</title></head>\n")
            .append("<body>\n")
            .append("<h1>")
            .append(this.title)
            .append("</h1>\n")
            .append("<ul>\n");
        Iterator<Item> iterator = this.content.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().makeHtml());
        }
        sb.append("</ul>\n")
            .append("<hr><address>")
            .append(this.author)
            .append("</address>")
            .append("</body></html>\n");
        return sb.toString();
    }
}
