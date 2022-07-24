package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class requestcontroller {
    @RequestMapping("/param")//报错 加上controller 请求后可有多个控制器 但是映射地址唯一
    public String index(){
        return "test_param";

    }

}
