package cn.czyx007.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/26 - 16:07
 */
public class MyInterceptor implements HandlerInterceptor {
    //请求到达控制器之前执行此方法
    //返回true，请求通过，否则不通过
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle执行...");
        return true;
    }

    //请求已经到达了控制器，执行此方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle执行...");
    }

    //请求完成之后，执行此方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion执行...");
    }
}
