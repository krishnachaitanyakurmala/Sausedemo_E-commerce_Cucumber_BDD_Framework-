package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sausedemo_validData_page 
{
 WebDriver driver ;
  @FindBy (id="user-name")
  WebElement uname;
  @FindBy (id="password")
  WebElement pwd;
  @FindBy (id="login-button")
  WebElement login_button;
  @FindBy(xpath ="//div[@class='app_logo']")
  WebElement homePage_Displayed;
  
  public Sausedemo_validData_page(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
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
  public void Homepage_Display()
  {
	  homePage_Displayed.isDisplayed();
  }
  
}
