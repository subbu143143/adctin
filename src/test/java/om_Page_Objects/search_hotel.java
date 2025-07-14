package om_Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class search_hotel {
	
	public static WebDriver driver;
	public Select sc;
	public search_hotel(WebDriver dr1) {
		
		this.driver=dr1;
		PageFactory.initElements(dr1,this);
	}
	@FindBy(id="location")
	WebElement drplocation;
	
	@FindBy(id="room_nos")
	WebElement drpnofrooms;
	
	@FindBy(id="datepick_in")
	WebElement datepickin;
	
	@FindBy(id="datepick_out")
	WebElement datepickout;
	
	@FindBy(id="adult_room")
	WebElement drpadultroom;
	
	@FindBy(xpath="//*[@id='Submit']")
	WebElement searchbtn;
	
	public void setlocation() {
		sc=new Select(drplocation);
		sc.selectByIndex(2);
	}
	public void noofrooms() {
		sc= new Select(drpnofrooms);
		sc.selectByIndex(3);
	}
	public void pickdatein() {
		datepickin.sendKeys("01/07/2025");
	}
	public void pickdateout() {
		datepickout.sendKeys("5/07/2025");
	}
	public void adultrooms() {
		sc =new Select(drpadultroom);
		sc.selectByIndex(3);
	}
	public void sarchbtn() {
		searchbtn.click();
	}
	
	
	
	
	
	
	
	
	

}
