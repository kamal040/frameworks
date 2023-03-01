package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class Tc001_login { 
//	public static void main(String args[]) {                   // normal frame work action
	public void tc001() {                      // TestNG action and remover "@Test" it will become frame work
		DOMConfigurator.configure("log4j.xml");    // log4j statement
		General obj = new General();
		obj.openApplication();
		obj.logintoApp();
		obj.logout();
		obj.closeApp();
	}	
}
