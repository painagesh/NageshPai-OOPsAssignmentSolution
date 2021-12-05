package com.greatlearning.service;

import com.greatlearning.model.*;


public class displayService {

	
	// Printing details for Admin Department
	public void displayAdmDetails (AdminDepartment obj, SuperDepartment Superobj) {
		
		System.out.println(" Welcome to "+obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(Superobj.isTodayAHoliday());
		System.out.println();
		
		
	}
	
	
	// Printing details for HR Department
	public void displayHRDetails (HrDepartment obj, SuperDepartment Superobj) {
		
		System.out.println(" Welcome to "+obj.departmentName());
		System.out.println(obj.doActivity());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(Superobj.isTodayAHoliday());
		System.out.println();
		
	}
	
	
	// Printing details for Tech Department
	public void displayTechDetails (TechDepartment obj, SuperDepartment Superobj) {
		
		System.out.println(" Welcome to "+obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(" "+obj.getTechStackInformation());
		System.out.println(Superobj.isTodayAHoliday());
		System.out.println();
		
		
	}
}
