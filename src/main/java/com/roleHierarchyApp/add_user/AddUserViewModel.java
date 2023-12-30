package com.roleHierarchyApp.add_user;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class AddUserViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private AddUserView addUserView;

	public AddUserViewModel(AddUserView addUserView) {
		this.addUserView = addUserView;
	}

	public Staff getStaff(String role) {
		return repository.getRepoRole(role);
	}

	public void setName(Staff s) {
		repository.changeStaff(s);
	}
	
}
