package com.roleHierarchyApp.number_of_users_on_top;

import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class NumberOfUsersOnTopViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private NumberOfUsersOnTopView view;

	public NumberOfUsersOnTopViewModel(NumberOfUsersOnTopView view) {
		this.view = view;
	}

	public int getCount(String name) {
		return repository.getCount(name);
		
	}
	
}
