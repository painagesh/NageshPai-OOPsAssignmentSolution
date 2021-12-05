package com.greatlearning.main;


import com.greatlearning.model.*;
import com.greatlearning.service.*;



public class Main {

	public static void main(String[] args) {
	
		
		//Creating objects
		SuperDepartment SuperObj = new SuperDepartment();
		AdminDepartment AdminObj = new AdminDepartment();
		HrDepartment HRObj = new HrDepartment();
		TechDepartment TechObj = new TechDepartment();
		displayService dispObj = new displayService();
		
		
		//Calling methods within respective classes, to print Department details
		dispObj.displayAdmDetails(AdminObj, SuperObj);	
		dispObj.displayHRDetails(HRObj, SuperObj);
		dispObj.displayTechDetails(TechObj, SuperObj);
		
	}

}
