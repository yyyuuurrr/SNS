package com.cona.sns.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.cona.sns.*")
public class DatebaseConfig {

}
