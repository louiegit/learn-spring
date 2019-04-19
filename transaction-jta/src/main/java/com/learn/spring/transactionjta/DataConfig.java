package com.learn.spring.transactionjta;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

public class DataConfig {


    @Bean(name = "datasource1")
    @ConfigurationProperties("database1.datasource")
    @Primary
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "datasource2")
    @ConfigurationProperties("database2.dataUserTransactionManagersource")
    public DataSource dataSource2(){
        return DataSourceBuilder.create().build();
    }
}
