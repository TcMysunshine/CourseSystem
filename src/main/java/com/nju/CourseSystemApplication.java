package com.nju;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@MapperScan("com.nju.dao.mapper" )
@SpringBootApplication
public class CourseSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseSystemApplication.class, args);
    }

}

