package com.yy.boot.config;

import com.yy.boot.bean.Car;
import com.yy.boot.bean.Person;
import com.yy.boot.bean.Pet;
import com.yy.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.beans.PersistenceDelegate;

//@Import({User.class,Pet.class})
//导入组件，只要有.class文件就可以导入到容器中。默认的组件名是全类名
@Configuration//配置类
//@ConditionalOnBean(name = "tom")
// 组件中有tom时下面所有组件才会被导入到容器中
//@ConditionalOnMissingBean(name = "tom")//与上面意思相反
//@ImportResource("classpath:application.yml")
//在resources目录下有一个配置文件用来写组件的，用这个注解可以使配置文件中的组件生效
//@EnableConfigurationProperties({Car.class})
//与Car中的@ConfigurationProperties注解作用相同，开启Car配置绑定功能，把这个Car组件自动注入到容器中
public class MyConfig {
    @Bean//给容器添加组件，以方法名作为组件id,返回类型就是组件类型，返回值就是组件在容器中的实例
    public User user01() {
        return new User("zhansan", 18);
    }
//
//    @Bean("tom")
//    public Pet tomcatPet() {
//        return new Pet("tomcat", 12.0);
//    }
}
