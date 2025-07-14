package om_Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class book_hotel {
	
	public static WebDriver driver;
	public Select sc;
	public book_hotel(WebDriver dr) {
		
		this.driver=dr;
		PageFactory.initElements(dr,this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	WebElement fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@name='address']")
	WebElement address;
	
	
	@FindBy(xpath="//*[@id='cc_num']")
	WebElement cardnum;
	
	@FindBy(xpath="//*[@id='cc_type']")
	WebElement drpcardtype;
	
	@FindBy(id="cc_exp_month")
	WebElement drpexdate;
	
	@FindBy(id="cc_exp_year")
	WebElement drpyear;
	
	@FindBy(xpath="//*[@id='cc_cvv']")
	WebElement lastcvvnum;
	
	@FindBy(id="book_now")
	WebElement book;
	
	public void fname1() {
		fname.sendKeys("ram");
	}
	public void lastname() {
		lastname.sendKeys("subbaiah");
	}
	public void address() {
		address.sendKeys("//W3Softech India Pvt Ltd, Gachibowli, Hyderaba");
	}
	public void cardnum() {
		cardnum.sendKeys("1234567891234567");
	}
	public void cardtype() {
		sc=new Select(drpcardtype);
		sc.selectByIndex(3);
	}
	public void date() {
		sc=new Select(drpexdate);
		sc.selectByIndex(3);
	}
	public void year() {
		sc=new Select(drpyear);
		sc.selectByIndex(3);
	}
	public void cvvnumb() {
		lastcvvnum.sendKeys("26425636");
	}
	public void book() {
		book.click();
	}
	
	
	
	
	
	
	
	
	
}
                                                           