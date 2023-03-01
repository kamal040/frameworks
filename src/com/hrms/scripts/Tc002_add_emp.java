package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test                               // TestNG action and remover "@Test" it will become frame work
public class Tc002_add_emp {
//	public static void main(String args[]) {
		public void tc002() {
			DOMConfigurator.configure("log4j.xml");
		General add = new General();
		add.openApplication();
		add.logintoApp();
		add.switch_frame();
		add.Add_employee();
		add.exist_frame();
		add.logout();
		add.closeApp();
		
	}

}
