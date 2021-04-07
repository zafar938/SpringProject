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

@Repository("empDAO")
public class EmployeeDAOImpl2 implements IEmployeeDAO {
 public static final String GET_EMP_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 public static final String GET_EMP_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
   
   @Autowired
   private JdbcTemplate jt;
   
   public EmployeeDAOImpl2() {
	System.out.println("EmployeeDAOImpl2-0-param constructor");
}

@Override
	public EmployeeBO getEmployeeByNo(int eno) {
		EmployeeBO boe=jt.queryForObject(GET_EMP_BY_ENO,(rs, rowNum)-> {
				//covert ResutlSet obj to BO class object
				EmployeeBO bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getNString(2));
				bo.setJob(rs.getString(1));
				bo.setSal(rs.getFloat(4));
				return bo;
			}
			
		
		,eno );
		
		return boe;
	}

@Override
public List<EmployeeBO> getEmployeBydesg(String desg1, String desg2, String desg3) {
	List<EmployeeBO> listBO=jt.query(GET_EMP_BY_DESG, new ResultSetExtractor<List<EmployeeBO>>() {

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			//copy RS object to ListBO
			List<EmployeeBO> listBO=new ArrayList();
			while(rs.next()) {
				EmployeeBO bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				//add each BO class obj to List collection
				listBO.add(bo);
			}//while
			return listBO;
		}//nethod
		
	}//annonimus class
			
			,desg1,desg2,desg3);
	return listBO;
}//method
	
		

}//DAO class
