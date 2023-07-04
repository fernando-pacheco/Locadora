package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseUtils {
    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=Locadora");
        datasource.setUsername("sa");
        datasource.setPassword("4210");
        datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        return datasource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}

