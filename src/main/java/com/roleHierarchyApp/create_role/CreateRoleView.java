package com.roleHierarchyApp.create_role;

import java.util.List;
import java.util.Scanner;

import com.roleHierarchyApp.dto.Staff;

public class CreateRoleView {

	Scanner sc = new Scanner(System.in);
	private CreateRoleViewModel model;
	public CreateRoleView() {
		model = new CreateRoleViewModel(this);
	}
	public void addStaff(boolean b) {
		
		if(b) {
			System.out.println("Enter the root role");
			String role = sc.nextLine();
			Staff s =new Staff();
			s.setRole(role);
			model.addStaff(s);
		}else {
			System.out.println("Enter the Role");
			String role = sc.nextLine();
			System.out.println("Enter reporting to role name ");
			String reportingRole = sc.nextLine();
			Staff s = new Staff();
			s.setRole(role);
			s.setReportingRole(reportingRole);
			model.addStaff(s);
		}
		
//		if(model.addStaff(s)) {
//			System.out.println(role);
//		}
	}
	public void getRoles() {
		List<String> staff = model.getRoles();
		for (String string : staff) {
			System.out.print(string+" ");
		}
		System.out.println();
	}
}
