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

import com.nit.bo.CustomerBO;

@Repository("custDAO")
public class CustomerDAOImpe implements ICustomerDAO {
	private static final String GET_CUST_DETAILS="SELECT CNO,CNAME,CADD,BILLAMT FROM CUSTOMER WHERE BILLAMT<?"; 
	@Autowired
    private DataSource ds;
	
	@Override
	public List<CustomerBO> getCustomerByDetail(float cost) throws Exception {
		 List<CustomerBO> listBO=null;
			try(Connection con=ds.getConnection()){
			try(PreparedStatement ps=con.prepareStatement(GET_CUST_DETAILS)){
				//set param value
				ps.setFloat(1, cost);
			try(ResultSet rs=ps.executeQuery()){
				listBO=new ArrayList();
				 while(rs.next()) {
					 CustomerBO bo=new CustomerBO();
					 bo.setCno(rs.getInt(1));
					 bo.setCname(rs.getString(2));
					 bo.setCaddress(rs.getString(3));
					 bo.setBillAmt(rs.getFloat(4));
					 listBO.add(bo);
				 }
				
			}//try3
				
			}//try2
			
		}//try1
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		
		return listBO;
	}

}
