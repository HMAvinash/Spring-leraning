package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectiontest
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Resource res=null;
BeanFactory factory=null;
Object obj=null;
WishMessageGenerator generator=null;
//locate the spring bean configration file
res=new FileSystemResource("src/com/nt/cfgs/application-context.xml");
//the below statement is used tocreate IOC container which will create the object of the class
factory=new XmlBeanFactory(res);
//the below statement tells for which class the object needs to be created.
obj=factory.getBean("wish");
//the created object will be type casted to the correct class
generator=(WishMessageGenerator)obj;
//calling the method of tthe class with the reference variable of the class
System.out.println("Message::"+generator.generateMessage("Avinash"));
}

}
