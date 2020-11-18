package com.lbo.scans;

import com.lbo.config.ScanIncludeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liubo
 * @date 2020/11/19
 */
public class ScanIncludeConfigTest {

    @Test
    public void test0() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanIncludeConfig.class);

        String[] beanNamese = applicationContext.getBeanDefinitionNames();

        for (String name : beanNamese) {
            System.out.println("--> name=" + name);
        }

    }
}
