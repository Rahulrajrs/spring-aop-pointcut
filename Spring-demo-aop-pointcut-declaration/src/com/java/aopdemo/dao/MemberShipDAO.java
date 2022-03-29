package com.java.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
	
	
	/*public void addAccount(){
		
		System.out.println(getClass()+" DOING MY DB WORK:ADDING AN ACCOUNT");
	}
*/
public boolean addSillyMethod(){
		
		System.out.println(getClass()+" DOING MY DB WORK:ADDING AN ACCOUNT");
		
		return true;
	}

public void goTOSleep(){
	
	System.out.println(getClass()+"Iam going to sleep now");
}

}
