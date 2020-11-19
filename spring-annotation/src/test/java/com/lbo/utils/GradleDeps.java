package com.lbo.utils;

import org.junit.Test;

/**
 * @author liubo
 * @date 2020/11/19
 */
public class GradleDeps {

    @Test
    public void test0() {
        String deps = "javax.inject:javax.inject:1\n" +
                "javax.ejb:ejb-api:3.0\n" +
                "javax.enterprise.concurrent:javax.enterprise.concurrent-api:1.0\n" +
                "javax.money:money-api:1.0.1\n" +
                "org.eclipse.persistence:javax.persistence:2.0.0\n" +
                "javax.validation:validation-api:1.0.0.GA\n" +
                "org.hibernate:hibernate-validator:4.3.2.Final\n" +
                "joda-time:joda-time:2.9.9\n" +
                "org.aspectj:aspectjweaver:1.8.9\n" +
                "org.codehaus.groovy:groovy-all:2.4.12\n" +
                "org.beanshell:bsh:2.0b5\n" +
                "org.jruby:jruby:1.7.27\n" +
                "javax.inject:javax.inject-tck:1\n" +
                "org.javamoney:moneta:1.1\n" +
                "commons-dbcp:commons-dbcp:1.4\n" +
                "org.apache.commons:commons-pool2:2.4.2\n" +
                "org.slf4j:slf4j-api:1.7.21";

        String[] lines = deps.split(System.getProperty("line.separator"));

        for (String n : lines) {
//            System.out.println("===> " + n);
            String[] groups = n.split(":");
//            System.out.println("===> " + groups[0]);
//            System.out.println("===> " + groups[1]);
//            System.out.println("===> " + groups[2]);
            String dep = String.format(" <dependency>    <groupId>%s</groupId>  <artifactId>%s</artifactId>   <version>%s</version>  </dependency>", groups[0], groups[1], groups[2]);
            System.out.println(dep);
        }
    }
}
