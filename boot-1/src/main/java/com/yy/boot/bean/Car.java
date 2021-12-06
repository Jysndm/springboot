package com.yy.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//只有在容器中的组件，才会拥有springboot提供的功能
@Component
@ConfigurationProperties(prefix = "mycar" )
@ToString//toString方法
@Data//get和set方法
@NoArgsConstructor
@AllArgsConstructor//无参构造器
public class Car {
    private String brand;//品牌
    private Integer price;//价格
}
