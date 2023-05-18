package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/18 - 9:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private static final long serialVersionUID = -19615450950487424L;
    /**
     * 主键
     */
    private Object id;
    /**
     * 用户名
     */
    private String uName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 地址
     */
    private String address;

    private List<Orders> ordersList;
}
