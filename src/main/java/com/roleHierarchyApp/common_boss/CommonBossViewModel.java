package com.roleHierarchyApp.common_boss;

import java.util.List;

import com.roleHierarchyApp.dto.Staff;
import com.roleHierarchyApp.repository.RoleHierarchyRepository;

public class CommonBossViewModel {

	private RoleHierarchyRepository repository = RoleHierarchyRepository.getInstance();
	private CommonBossView view;

	public CommonBossViewModel(CommonBossView view) {
		this.view = view;
	}

	public String findBoss(String user1, String user2) {
		List<Staff> l1 = repository.getBoss(user1);
		List<Staff> l2 = repository.getBoss(user2);
		Staff res=null;
		int i=l1.size()-1,j=l2.size()-1;
		while(i>=0&&j>=0) {
			if(l1.get(i)==l2.get(j)) {
				res = l1.get(i);
			}
			i--;j--;
		}
		return res==null?null:res.getName();
	}
	
	
}
