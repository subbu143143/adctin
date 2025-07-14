package com_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com_Reusable_class.base_class;
import om_Page_Objects.loginpage;
import om_Page_Objects.search_hotel;
import om_Page_Objects.select_hotel;

public class tc_03_select_hotel extends base_class {

	public loginpage lp;
	public search_hotel sh;
	public select_hotel sh1;
	@Test
	public void select () {
		lp=new loginpage(driver);
		lp.setusername();
		lp.setusrpassword();
		lp.clickloginbtn();
		
		sh =new search_hotel(driver);
		sh.setlocation();
		sh.noofrooms();
		sh.pickdatein();
		sh.pickdateout();
		sh.adultrooms();
		sh.sarchbtn();
		
		sh1=new select_hotel(driver);
		sh1.selectbtn();
		sh1.continuebtn();
		
	}
}
