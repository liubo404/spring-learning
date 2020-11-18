package com.lbo.config;


import com.lbo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 包扫描方式, 指定只需要包含哪些组件
 * useDefaultFilters = false, 禁用默认过滤规则
 *
 * @author liubo
 * @date 2020/11/19
 */
@Configuration
@ComponentScan(value = "com.lbo.scans", useDefaultFilters = false, includeFilters = {
        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
public class ScanIncludeConfig {

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
