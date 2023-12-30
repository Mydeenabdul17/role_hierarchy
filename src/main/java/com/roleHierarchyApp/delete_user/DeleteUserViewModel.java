package com.roleHierarchyApp.delete_user;

import java.util.List;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class DeleteUserViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private DeleteUserView deleteUserView;

	public DeleteUserViewModel(DeleteUserView deleteUserView) {
		this.deleteUserView = deleteUserView;
	}

	public void deleteUser(String name) {
		Staff current = repository.getRepoRole(name);
		List<Staff> staff = repository.getStaff(name);
		for (Staff staff2 : staff) {
			staff2.setReportingRole(current.getReportingRole());
			repository.changeStaff(staff2);
		}
	}
	
	
}
