package com_TestCases;

import org.testng.annotations.Test;

import com_Reusable_class.base_class;
import om_Page_Objects.book_hotel;
import om_Page_Objects.loginpage;
import om_Page_Objects.search_hotel;
import om_Page_Objects.select_hotel;

public class tc_04_bookhotel extends base_class {
	
	public loginpage lp;
	public search_hotel sh;
	public select_hotel sh1;
	public book_hotel bh;
	@Test
	public void sel() {
	lp=new loginpage(driver);
	lp.setusername();
	lp.setusrpassword();
	lp.clickloginbtn();
	
	sh=new search_hotel(driver);
	sh.setlocation();
	sh.noofrooms();
	sh.pickdatein();
	sh.pickdateout();
	sh.adultrooms();
	sh.sarchbtn();
	
	sh1=new select_hotel(driver);
	sh1.selectbtn();
	sh1.continuebtn();
	
	bh=new book_hotel(driver);
	bh.fname1();
	bh.lastname();
	bh.address();
	bh.cardnum();
	bh.cardtype();
	bh.date();
	bh.year();
	bh.cvvnumb();
	bh.book();
	}
}
