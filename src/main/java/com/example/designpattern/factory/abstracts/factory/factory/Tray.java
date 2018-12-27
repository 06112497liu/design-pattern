package com.example.designpattern.factory.abstracts.factory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 也是html中的一个元素，但是此元素与单一元素还有区别，区别就是这个元素可以包裹其它元素，当然也可以包裹自己
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public abstract class Tray extends Item {

    protected List<Item> container = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    /**
     * 用来包裹html元素，当然也可以包裹自己
     *
     * @param item
     */
    public void addItem(Item item) {
        this.container.add(item);
    }
}
