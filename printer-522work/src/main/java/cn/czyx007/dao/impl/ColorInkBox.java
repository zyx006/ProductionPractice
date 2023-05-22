package cn.czyx007.dao.impl;

import cn.czyx007.dao.InkBox;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 18:18
 */
public class ColorInkBox implements InkBox {
    @Override
    public void print() {
        System.out.println("使用彩色墨盒打印");
    }
}
