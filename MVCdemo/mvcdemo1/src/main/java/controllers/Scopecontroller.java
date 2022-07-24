package controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class Scopecontroller {
    @RequestMapping("/tesetrequest")//前端控制器实现跳转的方式是转发 不是跳转 webif下面的html无法同跳转访问
    public String testrequest(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("testmessage","嘿嘿嘿跳转成功了");
        return  "success";

    }
    @RequestMapping("/testmodelandview")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView();
        //处理模型数据
        modelAndView.addObject("testmessage","Hello model AND VIEW");
        //设置试图名称
        modelAndView.setViewName("success");
        System.out.println(modelAndView);
        return  modelAndView;
    }
    @RequestMapping("testmodel")
    public  String test1(Model model){
        model.addAttribute("testmessage","使用model的方法传递 数值");
        System.out.println(model);
        return  "success";
    }
    @RequestMapping("testmap")
    public  String map(Map<String,Object> map){

        map.put("testmessage","这是用map方法传递的参数");
        System.out.println(map);
        return  "success";
    }
    @RequestMapping("/testModelMap")
    public  String s(ModelMap map){
        map.addAttribute("testmessage","hahahahahatestmodel'map");
        System.out.println(map);
        return  "success";

    }
    @RequestMapping("/testsession")
    public  String test2(HttpSession session){
        session.setAttribute("sessiontext","这是session的传递的文件方法");
        return  "success";
    }
    @RequestMapping("/testapplication")
    public  String test3(HttpSession session){
        ServletContext servletContext=session.getServletContext();
        servletContext.setAttribute("application","这是context传递的参数 整个服务器的范围");

        return  "success";

    }
}
