package com.roleHierarchyApp.create_role;

import java.util.Scanner;

import com.roleHierarchyApp.dto.Staff;

public class CreateRoleView {

	Scanner sc = new Scanner(System.in);
	private CreateRoleViewModel model;
	public CreateRoleView() {
		model = new CreateRoleViewModel(this);
	}
	public void addStaff() {
		System.out.println("Enter the Role");
		String role = sc.next();
		Staff s = new Staff();
		s.setRole(role);
		if(model.addStaff(s)) {
			System.out.println(role);
		}
	}
}
