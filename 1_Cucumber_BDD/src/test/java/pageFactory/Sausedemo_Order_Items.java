package pageFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sausedemo_Order_Items  
{
	 WebDriver driver ;
	 WebDriverWait wait;
	  @FindBy (id="user-name")
	  WebElement uname;
	  @FindBy (id="password")
	  WebElement pwd;
	  @FindBy (id="login-button")
	  WebElement login_button;
	  @FindBy(xpath ="//div[@class='app_logo']")
	  WebElement homePage_Displayed;
	  @FindBy(className = "product_sort_container")
	  WebElement dropDown_List;
      @FindBy (xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
      WebElement click_Add_To_Card_in_item;
      @FindBy(xpath = "//*[@fill='currentColor']")
      WebElement Click_Shopping_Cart;
      @FindBy(linkText = "CHECKOUT")
      WebElement check_out_button;
      @FindBy (className = "subheader")
      WebElement yourCart_page_Displayed ;
      @FindBy(className = "subheader")
      WebElement your_information;
      @FindBy (id ="first-name")
      WebElement enter_firstname;
      @FindBy (id ="last-name")
	  WebElement enter_last_name;
      @FindBy (id ="postal-code")
      WebElement enter_pincode;
      @FindBy(xpath = "//input[@value='CONTINUE']")
      WebElement Click_continue_button;
      @FindBy (xpath = "//div[text() = 'Checkout: Overview']")
      WebElement wait_checkOut_Overview;
      @FindBy(linkText = "FINISH")
      WebElement Click_Finish_button;
      @FindBy (xpath = "//h2[text() ='THANK YOU FOR YOUR ORDER']")
      WebElement user_see_thank_you_for_your_order;
	  public Sausedemo_Order_Items(WebDriver driver)
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
	  public void DropDown_price_low_to_high()
	  {
	      dropDown_List.click(); 
		  Select element = new Select(dropDown_List);
	      element.selectByValue("lohi");
	  }
	  public void click_Add_To_Card_in_item() 
	  {
	      click_Add_To_Card_in_item.click();
	  }
	  public void Click_Shopping_Cart() 
	  {
		  Click_Shopping_Cart.click();
	  }
	  public void Wait_for_checkOut_page() 
	  {
	      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   
	      wait.until(ExpectedConditions.visibilityOf(check_out_button));
	  }
	  public void user_should_be_see_yourCart_page() 
	  {
	      yourCart_page_Displayed.isDisplayed();
	  }

	  public void click_check_out_button() 
	  {
	      check_out_button.click();
	  }
	  public void Wait_for_your_information() 
	  {
		  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(your_information));
	  }
	  public void user_should_be_see_chechout_information_page() 
	  {
	     your_information.isDisplayed();
	  }

	  public void Enter_FirstName(String first_name) 
	  {
	      enter_firstname.sendKeys(first_name);
	  }
	  public void Enter_Last_name(String last_name)
	  {
		  enter_last_name.sendKeys(last_name);
	  }
	  public void Enter_pinCode(String pincode )
	  {
		  enter_pincode.sendKeys(pincode);
	  }
	  public void Click_continue_button() 
	  {
	      Click_continue_button.click();
	  }
	  public void user_wait_checkOut_Overview() 
	  {
		  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(wait_checkOut_Overview));
	  }
	  public void user_should_be_see_checkout_Overview_page()
	  {
		  wait_checkOut_Overview.isDisplayed();
	  }
	
	  public void Click_Finish_button() 
	  {
		  Click_Finish_button.click();
	  }
	 
	  public void use_should_be_see_thank_you_for_your_order() 
	  {
		  user_see_thank_you_for_your_order.isDisplayed();
	  }
	 public void screenshot() throws Throwable
	 {
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
		    File desfile = new File("D:\\ScreenShortsParctice\\byteoutput.png");
		    FileOutputStream fo = new FileOutputStream(desfile);
		    fo.write(bytes);
		    fo.close();
	 }
	 
}
