package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/19 - 15:59
 */
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    public Dog() {
        System.out.println("狗出生了");
    }

    private String name;
    public void eat(){
        System.out.println(name + "的狗吃骨头...");
    }
}
