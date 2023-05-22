package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbBrand)实体类
 *
 * @author 张宇轩
 * @since 2023-05-22 15:33:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbBrand implements Serializable {
    private static final long serialVersionUID = 636975416687068838L;

    private Integer id;

    private String brandName;

    private String companyName;

    private Integer ordered;

    private String description;

    private Integer status;

    private Date createDate;
}
