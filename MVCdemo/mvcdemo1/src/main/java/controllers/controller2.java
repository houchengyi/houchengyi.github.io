package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller2 {
    @RequestMapping("/testthymeleaf")
    public String t1(){
         return  "success";
    }
    @RequestMapping("/testview")
    public  String t2(){
        return  "test_view";
    }
    @RequestMapping(value = "/login",params = {"username!=NULL","password"})
    public ModelAndView login(@RequestParam("username") String user, String password){
        ModelAndView mv=new ModelAndView();
        System.out.println(user);
        System.out.println(password);
        mv.setViewName("index1");
        mv.addObject("username",user);
        return mv;

    }
    @RequestMapping("/testforward")//internalview
    public  String testforward(){
        System.out.println("测试是否能转发请求");
        return "forward:/testthymeleaf";//转发请求 ：请求映射 一般用重新定向  转发为保留初始网页的地址
                               // 转发额可以获取域内对象数据 重新定位不可以  转发是可以转到webinf 重新定向不能到 webinf下

    }
    @RequestMapping("/testredirect")
    public  String testredirect(){
        return "redirect:/testthymeleaf";
    }
}
