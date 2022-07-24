package interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//拦截器实现接口  需要在mvc配置文件经行注册
@Component
public class firstinterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("第一个拦截器输出了");
        return HandlerInterceptor.super.preHandle(request, response, handler);//控制器方法前前拦截使用
        //  返回true允许通过 返回false表示拦截
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("第一个拦截器输出了postHandle");//控制器方法后
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);//渲染视图完毕
    }
}
