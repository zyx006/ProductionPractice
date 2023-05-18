package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 14:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand implements Serializable {
    private static final long serialVersionUID = 372981646177803083L;

    private Integer id;

    private String brandName;

    private String companyName;

    private Integer ordered;

    private String description;

    //本身返回：1 和 0
    //想返回：启用 和 禁用
    private Integer status;

    private Date createDate;
}
