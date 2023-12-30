package com.roleHierarchyApp.display_user_and_sub_user;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.roleHierarchyApp.dto.Staff;

public class DisplaySubUserView {

	private DisplaySubUserViewModel model;
	public DisplaySubUserView() {
		model = new DisplaySubUserViewModel(this);
	}
	
	public void displaySubUser() {
		List<Staff> staff = model.displaySubUser();
		for (Staff staff2 : staff) {
			List<Staff> res = new ArrayList<>();
			Queue<Staff> q = new LinkedList<Staff>();
			q.offer(staff2);
			while(q.size()!=0) {
				res.add(q.poll());
				List<Staff> temp = model.getStaff(res.get(res.size()-1));
				for (Staff staff3 : temp) {
					q.offer(staff3);
				}
			}
			System.out.print(res.get(0).getName()+"-");
			for (int i = 1; i < res.size(); i++) {
				if(i==res.size()-1) {
					System.out.print(res.get(i).getName());
				}else {
					System.out.print(res.get(i).getName());
				}
			}
			System.out.println();
		}
	}
}
