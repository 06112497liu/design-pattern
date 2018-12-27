package com.example.designpattern.factory.abstracts.factory.listfacotry;

import com.example.designpattern.factory.abstracts.factory.factory.Item;
import com.example.designpattern.factory.abstracts.factory.factory.Tray;

import java.util.Iterator;

/**
 * 包裹成列表类型的html
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {

        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(this.caption + "\n");
        sb.append("<ul>\n");

        Iterator<Item> iterator = this.container.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().makeHtml());
        }

        sb.append("</ul>\n");
        sb.append("</li>\n");

        return sb.toString();
    }
}
