package com.lbo.config;


import com.lbo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 包扫描方式,排除controller
 *
 * @author liubo
 * @date 2020/11/19
 */
@Configuration
@ComponentScan(value = "com.lbo.scans", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})})
public class ScanExcludeConfig {

    /**
     * 给容器中注册一个bean,类型为返回值的类型，默认方法名作为id
     *
     * @return
     */
    @Bean
    public Person person() {
        return new Person("李四", 20);
    }


}
