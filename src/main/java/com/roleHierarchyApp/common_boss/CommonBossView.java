package com.roleHierarchyApp.common_boss;

import java.util.Scanner;

public class CommonBossView {

	Scanner sc = new Scanner(System.in);
	private CommonBossViewModel model;
	
	public CommonBossView () {
		model = new CommonBossViewModel(this);
	}
	
	public void findBoss() {
		System.out.println("Enter user 1 :");
		String user1 = sc.nextLine();
		System.out.println("Enter user 2 :");
		String user2 = sc.nextLine();
		String boss = model.findBoss(user1,user2);
		System.out.println("Top Most Common Boss : "+boss);
	}
}
