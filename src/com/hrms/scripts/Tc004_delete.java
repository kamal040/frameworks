package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test                                             // TestNG action and remover "@Test" it will become frame work
public class Tc004_delete {
//public static void main(String args[]) {
	public void tc004() {
	DOMConfigurator.configure("log4j.xml");
	General del = new General();
	del.openApplication();
	del.logintoApp();
	del.switch_frame();
	del.delete_emp();
	del.exist_frame();
	del.closeApp();
	
}

}
