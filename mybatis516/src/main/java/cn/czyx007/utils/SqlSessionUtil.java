package cn.czyx007.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/16 - 14:08
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        InputStream is;
        try {
            //1.获取核心配置文件的输入流
            is = Resources.getResourceAsStream("mybatis-config.xml");
            //2.获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //3.获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
