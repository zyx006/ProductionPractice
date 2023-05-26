package cn.czyx007;

import cn.czyx007.bean.User;
import cn.czyx007.mapper.UserMapper;
import cn.czyx007.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.mysql.cj.util.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void test2(){
        String name = "J";
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(!StringUtils.isNullOrEmpty(name), User::getName, name);
        List<User> user = userMapper.selectList(lqw);
        user.forEach(System.out::println);
    }

    @Test
    void test3(){
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(User::getName, "J");
        userService.list(lqw).forEach(System.out::println);
    }

    @Test
    void test4(){
        //创建一个mybatisplus的分页对象
        IPage<User> iPage = new Page<>(1, 2);
        //进行查询
        userService.page(iPage);
        //输出结果
        System.out.println("分页数据：" + iPage.getRecords());
        System.out.println("页数：" + iPage.getPages());
        System.out.println("记录数：" + iPage.getTotal());
    }

    @Test
    void test5(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/person_info?serverTimezone=Asia/Shanghai",
                        "root", "zyx007")
                .globalConfig(builder -> {
                    builder.author("zyx") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("C:\\Users\\zyx\\Desktop\\课程文件\\大三\\下学期\\生产实习\\ProductionPractice\\springboot-mbp-526\\src\\main\\java\\cn\\czyx007"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("demo") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\zyx\\Desktop\\课程文件\\大三\\下学期\\生产实习\\ProductionPractice\\springboot-mbp-526\\src\\main\\resources\\mappers")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("tb_brand") // 设置需要生成的表名
                            .addTablePrefix("tb_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
