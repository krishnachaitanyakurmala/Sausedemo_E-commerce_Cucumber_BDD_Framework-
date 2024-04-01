package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sausedemo_InvalideData_page 
{
WebDriver driver;
@FindBy (id="user-name")
WebElement uname;
@FindBy (id="password")
WebElement pwd;
@FindBy (id="login-button")
WebElement login_button;
@FindBy(xpath="//h3[@data-test='error']")
WebElement Error_msg;

public void enterusername(String usernum)
{
	  uname.sendKeys(usernum);
	  
}
public void enterpassword(String password)
{
	 pwd.sendKeys(password);
	 
}
public void clickloginButton()
{
	  login_button.click();
}
public void errorMessage()
{
	Error_msg.isDisplayed();

}
public Sausedemo_InvalideData_page(WebDriver driver)
{
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
}
}
