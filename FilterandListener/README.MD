# FilterANDlistener
## JavaWeb三大组件
1. Servlet
2. Filter:过滤器  
3. Listener:监听器
## Filter:过滤器
    1.概念：
        - web中的过滤器：当访问服务器资源的时候，过滤器可以将请求拦截下来，完成一些特殊的功能
        - 过滤器的作用：
            1.一般用于完成通知操作，如：登录验证，统一编码处理，敏感字符处理
    2.快速入门：
        - 定义过滤器的步骤：     
            1.定义一个类，实现Filter接口
            2.重写方法
            3.配置拦截路径
                1.web.xml配置方式
                2.注解的配置方式：
                    @WebFilter("/*") :括号内的路径为需要过滤的路径
         
            
## listener：监听器
    1.概念：
        1.事件：一件事情
        2.事件源：事件发生的地方
        3.监听器：一个对象
        4.注册监听：将事件，事件源，监听器绑定子啊一起，当事件源上发生某个事件后，执行监听器代码
    2.ServletComtexListener:监听ServletContext对象的创建和销毁
        1.contextDestroyed():ServletContext对象被销毁之前会调用的方法
        2.contexInitialized():ServletContext对象被创建之后会调用的方法
        