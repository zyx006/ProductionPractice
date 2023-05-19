package cn.czyx007.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/16 - 11:02
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = -89822489848437850L;
    private Integer eid;
    private String ename;
    private String esex;
    private Date estartime;
    private Float epay;
    private Integer did;
}
