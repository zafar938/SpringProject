package com.nit.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;

//@Repository("empDAO")
public class EmployeeDAOImpl3 implements IEmployeeDAO {
 public static final String GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 public static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
   
   @Autowired
   private JdbcTemplate jt;
   
   public EmployeeDAOImpl3() {
	System.out.println("EmployeeDAOImpl3-0-param constructor");
}

@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		EmployeeBO boe=jt.queryForObject(GET_EMP_BY_ENO,new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class),eno );
		
		return boe;
	}

@Override
public List<EmployeeBO> getEmployeBydesg(String desg1, String desg2, String desg3) {
	/*
	 * BeanPropertyRowMapper<EmployeeBO> rowMapper=new
	 * BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class); List<EmployeeBO>
	 * listBO=jt.query(GET_EMP_BY_DESG, new
	 * RowMapperResultSetExtractor<EmployeeBO>(rowMapper) , desg1,desg2,desg3);
	 * return listBO ;
	 */
	return jt.query(GET_EMP_BY_DESG, new RowMapperResultSetExtractor<EmployeeBO>(new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class)), 
			desg1,desg2,desg3);
	
}
	
		

}//DAO class
