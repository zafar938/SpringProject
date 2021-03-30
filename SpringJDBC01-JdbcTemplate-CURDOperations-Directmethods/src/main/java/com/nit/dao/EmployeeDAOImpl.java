package com.nit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPLOYEE_COUNT="SELECT COUNT(*) FROM STUDENT";
	private JdbcTemplate jt;
     
	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDAOImpl.1-param constructor");
		this.jt = jt;
	}

	@Override
	public int getEmployeesCount() {
		int count=jt.queryForObject(GET_EMPLOYEE_COUNT, Integer.class);
		return count;
	}

}
