package com_TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com_Reusable_class.base_class;
import om_Page_Objects.loginpage;
import om_Page_Objects.search_hotel;

public class tc_2_loginfun extends base_class{

	public loginpage lp;
	public search_hotel sh;
	@Test
	public void loginpage() {
		
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
		
}
}
