package controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class paramcontrooler {
    @RequestMapping("/formtest")
    public  String tes1(){
        return "test_param";
    }
     @RequestMapping("/testservletapi")//获取转发当前映射的请求
    public  String testservlet(HttpServletRequest request){
         HttpSession httpSession=request.getSession();
         String name= request.getParameter("name");
         String address= request.getParameter("address");
         String email=request.getParameter("email");
         String message=request.getParameter("message");
         System.out.println(name+'\n'+address+'\n'+email+'\n'+message);
     return "success";

     }
     @RequestMapping("/testparam")
    public String tt(@RequestParam(value = "username",required = false,defaultValue = "hehemeichuan") String username1,
                     String password, @RequestHeader(value = "haha",defaultValue = "seehah") String host,
                     @CookieValue("JSESSIONID") String JSESSIONID){//required = false 不必要必须传输该参数
         System.out.println("username               "+username1);
         System.out.println(
                 "password                            "+password+'\n'+"host"+'\t'+host+'\t'+"JSESSIONID:"+'\t'+JSESSIONID
         );
        return "success";
     }
}
