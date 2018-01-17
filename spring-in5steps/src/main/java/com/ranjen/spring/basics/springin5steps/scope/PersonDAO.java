package com.ranjen.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//Component is very generic. Repository,Service and Controller is specific annotation of Component. Changing this will
//not affect anything but will help to categorize and easy to look later when using AOP,Spring can understand and
//easily throw exception related to it , eg JDBC Exception for repository annotation.
//Since this getting from db so can change to Repository annotation. 
@Repository
//CS: When autowired dependency is prototype , but the bean using that dependency is not prototype, how you do that : using proxy
public class PersonDAO {

	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
