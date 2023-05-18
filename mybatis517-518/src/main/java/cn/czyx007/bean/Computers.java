package cn.czyx007.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Computers)实体类
 *
 * @author 张宇轩
 * @since 2023-05-18 14:50:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computers implements Serializable {
    private static final long serialVersionUID = 943332959360147693L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 名牌
     */
    private String brand;
    /**
     * 价格
     */
    private Float price;
    /**
     * 内存
     */
    private Float runmem;
    /**
     * cpu类型
     */
    private String cpu;
    /**
     * 显卡
     */
    private Float xianka;
    /**
     * 1 显示  0隐藏
     */
    private String status;

    private Float startPrice;
    private Float endPrice;
}
