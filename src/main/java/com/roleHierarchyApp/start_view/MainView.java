package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.create_role.CreateRoleView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		outer:while (true) {
			System.out.println("1.create role\n2.Exit");
			switch (sc.nextInt()) {
			case 1:{
				new CreateRoleView().addStaff();
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
		System.out.println("Thank You");
	}

}
