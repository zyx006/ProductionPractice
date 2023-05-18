package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-05-18 10:57:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = -49619234712003036L;

    private Integer studentId;

    private String studentName;

    private Integer classId;

    private Float score;

    private List<Teacher> teacherList;

}

