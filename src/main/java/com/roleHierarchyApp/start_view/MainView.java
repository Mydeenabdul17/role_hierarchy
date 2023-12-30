package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.create_role.CreateRoleView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		new CreateRoleView().addStaff(true);
		outer:while (true) {
			System.out.println("1.Add Sub role\n2.Exit");
			switch (sc.nextInt()) {
			case 1:{
				new CreateRoleView().addStaff(false);
				break;
			}
			case 2:{
				break outer;
			}	
				

			default:{
				System.out.println("Input Mismatch");
				break;
			}
				
			}
		}
		new CreateRoleView().getRole();
		System.out.println("\nThank You");
	}

}
