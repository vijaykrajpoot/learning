package com.vkrajput.db.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@Getter
@Setter
public class SpringDataSourceConfig {
	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.hikari.username}")
	private String username;

	@Value("${spring.datasource.hikari.password}")
	private String password;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;


	@Bean(name = "MySQLDataSource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(username).password(password).build();
	}

}
