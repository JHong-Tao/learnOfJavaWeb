package cn.tao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-12:05
 * Version：1.0.0
 * Description:
 * 过滤器链（配置多个过滤器）
 */
@WebFilter(value = "/*")
public class FilterDemo7 implements Filter {
    // 重写初始化方法
    public void init(FilterConfig config) throws ServletException {
    }

    // 重写doFilter 方法，一般都要重写
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("FilterDemo7执行了");

        // 放行
        filterChain.doFilter(request, response);

        System.out.println("FilterDemo7回来了。。。");
    }

    // 重写 关闭服务器的时候执行的销毁方法
    public void destroy() {
    }

}
