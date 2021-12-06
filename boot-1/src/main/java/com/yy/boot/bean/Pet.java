package com.yy.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@ToString//toString方法
@Data//get和set方法
@NoArgsConstructor
@AllArgsConstructor//无参构造器
public class Pet {
//    @Value("${pet.name}")
    private String name;
//    @Value("${pet.weight}")
    private Double weight;
}
