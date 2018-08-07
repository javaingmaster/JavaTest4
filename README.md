# 运行build.sh

## 注：
1. java容器延迟15秒输出，请稍等..
2. 为了简洁就不在applicationContext-mybatis.xml中另外配置，
但是在spring配置文件中已经使用
<property name="configLocation" value="classpath:applicationContext-mybatis.xml"></property>
引用了applicationContext-mybatis.xml文件。
3. 回滚的测试使用了app.java（主类）中的film，代码里有注释
4. 在测试回滚的时候会输出throw异常信息。


## 出现的问题：
1. 有关参数都在环境变量中读取
