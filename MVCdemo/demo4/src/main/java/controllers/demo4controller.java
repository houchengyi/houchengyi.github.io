package controllers;

import bean.user;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class demo4controller {
    @RequestMapping("/testrequestbody")
    public String test(@RequestBody String requestbody, Model model){
        model.addAttribute("requestbody","获取到的的报文请求体是"+requestbody);
        return "success";
    }
    @RequestMapping("/testquestentity")
    public  String test1(RequestEntity<String> requestEntity, ModelMap mm){
   mm.addAttribute("requestEntity","接受到的报文实体："+requestEntity);
   mm.addAttribute("requestEntitybody","接受到的报文实体的请求体："+requestEntity.getBody());
   mm.addAttribute("requestEntityhead","接受到的报文实体的请求头："+requestEntity.getHeaders());
   return "success";

    }
    @RequestMapping("/testresponse")
    public  void testresponse(HttpServletResponse httpServletResponse){
        try {
            httpServletResponse.getWriter().println("hello,  respose");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @RequestMapping("/testresponseBody")
    @ResponseBody
    public  String testresponse(){

        return  "加上@response注解以后该方法的返回值被处理为为是响应体";
    }
    @RequestMapping("/testresponse2")
    @ResponseBody//只能返回字符串 如果要返回u对象 需要返回对象则添加依赖
    public user testr(){
        return new user(2002521,"侯成意","2383560016","男","20");
    }

}
