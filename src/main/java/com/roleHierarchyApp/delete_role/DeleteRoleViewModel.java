package com.roleHierarchyApp.delete_role;

import java.util.List;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class DeleteRoleViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private DeleteRoleView deleteRoleView;

	public DeleteRoleViewModel(DeleteRoleView deleteRoleView) {
		this.deleteRoleView = deleteRoleView;
	}

	public void deleteRole(String role, String aRole) {
		Staff tRole = repository.getRepoRole(aRole);
		if(tRole.getReportingRole().equals(role)) {
			repository.changeRepoRole(tRole,repository.getRepoRole(role).getReportingRole());	
		}
		List<Staff> s = repository.getStaff(role);
		for (Staff staff : s) {
			repository.changeRepoRole(staff, aRole);
		}
	}
	
}
