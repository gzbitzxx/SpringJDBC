package com.springjdbc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 通过配置文件链接数据库
 * @author TongZhou
 *
 */
// 使用 Spring 的 JUnit 的测试
//通过 ContextConfiguration 读取配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringJDBCService1 {
	
	@Autowired
	//注入 从数据库中配置 id="jdbcTemplate"
	@Qualifier("jdbcTemplate")
	//数据库链接对象
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 创建数据库 
	 */
	@Test
	public void dome(){
		
		//执行 SQL
		jdbcTemplate.execute("create table dashuju (id int primary key auto_increment,name varchar(20))");
	}
}
