package cn.czyx007.controller;

import cn.czyx007.bean.Brand;
import cn.czyx007.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zyx
 * @since 2023-05-26
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private IBrandService brandService;

    @GetMapping("/getBrand")
    public List<Brand> getBrand(){
        System.out.println("yeeee！！！周五了！");
        return brandService.list();
    }
}
