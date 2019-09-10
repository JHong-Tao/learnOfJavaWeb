package cn.tao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-10:50
 * Version：1.0.0
 * Description:
 * 过滤器配置详情
 */
// @WebFilter(value = "/*") // 拦截所有访问
// 1.具体的资源路径：/index.jsp    // 只有访问index.jsp的时候过滤器才会执行
// 2.目录拦截：/user/*  // 访问/user目录下的所有资源是，过滤器都会被执行
// 3.后缀名拦截：*.jsp   // 访问后缀名为.jsp的文件是，过滤器都会被执行
// 4.拦截所有资源：/* // 访问所有资源时，过滤器都会被执行
public class FilterDemo4 implements Filter {
    // 重写初始化方法
    public void init(FilterConfig config) throws ServletException {

    }

    // 重写doFilter 方法，一般都要重写
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
         System.out.println("doFilter,,,");
        // 放行
        filterChain.doFilter(request, response);
    }

    // 重写 关闭服务器的时候执行的销毁方法
    public void destroy() {

    }

}
