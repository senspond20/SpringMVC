package com.senshig.myapp.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.senshig.myapp"})
@EnableTransactionManagement // 아노 테이션 기반 트랜잭션 관리를 사용 합니다.
public class RootConfig {
	
	   /**
	     * 데이터소스 등록
		 * @return
		 */
//	    @Bean(destroyMethod="close")
//	    public DataSource dataSource() {
//	    	BasicDataSource dataSource = new BasicDataSource();
//			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//			dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring?serverTimezone=UTC");
//			dataSource.setUsername("root");
//			dataSource.setPassword("1234");
//			dataSource.setDefaultAutoCommit(false);


//	        HikariConfig hikariConfig = new HikariConfig();
//	        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/spring?serverTimezone=UTC");
//	        hikariConfig.setUsername("root");
//	        hikariConfig.setPassword("1234");
//	        
//	        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
//	        
//	        return dataSource;
//	    }
	    
		/**
		 * 트랜잭션 매니저 등록
		 * @return
		 */
//	    public DataSourceTransactionManager transactionManager() {
//	        return new DataSourceTransactionManager(dataSource());
//	    }
}
