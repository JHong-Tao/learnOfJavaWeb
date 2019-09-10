package cn.tao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-11:07
 * Version：1.0.0
 * Description:
 * 拦截方式的配置：资源被访问的方式
 */
// 浏览器直接访问index.jsp，过滤器被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
// 转发时，过滤器才被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
// 多种请求方式，同时被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    // 重写初始化方法
    public void init(FilterConfig config) throws ServletException {

    }

    // 重写doFilter 方法，一般都要重写
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("FilterDemo5...");
        // 放行
        filterChain.doFilter(request, response);
    }

    // 重写 关闭服务器的时候执行的销毁方法
    public void destroy() {

    }

}
