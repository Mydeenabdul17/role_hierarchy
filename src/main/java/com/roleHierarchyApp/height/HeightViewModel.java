package com.roleHierarchyApp.height;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class HeightViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private HeightView heightView;

	public HeightViewModel(HeightView heightView) {
		this.heightView = heightView;
	}

	public int findHeight(String role) {
		List<Staff> l = new ArrayList<>();
		Staff root = repository.getStaff(role);
		l.add(root);
		Queue<List<Staff>> q = new LinkedList<List<Staff>>();
		q.offer(l);
		int max=0;
		while(q.size()!=0) {
			List<Staff> temp = q.poll();
			max = temp.size();
			List<Staff> staff = repository.getStaffByReportingRole(temp.get(temp.size()-1).getRole());
			for (Staff staff2 : staff) {
				List<Staff> temp2 = new ArrayList<>(temp);
				temp2.add(staff2);
				q.offer(temp2);
			}
		}
		return max;
	}
	
}
