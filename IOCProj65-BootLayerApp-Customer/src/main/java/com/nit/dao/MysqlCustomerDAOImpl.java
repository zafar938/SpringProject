package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nit.bo.CustomerBo;

//@Primary
@Repository("mysqlCustDAO")
//@Component("mysqlCustDAO")
public class MysqlCustomerDAOImpl implements ICustomerDAO {
	
	private static final String  INSERT_INTO_CUSTLAYER="INSERT INTO LAYERED_CUSTOMER(CNAME,CADD,PAMT,TIME,RATE,INTRAMT) VALUES(?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	

	@Override
	public int insert(CustomerBo bo) throws Exception {
	   //create Connection
		Connection con=ds.getConnection();
		//create prepared Statement
		PreparedStatement ps=con.prepareStatement(INSERT_INTO_CUSTLAYER);
		//set parameter values
		ps.setNString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6, bo.getIntrAmt());
		
		//execute Query
		int count=ps.executeUpdate();
		
		//close connection
		ps.close();
		con.close();

		return count;
	}

}
