package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.add_user.AddUserView;
import com.roleHierarchyApp.create_role.CreateRoleView;
import com.roleHierarchyApp.delete_role.DeleteRoleView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		CreateRoleView createRoleView = new CreateRoleView();
		DeleteRoleView deleteRoleView = new DeleteRoleView();
		AddUserView addUserView = new AddUserView();
		createRoleView.addStaff(true);
		outer:while (true) {
			System.out.println("1.Add Sub role\n2.Display Roles\n3.Delete Role\n4.Add User\n5.Exit");
			switch (sc.nextInt()) {
			case 1:{
				createRoleView.addStaff(false);
				break;
			}
			case 5:{
				break outer;
			}
			case 4:{
				addUserView.addUser();
				break;
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
