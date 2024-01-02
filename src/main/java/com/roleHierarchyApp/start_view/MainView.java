package com.roleHierarchyApp.start_view;

import java.util.Scanner;

import com.roleHierarchyApp.add_user.AddUserView;
import com.roleHierarchyApp.create_role.CreateRoleView;
import com.roleHierarchyApp.delete_role.DeleteRoleView;
import com.roleHierarchyApp.delete_user.DeleteUserView;
import com.roleHierarchyApp.display_user_and_sub_user.DisplaySubUserView;
import com.roleHierarchyApp.height.HeightView;
import com.roleHierarchyApp.number_of_users_on_top.NumberOfUsersOnTopView;

public class MainView {

	Scanner sc = new Scanner(System.in);
	public void start() {
		CreateRoleView createRoleView = new CreateRoleView();
		DeleteRoleView deleteRoleView = new DeleteRoleView();
		AddUserView addUserView = new AddUserView();
		createRoleView.addStaff(true);
		outer:while (true) {
			System.out.println("1.Add Sub role\n2.Display Role\n3.Display Users\n4.Delete Role\n5.Add User\n6.Display User And Sub User\n7.Delete User\n8. Number of users from top\n9.Height of role hierachy\n10.Exit");
			switch (sc.nextInt()) {
			case 1:{
				createRoleView.addStaff(false);
				break;
			}
			case 10:{
				break outer;
			}
			case 9:{
				new HeightView().findHeight();
				break;
			}
			case 8:{
				new NumberOfUsersOnTopView().noOfUser();
				break;
			}
			case 7:{
				new DeleteUserView().deleteUser();
				break;
			}
			case 2:{
				createRoleView.getRoles();
				break;
			}
			case 5:{
				addUserView.addUser();
				break;
			}
			case 4:{
				deleteRoleView.deleteRole();
				break;
			}	
			case 3:{
				createRoleView.getUsers();
				break;
			}
			case 6:{
				new DisplaySubUserView().displaySubUser();
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
