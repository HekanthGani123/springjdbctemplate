package com.girmiti.springjdbcDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
      
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    
	
	  int status=dao.saveEmployee(new Employee(5971,"GnanaPrasad",55000));
	  System.out.println("Data inserted to database:"+status);
	 
          
	/*
	 * int status1=dao.updateEmployee(new Employee(102,"Sonoo",15000));
	 * System.out.println(status1);
	 */
      
          
	/*
	 * Employee e=new Employee(); e.setId(102);
	 * 
	 * 
	 * int status3=dao.deleteEmployee(e);
	 * System.out.println("One record deleted from database: "+ status3);
	 */
      
}  
  
}  