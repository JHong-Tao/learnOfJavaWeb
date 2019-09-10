package cn.tao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-10:26
 * Version：1.0.0
 * Description:
 * Filter的生命周期函数
 */
// @WebFilter(value = "/*")
public class FilterDemo3 implements Filter {
    // 重写初始化方法

    /**
     * 在服务器启动后，会创建Filter对象，然后调用init方法，只执行一次
     * 常用于加载资源
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init。。。");
    }

    // 重写doFilter 方法，一般都要重写

    /**
     * 拦截逻辑
     * @param request
     * @param response
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("doFilter...");
        // 放行
        filterChain.doFilter(request, response);
    }

    /**
     * 在服务器关闭，Filter对象被销毁，如果服务器正常关闭则执行destroy方法，只执行一次
     * 常用于释放资源
     */
    public void destroy() {
        System.out.println("destroy....");
    }

}
