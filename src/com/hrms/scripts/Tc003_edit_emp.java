package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test                                    // TestNG action and remover "@Test" it will become frame work
public class Tc003_edit_emp {
//public static void main(String args[]) {
	public void tc003() {
		DOMConfigurator.configure("log4j.xml");
	General edit = new General();
	edit.openApplication();
	edit.logintoApp();
	edit.switch_frame();
	edit.Edit_emp();
	edit.exist_frame();
	edit.logout();
	edit.closeApp();
}
}
