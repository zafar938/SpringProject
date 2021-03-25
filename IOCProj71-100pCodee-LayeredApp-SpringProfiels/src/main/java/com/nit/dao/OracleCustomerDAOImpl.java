package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nit.bo.CustomerBo;

@Repository("oracleDAO")
@Profile({"prod","uat"})
public class OracleCustomerDAOImpl implements ICustomerDAO {

private static final String INSERT_INTO_CUSTLAYER="INSERT INTO LAYERED_CUSTOMER VALUES(SEQ_CNO.NEXTVAL,?,?,?,?,?,?)";
    @Autowired
	private DataSource ds;
	
	

	public OracleCustomerDAOImpl() {
		System.out.println("OracleCustomerDAOImpl.0-param constructor");
	}



	@Override
	public int insert(CustomerBo bo) throws Exception {
		//create connection object
	   Connection  con=ds.getConnection();
	   
	   //create PreparedStatement obj
	   PreparedStatement ps=con.prepareStatement(INSERT_INTO_CUSTLAYER);
	   
	   //set parameter Value
	    ps.setString(1, bo.getCname());
	    ps.setString(2, bo.getCadd());
	    ps.setFloat(3, bo.getPamt());
	    ps.setFloat(4, bo.getRate());
	    ps.setFloat(5, bo.getTime());
	    ps.setFloat(6, bo.getIntrAmt());
	    
	    //execute Query
	    int count=ps.executeUpdate();
	    
	    //close jdbc object
	    ps.close();
	    con.close();
		return count;
	}

}
