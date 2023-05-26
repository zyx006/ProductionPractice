package cn.czyx007.config;

import cn.czyx007.interceptor.MyInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/26 - 16:13
 */
//配置类，配置拦截器、redis、解决CORS跨域问题
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
