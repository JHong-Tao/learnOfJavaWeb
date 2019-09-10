package cn.tao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-10:12
 * Version：1.0.0
 * Description:
 * Filter执行流程：
 * 请求 > 执行Filter > 放行 > 获得请求 > 放行
 */
// @WebFilter(value = "/*")
public class FilterDemo2 implements Filter {
    //重写初始化方法
    public void init(FilterConfig config) throws ServletException {

    }

    // 重写doFilter 方法，一般都要重写
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 对request的请求消息增强
        System.out.println("FilterDemo2执行了");
        // 放行
        filterChain.doFilter(request, response);
        // response响应的信息进行增强
        System.out.println("FilterDemo2又回来了");
    }

    public void destroy() {

    }

}
