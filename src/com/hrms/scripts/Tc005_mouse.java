package com.hrms.scripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

@Test                                       // TestNG action and remover "@Test" it will become frame work
public class Tc005_mouse {
//	public static void main(String args[]) {
	public void mouse() {
	DOMConfigurator.configure("log4j.xml");
	General moa = new General();
	moa.openApplication();
	moa.logintoApp();
	moa.mouse_action();
	moa.logout();
	moa.closeApp();
	}

}
