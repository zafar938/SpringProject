package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpe implements IEmployeeDAO {
	private static final String EMP_DETAIL="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	
	@Autowired
	private DataSource ds;
    
	@Override
	public List<EmployeeBO> getEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		Connection con=null; 
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listBO=null;
		try {
				 con=ds.getConnection();
				 ps=con.prepareStatement(EMP_DETAIL);
				 //set param value
				 ps.setString(1, desg1);
				 ps.setString(2, desg2);
				 ps.setString(3, desg3);
				 //execute query
				 rs=ps.executeQuery();
				 listBO=new ArrayList();
				 //process the result
				 while(rs.next()) {
					 EmployeeBO bo=new EmployeeBO();
					 bo.setEmpNo(rs.getInt(1));
					 bo.setEname(rs.getString(2));
					 bo.setJob(rs.getString(3));
					 bo.setSal(rs.getFloat(4));
					 bo.setDeptNo(rs.getInt(5));
					 
					 listBO.add(bo);
					 
				 }//while
				 
				 
			     }//try
			     catch(SQLException se) {
			    	 se.printStackTrace();
			    	 throw se;
			     }
			     catch(Exception se) {
			    	 se.printStackTrace();
			    	 throw se;
			     }
		  finally {
			  try {
			  if(rs!=null)
				  rs.close();
			  }
			  catch(SQLException se) {
				  se.printStackTrace();
			  }
			  try {
				  if(ps!=null)
					  ps.close();
			  }
			  catch(SQLException se) {
				  se.printStackTrace();
			  }
			  try {
				  if(con!=null)
					  con.close();
			  }
			  catch(SQLException se) {
				  se.printStackTrace();
			  }
				  
		  }
		return listBO;
	}

}
