package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2023-05-18 10:57:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Serializable {
    private static final long serialVersionUID = 379268743552041709L;

    private Integer teacherId;

    private String teacherName;

}

