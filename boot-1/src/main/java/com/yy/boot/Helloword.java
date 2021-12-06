package com.yy.boot;

import com.yy.boot.bean.Pet;
import com.yy.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//主程序类
//此时默认扫描的基础包是boot包下的文件，可以使用scanBasePackages=""来更改扫描的基础包
//也可以使用@ComponentScan("") 来更改，此时@SpringBootApplication需要被注释掉，因为这个注解已经包含了@ComponentScan注解
@SpringBootApplication
public class Helloword {
    public static void main(String[] args) {
        //返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Helloword.class, args);
        //查看容器里面的组件
        String[] names =run.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
        //从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件:"+(tom01.equals(tom02)));
        MyConfig bean =run.getBean(MyConfig.class);
        System.out.println(bean);

    }
}
