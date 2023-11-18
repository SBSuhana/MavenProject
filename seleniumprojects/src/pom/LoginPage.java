package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Log in")
private WebElement loginLink;
public WebElement getLoginLink(){
	return loginLink;
}
	@FindBy(id="Email")
	 private WebElement emailTB;
	public WebElement getemailTB(){
		return emailTB;
	
}
	@FindBy(id="Password")
	private WebElement passwordTB;
	public WebElement getpasswordTB() {
		return  passwordTB;	
	}
	@FindBy(xpath="//input[@value='Log in']")
			private WebElement loginclick;
			public WebElement getloginclick() {
				return loginclick;
			}
			}

	

