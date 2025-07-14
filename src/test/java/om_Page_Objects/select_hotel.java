package om_Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class select_hotel {
	
	public static WebDriver driver;

	public select_hotel(WebDriver dr1) {
		
		this.driver=dr1;
		PageFactory.initElements(dr1,this);
	}
	@FindBy(id="radiobutton_2")
	WebElement clickbtn;
	
	@FindBy(id="continue")
	WebElement clickcontinue;
	
	public void selectbtn() {
		clickbtn.click();
	}
	public void continuebtn() {
		clickcontinue.click();
	}
}
