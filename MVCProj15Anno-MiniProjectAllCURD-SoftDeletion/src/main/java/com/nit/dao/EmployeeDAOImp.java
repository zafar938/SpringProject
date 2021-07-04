package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.model.Emplyee;
@Repository("empDAO")
public class EmployeeDAOImp implements EmployeeDAO {
private static final String GET_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP1 WHERE STATUS NOT IN('INACTIVE')";
private static final String GET_EMP_DETAILS_BY_ENO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP1 WHERE EMPNO=? AND STATUS NOT IN('INACTIVE')";
private static final String UPDATE_EMP_DETAILS_BY_ENO="UPDATE EMP1 SET ENAME=?,JOB=?,SAL=? WHERE EMPNO=? AND STATUS NOT IN('INACTIVE')";
private static final String DELETE_EMP_DETAILS_BY_ENO="UPDATE EMP1 SET STATUS='INACTIVE'  WHERE EMPNO IN ";
    @Autowired
	private JdbcTemplate jt;
    
	@Override
	public List<Emplyee> getAllEmployeeDetails() {
	 List<Emplyee> listEmps=jt.query(GET_EMP_DETAILS, 
			                                  rs->{
			                                	List<Emplyee> empList=new ArrayList();
			                                	while(rs.next()) {
			                                		Emplyee emp=new Emplyee();
			                                		emp.setEmpNo(rs.getInt(1));
			                                		emp.setEname(rs.getString(2));
			                                		emp.setJob(rs.getString(3));
			                                		emp.setSal(rs.getFloat(4));
			                                		empList.add(emp);
			                                	}//while
			                                	return empList;
			                                  }
			                                  );
		return listEmps;
	}

	@Override
	public Emplyee getEmployeeDetailsById(int eno) {
		Emplyee emp=jt.queryForObject(GET_EMP_DETAILS_BY_ENO, (rs,index)->{
			
			Emplyee e1=new Emplyee();
			e1.setEmpNo(rs.getInt(1));
			e1.setEname(rs.getString(2));
			e1.setJob(rs.getString(3));
			e1.setSal(rs.getFloat(4));
			return e1;
		},eno);
		return emp;
	}

	@Override
	public int UpdateEmployeeDetailsByEno(Emplyee emp) {
		// TODO Auto-generated method stub
		int count=jt.update(UPDATE_EMP_DETAILS_BY_ENO,emp.getEname()
				                                      ,emp.getJob()
				                                      ,emp.getSal(),
				                                       emp.getEmpNo());
		return count;
	}


	@Override
	public int deleteEmployeeByNo(String cond) {
		int count=jt.update(DELETE_EMP_DETAILS_BY_ENO+cond);
		return count;
	}

}
