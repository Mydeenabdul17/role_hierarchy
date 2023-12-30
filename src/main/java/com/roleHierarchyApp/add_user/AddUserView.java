package com.roleHierarchyApp.add_user;

import java.util.Scanner;

import com.roleHierarchyApp.dto.Staff;

public class AddUserView {

	Scanner sc = new Scanner(System.in);
	private AddUserViewModel addUserViewModel;
	
	public AddUserView() {
		addUserViewModel = new AddUserViewModel(this);
	}
	public void addUser() {
		System.out.println("Enter User Name");
		String name = sc.nextLine();
		System.out.println("Enter the Role");
		String role = sc.nextLine();
		Staff s =addUserViewModel.getStaff(role);
		s.setName(name);
		addUserViewModel.setName(s);
	}
}
