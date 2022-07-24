package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//演示基于注解配置异常处理
@ControllerAdvice
public class exceptioncontroller {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})//等同于注解配置 value参数是class等同于
    // <prop key="java.lang.ArithmeticException">error</prop>
    //  <!--配置异常处理    SimpleMappingExceptionResolver自定义的异常处理  -->
    public String errpr(Exception ex,//参数等同于  <property name="exceptionAttribute" value="ex"></property><!--exceptionAttribute获取异常信息  默认放在request域对象中-->
                        Model model){
        model.addAttribute("ex",ex);
        return "success";
    }
}
