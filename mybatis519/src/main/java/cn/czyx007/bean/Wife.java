package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/17 - 15:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wife {
    private Integer wifeId;
    private Integer wifeAge;
    private String sex;
    private String wifeName;
    private Integer hId; //老公的id外建

    private Husband husband;
}
