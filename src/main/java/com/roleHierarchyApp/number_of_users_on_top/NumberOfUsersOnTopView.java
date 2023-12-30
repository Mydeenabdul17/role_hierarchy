package com.roleHierarchyApp.number_of_users_on_top;

import java.util.Scanner;

public class NumberOfUsersOnTopView {

	Scanner sc = new Scanner(System.in); 
	private NumberOfUsersOnTopViewModel model;
	public NumberOfUsersOnTopView() {
		model = new NumberOfUsersOnTopViewModel(this);
	}
	
	public void noOfUser() {
		System.out.println("Enter user name : ");
		int count = model.getCount(sc.nextLine());
		System.out.println("Number of users from top :"+count);
	}
}
