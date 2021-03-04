package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.bo.ProductBO;

@Component("mysqlCustDAO")
public class MysqlProductDAOImple implements IProductDAO {
	private static final String PRODUCT_INSERT="INSERT INTO PRODUCT_DETAILS(PNAME,TYPE,QTY,BASEPRICE,MRP)VALUES(?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	  
	@Override
	public int insert(ProductBO bo) throws Exception {
		//create connection 
		Connection con=ds.getConnection();
		//create PreparedStatement
		PreparedStatement ps=con.prepareStatement(PRODUCT_INSERT);
		//set param value
		ps.setString(1, bo.getPname());
		ps.setString(2, bo.getType());
		ps.setFloat(3, bo.getQty());
		ps.setFloat(4, bo.getBaseprice());
		ps.setFloat(5, bo.getMrp());
		
		//execute qyery
		int count=ps.executeUpdate();
		
	     //close stream
		ps.close();
		con.close();
		
		return count;
	}

}
