package com.nit.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;

//@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
 public static final String GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 public static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
   
   @Autowired
   private JdbcTemplate jt;
   
   
   public EmployeeDAOImpl() {
	System.out.println("EmployeeDAOImpl-0-param construction");
}
@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		EmployeeBO bo=jt.queryForObject(GET_EMP_BY_ENO,new EmployeeRowMapper(),eno );
		
		return bo;
	}
	private static class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			//convert RS obajcet record to BO class obj
			EmployeeBO bo=new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
		    bo.setEname(rs.getString(2));
		    bo.setJob(rs.getString(3));
		    bo.setSal(rs.getFloat(4));
			
			return bo;
		}//mapRow
		
	
}//inner class
	@Override
	public List<EmployeeBO> getEmployeBydesg(String desg1, String desg2, String desg3) {
		// TODO Auto-generated method stub
		return null;
	}
 }//DAO class
 