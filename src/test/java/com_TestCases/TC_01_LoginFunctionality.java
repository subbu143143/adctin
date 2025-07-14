package com_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com_Reusable_class.base_class;
import om_Page_Objects.loginpage;

public class TC_01_LoginFunctionality extends base_class{
	
	public loginpage lp;
	@Test
	public void logintest() {
		lp=new loginpage(driver);
		lp.setusername();
		lp.setusrpassword();
		lp.clickloginbtn();
	}

}
