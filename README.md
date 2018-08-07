# 运行build.sh

## 注：
1. java容器延迟15秒输出，请稍等..
2. 为了简洁就不在applicationContext-mybatis.xml中另外配置，
但是在spring配置文件中已经使用
<property name="configLocation" value="classpath:applicationContext-mybatis.xml"></property>
引用了applicationContext-mybatis.xml文件。
3. 回滚的测试使用了app.java（主类）中的film，代码里有注释
4. 碰到一个奇怪的问题，在application.xml文件中同时引用db.properties和环境变量的时候
<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer" />
和
<context:property-placeholder location="classpath:db.properties" file-encoding="UTF-8"/>
的顺序不同会导致引用变量失败的错误，然而在xml中按住ctrl会查找到变量值。

