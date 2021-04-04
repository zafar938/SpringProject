package com.nit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPLOYEE_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMPLOYEE_SALARY_BY_EMPNO="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPLOYEE_DETAILS_BY_EMPNO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMPLOYEE_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
	private static final String GET_EMPLOYEE_DETAILS_BY_SALARYRANGE="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL>=? AND SAL<=?";
	private static final String INSERT_EMPLOYEE_DETAILS="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL)VALUES(SEQ_EMP.NEXTVAL,?,?,?)";
	private static final String UPDATE_EMPLOYEE_DETAILS="UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private static final String DELETE_EMPLOYEE_DETAILS="DELETE FROM EMP WHERE SAL>=? and SAL<=?";
	
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

	@Override
	public float getEmployeeSalaryByEno(int eno) {
		float salary=jt.queryForObject(GET_EMPLOYEE_SALARY_BY_EMPNO,Float.class,eno);
		return salary;
	}

	@Override
	public Map<String, Object> getEmployeeDetailByEno(int eno) {
		Map<String,Object> map=jt.queryForMap(GET_EMPLOYEE_DETAILS_BY_EMPNO,eno);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDegs(String desg1, String desg2, String desg3) {
		List<Map<String,Object>> list=jt.queryForList(GET_EMPLOYEE_DETAILS_BY_DESG,desg1,desg2,desg3);
		return list;
	}

	@Override
	public SqlRowSet getEmployeeDetailsBySalaryRange(float startSalary, float endSalary) {
		SqlRowSet rowSet=jt.queryForRowSet(GET_EMPLOYEE_DETAILS_BY_SALARYRANGE, startSalary,endSalary);
		return rowSet;
	}

	@Override
	public int insertEmployee(String ename, String desg, float salary) {
		int count=jt.update(INSERT_EMPLOYEE_DETAILS,ename,desg,salary);
		return count;
	}

	@Override
	public int updateEmployeeSalary(int eno, float newSalary) {
		int count=jt.update(UPDATE_EMPLOYEE_DETAILS,newSalary,eno);
		return count;
	}

	@Override
	public int deleteEmployeeSalaryRange(float startSalary, float endSalary) {
		int count=jt.update(DELETE_EMPLOYEE_DETAILS,startSalary,endSalary);
		return count;
	}

}
