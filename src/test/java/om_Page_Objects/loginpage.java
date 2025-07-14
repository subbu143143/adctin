package om_Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public static WebDriver driver;//remote
	public loginpage(WebDriver dr) //local
	{
		
		this.driver=dr;
		PageFactory.initElements(dr,this);
	}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement loginbtn;
	
	public void setusername() {
		txtusername.sendKeys("ramasubbaiah");
	}
	public void setusrpassword() {
		txtpassword.sendKeys("Ram@12");
	}
	public void clickloginbtn() {
		loginbtn.click();
	}

}
