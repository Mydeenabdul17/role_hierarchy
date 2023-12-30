package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.create_role.CreateRoleView;
import com.roleHierarchyApp.delete_role.DeleteRoleView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		CreateRoleView createRoleView = new CreateRoleView();
		DeleteRoleView deleteRoleView = new DeleteRoleView();
		createRoleView.addStaff(true);
		outer:while (true) {
			System.out.println("1.Add Sub role\n2.Display Roles\n3.Delete Role\n4.Exit");
			switch (sc.nextInt()) {
			case 1:{
				createRoleView.addStaff(false);
				break;
			}
			case 4:{
				break outer;
			}	
			case 3:{
				deleteRoleView.deleteRole();
				break;
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
