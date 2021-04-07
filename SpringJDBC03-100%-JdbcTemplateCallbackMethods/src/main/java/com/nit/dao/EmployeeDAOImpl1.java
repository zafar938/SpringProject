package com.nit.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;

//@Repository("empDAO")
public class EmployeeDAOImpl1 implements IEmployeeDAO {
 public static final String GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 public static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
   
   @Autowired
   private JdbcTemplate jt;
   
   public EmployeeDAOImpl1() {
	System.out.println("EmployeeDAOImpl1-0-param constructor");
}

@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		EmployeeBO bo=jt.queryForObject(GET_EMP_BY_ENO,new RowMapper<EmployeeBO>(){

			@Override
			public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				//covert ResutlSet obj to BO class object
				EmployeeBO bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getNString(2));
				bo.setJob(rs.getString(1));
				bo.setSal(rs.getFloat(4));
				return bo;
			}
			
		}//anonymous inner class
		,eno );
		
		return bo;
	}

@Override
public List<EmployeeBO> getEmployeBydesg(String desg1, String desg2, String desg3) {
	List<EmployeeBO> listBO1=jt.query(GET_EMP_BY_DESG, 
			rs->{
				//copy RS object  records to ListBO
				List<EmployeeBO> listBO=new ArrayList();
				while(rs.next()) {
					//retrive each record to BO class obj
					EmployeeBO bo=new EmployeeBO();
					bo.setEmpNo(rs.getInt(1));
				    bo.setEname(rs.getString(2));
				    bo.setJob(rs.getString(3));
				    bo.setSal(rs.getFloat(4));
				    //add each BO class obj to list collection
				    listBO.add(bo);
				}//while
				return listBO;
			}
			
			, desg1,desg2,desg3);
	return listBO1;
 }
}//DAO class
