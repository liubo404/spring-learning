package com.lbo.config;


import com.lbo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 包扫描方式
 *
 * @author liubo
 * @date 2020/11/19
 */
@Configuration
@ComponentScan(value = "com.lbo.scans")
public class ScanConfig {

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
