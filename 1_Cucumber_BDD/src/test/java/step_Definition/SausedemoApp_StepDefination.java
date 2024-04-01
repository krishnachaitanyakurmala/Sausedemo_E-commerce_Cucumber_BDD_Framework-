package step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Sausedemo_InvalideData_page;
import pageFactory.Sausedemo_Order_Items;
import pageFactory.Sausedemo_validData_page;

public class SausedemoApp_StepDefination
{
 WebDriver driver;
Sausedemo_validData_page login;
Sausedemo_InvalideData_page invalid_login;
Sausedemo_Order_Items order_item;
@Given("open login Page")
public void open_login_page() 
{
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.get("https://www.saucedemo.com/v1/");
}

@When("user Enter username and password")
public void user_enter_username_and_password() 
{
    login = new Sausedemo_validData_page(driver);
    login.enterusername("standard_user");
    login.enterpassword("secret_sauce");
}
@When("user enter {string} and {string}")
public void user_Enter_and(String usernum, String password) 
{
     
     invalid_login = new Sausedemo_InvalideData_page(driver);
     invalid_login.enterusername(usernum);
     invalid_login.enterpassword(password);
     
}
@When("user enter username and password")
public void user_Enter_username_and_password() 
{
    order_item = new Sausedemo_Order_Items(driver);
    order_item.enterusername("standard_user");
    order_item.enterpassword("secret_sauce");
}

@When("user click login button")
public void user_click_login_button()
{
     login.clickloginButton();
}
@And("user Click login button")
public void user_click_invalidlogin_button()
{
     invalid_login.clickloginButton();
}
@And("user OrderItem Click login button")
public void user_OrderItem_click_login_button()
{
     order_item.clickloginButton();
}
@Then("user should be see Error message")
public void user_should_be_see_Error_message()
{
	 invalid_login.errorMessage();
}
@Then("user should be see Home page")
public void user_should_be_see_Home_page()
{
	login.Homepage_Display();
	
}
@Then("user should be see OrderItem Home page")
public void user_should_be_see_OrderItem_Home_page()
{
	
	order_item.Homepage_Display();
}
@When("user should be Select of the Price\\(low to high)")
public void user_should_be_select_of_the_price_low_to_high()
{
    order_item.DropDown_price_low_to_high();
}
@When("user click Add To Card in item")
public void user_click_add_to_card_in_item() 
{
    order_item.click_Add_To_Card_in_item();
}
@When("user should be click shopping cart")
public void user_should_be_click_shopping_cart() 
{
    order_item.Click_Shopping_Cart();
}
@When("user wait for check out page")
public void user_wait_for_check_out_page() 
{
    order_item.Wait_for_checkOut_page();
}
@Then("user should be see your cart page")
public void user_should_be_see_your_cart_page() 
{
    order_item.user_should_be_see_yourCart_page();
}

@When("click ckeck out button")
public void click_ckeck_out_button() 
{
    order_item.click_check_out_button();
}
@When("user wait for your information")
public void user_wait_for_your_information() 
{
    order_item.Wait_for_your_information();
}
@Then("user should be see chechout information page")
public void user_should_be_see_chechout_information_page() 
{
   order_item.user_should_be_see_chechout_information_page();
}

@When("Enter first name and last name and pincode")
public void enter_first_name_and_last_name_and_pincode() 
{
    order_item.Enter_FirstName("Chaitu");
    order_item.Enter_Last_name("k");
    order_item.Enter_pinCode("23445");
}
@When("user click continue button")
public void user_click_continue_button() 
{
    order_item.Click_continue_button();
}
@When("user wait check out overview")
public void user_wait_check_out_overview() 
{
   order_item.user_wait_checkOut_Overview();
}
@Then("user should be see checkout overview page")
public void user_should_be_see_checkout_overview_page()
{
   order_item.user_should_be_see_checkout_Overview_page();
}
@When("use click Finish button")
public void use_click_finish_button() 
{
   order_item.Click_Finish_button();
}
@Then("use should be see THANK YOU FOR YOUR ORDER")
public void use_should_be_see_thank_you_for_your_order() 
{
   order_item.use_should_be_see_thank_you_for_your_order();
}
@When("user Take a screen short")
public void user_take_a_screen_short() throws Throwable
{
	order_item.screenshot();
}

@When("close browser")
public void close_browser() 
{
  driver.close();   
}
}
