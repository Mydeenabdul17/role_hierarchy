package com.roleHierarchyApp.create_role;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		roles.add("CEO");
		List<Staff> role = RoleHierarchyRepository.getInstance().getStaff("CEO");
		Queue<List<Staff>> q = new LinkedList<>();
		q.offer(role);
		while(q.size()!=0) {
			List<Staff> l = q.poll();
			for (Staff staff : l) {
				roles.add(staff.getRole());
				List<Staff> temp = RoleHierarchyRepository.getInstance().getStaff(staff.getRole());
				if(temp!=null) {
					q.offer(temp);
				}
			}
		}
		return roles;
//		return RoleHierarchyRepository.getInstance().getStaff();
	}

}
