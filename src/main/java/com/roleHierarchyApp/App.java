package com.roleHierarchyApp;

import com.roleHierarchyApp.start_view.MainView;

public class App 
{
    public static void main( String[] args )
    {
    	new App().init();
    }

	private void init() {
		new MainView().start();
	}
}
