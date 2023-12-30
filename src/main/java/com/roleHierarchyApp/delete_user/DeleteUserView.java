package com.roleHierarchyApp.delete_user;

import java.util.Scanner;

public class DeleteUserView {

	Scanner sc = new Scanner(System.in);
	private DeleteUserViewModel model;
	
	public DeleteUserView() {
		model = new DeleteUserViewModel(this);
	}
	
	public void deleteUser() {
		System.out.println("Enter username to be deleted : ");
		String name = sc.nextLine();
		model.deleteUser(name);
	}
}
