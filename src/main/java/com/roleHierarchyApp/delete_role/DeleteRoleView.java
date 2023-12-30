package com.roleHierarchyApp.delete_role;

import java.util.Scanner;

public class DeleteRoleView {

	Scanner sc = new Scanner(System.in);
	private DeleteRoleViewModel deleteRoleViewModel;
	public DeleteRoleView() {
		this.deleteRoleViewModel = new DeleteRoleViewModel(this);
	}
	
	public void deleteRole() {
		System.out.println("Enter the role to be deleted");
		String role = sc.nextLine();
		System.out.println("Enter the role to be transferred");
		String aRole = sc.nextLine();
		deleteRoleViewModel.deleteRole(role,aRole);
	}
}
