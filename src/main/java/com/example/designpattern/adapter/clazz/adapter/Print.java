package com.example.designpattern.adapter.clazz.adapter;

/**
 * 需求接口
 *
 * @author liuweibo
 * @date 2018/12/7
 */
public interface Print {
    /**
     * 弱化字符串显示（用“()”将字符串括起来）
     *
     * @param str
     */
    void printWeek(String str);

    /**
     * 强化字符串侠士（用“*”将字符串包裹起来）
     *
     * @param str
     */
    void printStrong(String str);
}


