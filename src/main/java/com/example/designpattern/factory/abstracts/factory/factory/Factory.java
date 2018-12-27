package com.example.designpattern.factory.abstracts.factory.factory;

/**
 * 抽象工厂类，一个工厂可以创建多个产品
 *
 * @author liuweibo
 * @date 2018/12/27
 */
public abstract class Factory {


    public static Factory getFactory(String factoryName) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(factoryName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * @param caption
     * @param url
     * @return
     */
    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

}
