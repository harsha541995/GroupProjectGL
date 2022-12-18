package main;

import subsidaryClasses.*;
import Super.Super;

public class Main {

	public static void main (String args[]) {
		
	
	admin NewAdmin = new admin();
	HR NewHR = new HR();
	tech Newtech = new tech();

    Super AllDepartments[] = new Super[] {NewAdmin,NewHR,Newtech}; // creating an array of objects of the class super                
    
    for (int i = 0; i < AllDepartments.length; i++) {
       
    System.out.println("Welcome to "+AllDepartments[i].departmentName());
    if(AllDepartments[i]==NewHR) {
        System.out.println(NewHR.doActivity()); 
    }
    System.out.println(AllDepartments[i].getTodaysWork()); 
    System.out.println(AllDepartments[i].getWorkDeadline()); 
    if(AllDepartments[i]==Newtech) {
        System.out.println(Newtech.getTechStackInformation()); 
    }
    System.out.println(AllDepartments[i].isTodayAHoliday()); 

    
    System.out.println(); 
    
    }
    
}
	}