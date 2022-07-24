package controllers;

import beans.user1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
    @RequestMapping({"/", "/zhuye"})//value 是一个数组 所以单个数值的时候可以不用添加【】
    public String index() {
        return "index";
    }
     @RequestMapping("para")
     public String in1() {
         return "test";
     }
    @RequestMapping("/hello")//报错 加上controller 请求后可有多个控制器 但是映射地址唯一
    public String in() {
        return "target";
    }

    @RequestMapping(value = {"/test1", "/test2"}, method = {RequestMethod.POST, RequestMethod.PUT}, params = {"username=admin"})
    public String success() {
        return "success";
    }
    @RequestMapping(value = {"/test1", "/testparameter"},  params = {"username=kkk","password=123"})
    public String tset() {
        return "success";
    }
    @GetMapping("/getmapping" )
    public String get() {
        return "success";
    }
    @RequestMapping({"/a?a/testAnt","/a*a/testAnt"})
    public String aa(){
        return "success";
    }
    @RequestMapping("/testpath/{id}/{pd}")//表示展位符号 {里面是待接受的参数}
    public  String testpath(@PathVariable("id")Integer id,@PathVariable("pd")Integer pd){
        System.out.println("获取到的参数是"+id+"密码等于="+pd);
        return "testpath";
    }
    @RequestMapping("/testbean")
    public  String testbean(user1 user){
        System.out.println(user);
        return "success";
    }

}

