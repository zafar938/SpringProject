package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.model.CitizenDetails;
@Repository("citizenDAO")
public class CitizenDAOImpl implements ICitizenDAO {
private static final String VACCINE_REGESTRATION="INSERT INTO CORONA_VACCINE VALUES(REGID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
private static final String GET_VACCINE_NAME="SELECT NAME FROM VACCINE_NAME";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insert(CitizenDetails detail) {
		int count=jt.update(VACCINE_REGESTRATION,detail.getName()
				                                 ,detail.getAddrs()
				                                 ,detail.getAadharNo()
				                                 ,detail.getPrice()
				                                 ,detail.getIncome()
				                                 ,detail.getVaccineName()
				                                 ,detail.getRemarks()
		                                         ,detail.getAge());
		return count;
	}

	@Override
	public List<String> getAllVaccineName() {
	   List<String> vaccineName=jt.query(GET_VACCINE_NAME, rs->{
		   List<String> vaccineList=new ArrayList();
		   while(rs.next()) {
			   vaccineList.add(rs.getString(1));
		   }
		   return vaccineList;
	   });
		return vaccineName;
	}

}
