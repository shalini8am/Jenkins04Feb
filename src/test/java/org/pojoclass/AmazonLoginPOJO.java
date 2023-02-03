package org.pojoclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusablecodes.BaseClass;
public class AmazonLoginPOJO extends BaseClass{

	public AmazonLoginPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email")
	private WebElement emailTxt;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(name = "password")
	private WebElement passTxt;
	
	@FindBy(id = "signInSubmit")
	private WebElement signInBtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}
	
}
