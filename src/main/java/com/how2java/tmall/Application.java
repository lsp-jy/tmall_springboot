package com.how2java.tmall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);    	
    }


    @Configuration
    @EnableDubbo(scanBasePackages = "com.how2java.tmall.service.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static public class ProviderConfiguration {

    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.how2java.tmall.service")
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"com.how2java.tmall.web"})
    static public class ConsumerConfiguration {

    }
}
