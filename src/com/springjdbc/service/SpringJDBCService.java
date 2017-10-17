package com.springjdbc.service;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 默认 spring 链接数据库的方式
 * @author TongZhou
 *
 */
public class SpringJDBCService {

	/**
	 * 使用 Spring 默认的数据库方式
	 */
	@Test
	public void JDBCTest(){
		
		//创建数据库链接的数据源
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		//设置数据库的链接信息
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///adminmanger");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		//加载数据源
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		
		//执行SQL
		jdbcTemplate.execute("create table user(id int primary key auto_increment,name varchar(20))");
	}
}
