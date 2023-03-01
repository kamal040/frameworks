package com.hrms.lib;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class General extends Global{
// To provide reusable functionality and methods related to whole application
	
	public void openApplication(){
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32(2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("open application");
	}
	
	public void closeApp() {
		driver.close();
		System.out.println("close application");
	}
	
	public void logintoApp() {
		driver.findElement(By.name(log_name)).sendKeys(user_name);
		driver.findElement(By.name(txt_Password)).sendKeys(password);
		driver.findElement(By.name(log_button)).click();
		System.out.println("login completed");
		Log.info("login complteted");
	}
	
	public void switch_frame() {
		driver.switchTo().frame(frame_id);
	}
	
	public void Add_employee() {
		driver.findElement(By.xpath(add_btn_xpath)).click();
		driver.findElement(By.name(txt_lastname)).sendKeys(last_name);
		driver.findElement(By.name(txt_firstname)).sendKeys(first_name);
		driver.findElement(By.xpath(btn_save)).click();
		System.out.println("employee added");
	}
	
	public void Edit_emp() {
		driver.findElement(By.xpath(emp_name)).click();
		driver.findElement(By.xpath(btn_edit)).click();
		WebElement a = driver.findElement(By.name(txt_firstname));
		a.clear();
		a.sendKeys(first_name);
		WebElement b = driver.findElement(By.name(txt_lastname));
		b.clear();
		b.sendKeys(last_name);
		driver.findElement(By.xpath(edit_save_btn)).click();
		System.out.println("employee edited");
		Log.info("employeee");
	}
	
	public void delete_emp() {
		Select id = new Select(driver.findElement(By.id(drop_down)));
		id.selectByVisibleText(Dd_emp_id);
		driver.findElement(By.id(ser_by)).sendKeys(emp_id_ser);
		driver.findElement(By.xpath(btn_ser)).click();;
		driver.findElement(By.name(check_box)).click();
		driver.findElement(By.xpath(delete_btn)).click();;
		System.out.println("delete employee ");
		Log.info("delete employee");
	}
	public void mouse_action() {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(pim_action))).perform();
		driver.findElement(By.xpath(mouseOver_add)).click();
		System.out.println("mouse action completed");
	}
	
	public void exist_frame() {
		driver.switchTo().defaultContent();
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Log.info("logout complted");
	}
}
