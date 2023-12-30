package com.roleHierarchyApp.create_role;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class CreateRoleViewModel {

	private CreateRoleView view;
	public CreateRoleViewModel(CreateRoleView createRoleView) {
		this.view = createRoleView;
	}
	public boolean addStaff(Staff s) {
		RoleHierarchyRepository.getInstance().addStaff(s);
		return true;
	}

}
