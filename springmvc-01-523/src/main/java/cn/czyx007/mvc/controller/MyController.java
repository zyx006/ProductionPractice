package cn.czyx007.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : 张宇轩
 * @createTime : 2023/5/23 - 10:33
 */
public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //接收器群
        System.out.println("成功接收到请求");
        //处理请求-不处理-将来要处理
        System.out.println("处理请求...不处理-将来要处理");
        //返回响应
        //ModelAndView封装数据和视图
        ModelAndView modelAndView = new ModelAndView();
        //1.封装数据
        modelAndView.addObject("userName", "abc");
        //2.封装视图
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
