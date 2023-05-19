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
public class Husband {
    private Integer husId;
    private Integer age;
    private String gender;
    private String husbandName;
}
