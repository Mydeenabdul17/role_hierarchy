package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.create_role.CreateRoleView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		CreateRoleView createRoleView = new CreateRoleView();
		createRoleView.addStaff(true);
		outer:while (true) {
			System.out.println("1.Add Sub role\n2.Display Roles\n3.Exit");
			switch (sc.nextInt()) {
			case 1:{
				createRoleView.addStaff(false);
				break;
			}
			case 3:{
				break outer;
			}	
				
			case 2:{
				createRoleView.getRoles();
				break;
			}
			default:{
				System.out.println("Input Mismatch");
				break;
			}
				
			}
		}
//		new CreateRoleView().getRole();
		System.out.println("\nThank You");
	}

}
