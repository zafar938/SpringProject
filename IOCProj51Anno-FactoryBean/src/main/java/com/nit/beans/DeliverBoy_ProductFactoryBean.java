package com.nit.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbpFb")
public class DeliverBoy_ProductFactoryBean implements FactoryBean<Product> {
     
	@Value("${prod.type}")
	private String prodType;
	
	

	@Override
	public Product getObject() throws Exception {
		System.out.println("DeliverBoy_ProductFactoryBean.getObject()");
		if(prodType.equalsIgnoreCase("eletronic")) {
			EletronicProduct eprod=new EletronicProduct("110v","*****");
			eprod.setPid(1001);eprod.setPname("TV");
			return eprod;
		}
		else if(prodType.equalsIgnoreCase("automobile")) {
			AutomobileProduct aprod=new AutomobileProduct("Bus",1500);
			aprod.setPid(1002);aprod.setPname("Bus");
			return aprod;
		}
		else {
		   return null;
		}
	}//method

	@Override
	public Class<?> getObjectType() {
		System.out.println("DeliverBoy_ProductFactoryBean.getObjectType()");
		return Product.class;
	}
   @Override
   public boolean isSingleton() {
	   System.out.println("DeliverBoy_ProductFactoryBean.isSingleton()");
	return true;
   }
	
}
