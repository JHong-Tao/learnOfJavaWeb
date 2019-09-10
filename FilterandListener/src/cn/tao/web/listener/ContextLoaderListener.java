package cn.tao.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-09-10-13:01
 * Version：1.0.0
 * Description:
 */
public class ContextLoaderListener implements ServletContextListener{
    /**
     * 监听ServletContext对象创建
     * 服务器启动后自动调用
     * @param servletContextEvent
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //加载资源文件
        //1.获取ServletContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();

        //2.加载资源文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        //3.获取真实路径
        String realPath = servletContext.getRealPath(contextConfigLocation);

        //4.加载进内存
        try{
            FileInputStream fis = new FileInputStream(realPath);
            System.out.println(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ServletContext对象被创建了。。。");
    }

    /**
     * 监听ServletContext对象销毁
     * 服务器关闭后自动调用
     * @param servletContextEvent
     */
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁");
    }
}
