package com.roleHierarchyApp.height;

public class HeightView {

	private HeightViewModel heightViewModel;
	
	public HeightView () {
		heightViewModel = new HeightViewModel(this);
	}
	
	public void findHeight() {
		int height = heightViewModel.findHeight("CEO");
		System.out.println("height - "+height);
	}
}
