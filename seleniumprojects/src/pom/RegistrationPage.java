package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement Register;
	public WebElement getRegister(){
		return Register;
}
	@FindBy(name="Gender")
	private WebElement Gender;
	public WebElement getGender(){
		return Gender;
	}
	@FindBy(id="FirstName")
	private WebElement FirstName;
	public WebElement getFirstName(){
		return FirstName;
	}
	@FindBy(id="LastName")
	private WebElement LastName;
	public WebElement getLastName(){
		return LastName;
	}
	@FindBy(id="Email")
	private WebElement Email;
	public WebElement getEmail(){
		return Email;
	}
	@FindBy(name="Password")
	private WebElement Password;
	public WebElement getPassword(){
		return Password;
	}
	@FindBy(name="ConfirmPassword")
	private WebElement ConfirmPassword;
	public WebElement getConfirmPassword(){
		return ConfirmPassword;
	}
	@FindBy(xpath="//input[@value='Register']")
	private WebElement Registerclick;
	public WebElement getRegisterclick(){
		return Registerclick;
	}
}
	
	
	

