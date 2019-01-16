### 在nacos中添加配置文件
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190116195901405.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)
>这个dataId的生成规则是：（来自nacos官方文档）
<ul>
<li><code>prefix</code>&nbsp;默认为&nbsp;<code>spring.application.name</code>&nbsp;的值，也可以通过配置项&nbsp;<code>spring.cloud.nacos.config.prefix</code>来配置。</li>
<li><code>spring.profile.active</code>&nbsp;即为当前环境对应的 profile，详情可以参考&nbsp;<a href="https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-profiles.html#boot-features-profiles" se_prerender_url="complete">Spring Boot文档</a>。
<strong>注意：当 <code>spring.profile.active</code> 为空时，对应的连接符&nbsp;<code>-</code>&nbsp;也将不存在，dataId 的拼接格式变成&nbsp;<code>${prefix}.${file-extension}</code></strong></li>
<li><code>file-exetension</code>&nbsp;为配置内容的数据格式，可以通过配置项&nbsp;<code>spring.cloud.nacos.config.file-extension</code> 来配置。目前只支持&nbsp;<code>properties</code> 和 <code>yaml</code>&nbsp;类型。</li>
</ul>

### 配置内容
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190116200025708.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)

### 结果
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190116200126254.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI1NDg0MTQ3,size_16,color_FFFFFF,t_70)