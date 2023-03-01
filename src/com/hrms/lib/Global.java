package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	
// TO provide Test data and Objects related to whole application
	
//          ========> Test data <===========
	
	public String url          = "http://183.82.103.245/nareshit/login.php";
	public String user_name    = "nareshit";
	public String password     = "nareshit";
	public String first_name   = "paleti";
	public String last_name    = "kamal";
	public String emp_id_ser   = "2698";
	
//	 ===========> objects/elements <==========
	
	public String log_name     = "txtUserName";
	public String txt_Password = "txtPassword";
	public String log_button   = "Submit";
	public String link_logout  = "Logout";
	public String frame_id     = "rightMenu";
	public String add_btn_xpath= "//input[@value='Add'][@type='button']";
	public String txt_firstname= "txtEmpFirstName";  
	public String txt_lastname = "txtEmpLastName";
	public String btn_save     = "//*[@id='btnEdit'][@value='Save']";
	public String emp_name     = "/html/body/div/div[2]/form/table/tbody/tr[1]/td[3]/a";
	public String btn_edit     = "//input[@value='Edit']";
	public String edit_save_btn= "//input[@value='Save']";
	public String drop_down    = "loc_code";
	public String ser_by       = "loc_name";
	public String Dd_emp_id    = "Emp. ID";
	public String btn_ser      ="//input[@value='Search']";
	public String check_box    ="chkLocID[]";
	public String delete_btn   ="//input[@value='Delete']";
	public String pim_action   = "PIM";
	public String mouseOver_add= "/html/body/div[4]/ul/li[2]/ul/li[2]/a/span";
	
	
	
	
}
