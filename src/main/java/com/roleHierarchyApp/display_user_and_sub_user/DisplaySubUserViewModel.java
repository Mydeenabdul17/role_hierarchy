package com.roleHierarchyApp.display_user_and_sub_user;

import java.util.List;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class DisplaySubUserViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private DisplaySubUserView displaySubUserView;

	public DisplaySubUserViewModel(DisplaySubUserView displaySubUserView) {
		this.displaySubUserView = displaySubUserView;
	}

	public List<Staff> displaySubUser() {
		return repository.getAllStaff();
	}

	public List<Staff> getStaff(Staff staff) {
		return repository.getStaffByReportingRole(staff.getRole());
	}
	
}
