package com.vkrajput.db.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

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

	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(username)
				.password(password).build();
	}

}