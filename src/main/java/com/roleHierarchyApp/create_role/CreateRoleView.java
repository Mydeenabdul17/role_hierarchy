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
		String role;
		Staff s;
		if(b) {
			System.out.println("Enter the root role");
			role = sc.next();
			s =new Staff();
			s.setRole(role);
		}else {
			System.out.println("Enter the Role");
			role = sc.next();
			System.out.println("Enter reporting to role name ");
			String reportingRole = sc.next();
			s = new Staff();
			s.setRole(role);
			s.setReportingRole(reportingRole);
		}
		model.addStaff(s);
//		if(model.addStaff(s)) {
//			System.out.println(role);
//		}
	}
	public void getRole() {
		List<Staff> staff = model.getRole();
		for (Staff staff2 : staff) {
			System.out.print(staff2.getRole()+" ");
		}
	}
}
