SSM整合开发思路：
springmvc：视图层，界面层，负责接收请求，显示处理结果的
spring:业务层，管理service,dao,工具类对象的
mybatis:持久层，访问数据库的

用户发起请求-->springmvc接收--spring中的service对象--Mybatis处理数据

SSM整合也叫作SSI（ibatis是mybatis的前身），整合中有容器
1.springmvc容器，管理controller对象的
2.spring容器，管理service,dao,工具类对象的
我们要做的是，把要使用的对象交给合适的容器创建，管理
    把controller以及web相关的对象交给springmvc管理，这些web用的对象写到springmvc配置文件中
    service,dao对象定义在spring配置文件中，让spring管理这些对象

springmvc容器和spring容器是有关系的，已经确立好的
springmvc容器是spring容器的子容器，类似于Java中的继承
子子容器中的controller可以访问父容器中的service对象，就可以实现controller使用service对象

实现步骤：
1.新建maven web项目
2.加入相关的依赖
3.写web.xml
    1）注册DispatcherServlet,目的：1.创建springmvc容器对象，才能创建controller对象
                                 2.创建的是servlet，才能接收用户的请求
    2）注册spring的监听器，ContextLoaderListener,
        目的：创建spring容器对象，才能创建service,dao等对象
    3）注册字符集过滤器，解决Post请求乱码问题

4.创建包，controller包，service,dao...
5.写spring,springmvc,mybatis的配置文件
    1）springmvc配置文件
    2）spring配置文件
    3）mybatis主配置文件
    4）数据库的属性配置文件xxx.properties
6.写代码