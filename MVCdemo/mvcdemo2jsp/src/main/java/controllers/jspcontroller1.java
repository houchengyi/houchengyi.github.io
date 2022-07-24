package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspcontroller1 {
@RequestMapping("/success")
    public String success(){
    return  "success";
}
}
