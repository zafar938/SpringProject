package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.model.CitizenDetails;
@Repository("citizenDAO")
public class CitizenDAOImpl implements ICitizenDAO {
private static final String VACCINE_REGESTRATION="INSERT INTO CORONA_VACCINE VALUES(REGID_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
	
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
				                                 ,detail.getRemarks());
		return count;
	}

}
