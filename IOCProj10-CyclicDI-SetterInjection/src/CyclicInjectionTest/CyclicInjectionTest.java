package CyclicInjectionTest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.bean.B;

public class CyclicInjectionTest {
	
	public static void main(String[] args) {
		
		//create IOC Container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//create XmlDefibitionReader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//load and read spring bin cfg file
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		//get bean obj
		B b=factory.getBean("b1" ,B.class);
		System.out.println(b);
	}

}
