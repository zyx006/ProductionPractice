package cn.czyx007.bean;

import cn.czyx007.dao.InkBox;
import cn.czyx007.dao.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/22 - 18:19
 */
@Component
public class Printer {
    private InkBox inkBox;
    private Paper paper;

    @Autowired
    public Printer(InkBox inkBox, Paper paper){
        this.inkBox = inkBox;
        this.paper = paper;
    }

    public void printDocument() {
        System.out.println("开始打印...");
        inkBox.print();
        System.out.println("纸张大小：" + paper.getSize());
        System.out.println("打印完成！");
    }
}
