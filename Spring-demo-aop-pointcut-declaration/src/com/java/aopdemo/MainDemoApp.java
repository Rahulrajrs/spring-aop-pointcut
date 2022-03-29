package com.java.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.aopdemo.dao.AccountDAO;
import com.java.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		MemberShipDAO theMemberShipDAO=context.getBean("memberShipDAO",MemberShipDAO.class);
		// call the business method
		Account theAccount=new Account();
		
		theAccountDAO.addAccount(theAccount,true);
		theAccountDAO.doWork();
		
		
		//theMemberShipDAO.addAccount();
		theMemberShipDAO.addSillyMethod();
		
		theMemberShipDAO.goTOSleep();
		//close the context
		context.close();

	}

}
