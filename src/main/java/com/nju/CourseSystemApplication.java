package com.nju;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@MapperScan("com.nju.dao.mapper" )
@SpringBootApplication
public class CourseSystemApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(CourseSystemApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(CourseSystemApplication.class, args);
    }

}

