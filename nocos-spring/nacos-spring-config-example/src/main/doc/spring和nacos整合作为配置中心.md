@[toc]

### 概述
>nacos的官网：https://nacos.io/zh-cn/docs/quick-start-spring.html，这里的一些概念不再过多 描述，这里只是提供使用。

>https://github.com/wuxiaobo000111/alibaba-learn.git 
>这个是项目地址，项目一直会持续更新中。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190112133927682.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)
>alibaba-group提供了同一的maven jar包管理，commons提供了一些共用方法的支持，使用了hutool的开源框架使用。nacos-spring-config-example提供了nacos作为web项目的配置中心的示例代码。这里主要是将数据库配置作为配置中心的配置项。

### 配置文件
> nacos配置文件
```xml	
<?xml version="1.0" encoding="UTF-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:nacos="http://nacos.io/schema/nacos"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://nacos.io/schema/nacos http://nacos.io/schema/nacos.xsd
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">


    <!--nacos配置，这里是使用配置文件的方式,这只是其中的一种方式-->
    <!--开启注解-->
    <nacos:annotation-driven></nacos:annotation-driven>
    <!--指定nacos配置地址-->
    <nacos:global-properties server-addr="localhost:8848"/>
    <!--指定dataId,group-id, 是否是自动刷新-->
    <nacos:property-source data-id="naocs-spring-config" group-id="DEFAULT_GROUP" auto-refreshed="true"/>
</beans>
```
>数据库的配置文件
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd
http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean class="com.alibaba.druid.pool.DruidDataSource" id="dataSource" destroy-method="close">
        <!--为了配置方便，暂时只有是这么多，如果有其他的配置项，大家可以自己添加-->
        <property name="driverClassName" value="${jdbc.driverClassName}"></property>
        <property name="username" value="${jdbc.username}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="url" value="${jdbc.url}"></property>
    </bean>

    <bean class="com.alibaba.druid.filter.logging.Slf4jLogFilter" id="logFilter">
        <property name="statementExecutableSqlLogEnable" value="true"/>
    </bean>

    <bean class="org.mybatis.spring.SqlSessionFactoryBean" id="sqlSessionFactory">
        <property name="dataSource" ref="dataSource"/>
        <property name="mapperLocations" value="classpath*:com/bobo/nocos/spring/config/shopping/xml/*.xml"/>
        <property name="configLocation" value="classpath:mybatis-setting.xml"/>
    </bean>

    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
        <property name="basePackage" value="com.bobo.nocos.spring.config.shopping" />
    </bean>

    <bean class="org.springframework.jdbc.datasource.DataSourceTransactionManager" id="transactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>

    <tx:advice id="txAdviceCms" transaction-manager="transactionManager">
        <!-- 定义方法的过滤规则 -->
        <tx:attributes>
            <!-- 所有方法都使用事务 -->
            <tx:method name="*" propagation="REQUIRED" rollback-for="java.lang.Exception"/>
            <!-- 定义所有get开头的方法都是只读的 -->
            <tx:method name="get*" propagation="REQUIRES_NEW" read-only="true" />
            <tx:method name="select*" propagation="REQUIRES_NEW" read-only="true" />
            <tx:method name="initParam" propagation="REQUIRES_NEW" read-only="true" />
        </tx:attributes>
    </tx:advice>
</beans>
```
```xml
   <property name="driverClassName" value="${jdbc.driverClassName}"></property>
        <property name="username" value="${jdbc.username}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="url" value="${jdbc.url}"></property>
```
>这里的数据库配置项是配置在nocos中。配置如下所示：
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20190112134446572.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)

### 结果
>启动项目，然后访问
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20190112135133287.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20190112135143332.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)