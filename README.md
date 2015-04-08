# spring-rmi-example

*project is exported from code.google.com/p/springrmiexample with minor modification from my side*

> This project is an example of how to set up RMI server and client with help of Spring.

This project contains 2 sub-projects:
* Spring RMI Example Server, which is web application
* Spring RMI Example Client

Server Spring configuration looks following:

```java
<bean id="helloService" class="com.etymgiko.springrmiexample.server.HelloServiceImpl">
</bean>

<bean id="rmiServiceExporter" class="org.springframework.remoting.rmi.RmiServiceExporter">
    <property name="serviceName" value="HelloService"/>
    <property name="service" ref="helloService"/>
    <property name="serviceInterface" value="com.etymgiko.springrmiexample.shared.HelloService"/>
    <!-- defaults to 1099 -->
    <property name="registryPort" value="1099"/>
</bean>
```

And Client Spring configuration looks following:

```java
<bean id="helloService" class="org.springframework.remoting.rmi.RmiProxyFactoryBean">
    <property name="serviceUrl" value="rmi://localhost:1099/HelloService"/>
    <property name="serviceInterface" value="com.etymgiko.springrmiexample.shared.HelloService"/>
</bean>
```
