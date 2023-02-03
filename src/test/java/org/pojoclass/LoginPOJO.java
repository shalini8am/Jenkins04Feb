package org.pojoclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.reusablecodes.BaseClass;
public class LoginPOJO extends BaseClass{

	// Login page locators only we will maintain
	
	// 1.Non Parameterized constructor
	public LoginPOJO() {
		PageFactory.initElements(driver,this );
	}
	
	// 2.Private WebElements
	
  // WebElement e = driver.findElement(By.id("email"));
	
	@CacheLookup
	@FindBy(id = "email")
	private WebElement emailTxt;
	
	@CacheLookup
	@FindBy(name = "pass")
	private WebElement passTxt;
	
	@CacheLookup
	@FindBy(name = "")
	private WebElement loginBtn;
	
	@CacheLookup
	@FindBys({ // Acts like an AND operator
		
		@FindBy(xpath = "//button[@id='u_0_5_+T']"),
		@FindBy(xpath = "//button[@name='login']"),
		@FindBy(xpath = "//button[@type='submit']"),
		@FindBy(xpath = "//button[text()='Log in']")		
	})
	private WebElement loginFindBys;
	
	@CacheLookup
	@FindAll({  // Acts like an OR operator

		@FindBy(xpath = "//button[@id='u_0_5_+T']"),
		@FindBy(xpath = "//button[@name='login']"),
		@FindBy(xpath = "//button[@type='submit']"),
		@FindBy(xpath = "//button[text()='Log in']")		
	})
	private WebElement loginFindAll;
	
    // 3. Getters to access those private WebElements outside the class
	
	public WebElement getLoginFindAll() {
		return loginFindAll;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
