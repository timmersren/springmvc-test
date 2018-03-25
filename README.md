# springmvc-test

## demo1

### springmvc1.xml

在demo1中，主要编写了springmvc的helloworld。其中包括使用springmvc配置文件的形式配置HandlerMapping和HandlerAdapter（springmvc1.xml文件）。

其中配置HandlerMapping列举了两种：

1. BeanNameUrlHandlerMapping（通过url寻找与其对应的Handler），这种形式的HandlerMapping要求必须在配置文件中配置Handler的bean，并且在这个bean中要给出name属性。
2. SimpleUrlHandlerMapping（通过property标签给该映射器的mappings属性注入值），所注入的key即使请求的url，value即配置的Handler的bean的id。同样，该映射器也需要Handler在配置文件中配置。

配置HandlerAdapter列举两种

1. SimpleControllerHandlerAdapter：要求我们编写的Handler必须实现Controller接口才能被该适配器执行。
2. HttpRequestHandlerAdapter：要求我们编写的Handler 必须实现HttpRequestHandler接口才能被该适配器执行。

### springmvc2.xml

最后，演示了开发中最常用的形式，通过注解的形式配置HandlerMapping和HandlerAdapter。使用mvc:annotation-driven标签来开启springmvc的注解配置。同时要注意的是，如果使用注解配置，需要使用“context:component-scan base-package=xxx.xx.xx”标签开启spring的注解扫描，以便让spring能扫描到我们在类上边标识的我们编写的Handler（Controller）。