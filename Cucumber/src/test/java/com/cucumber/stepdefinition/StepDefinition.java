package com.cucumber.stepdefinition;

	import org.junit.Assert;

	import org.openqa.selenium.WebDriver;

	import com.cucumber.runner.TestRunner;
import com.selenium.baseclass.Cucumber.BaseClassMaven;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class StepDefinition extends BaseClassMaven{
	public static WebDriver driver=TestRunner.driver;
	
	@Given("^User launch the automation practice application$")
	public void user_launch_the_automation_practice_application() throws Throwable {
		getUrl("http://automationpractice.com/");

	}

	@When("^User click on the Signin button in the header$")
	public void user_click_on_the_Signin_button_in_the_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		  clickOnTheElement(lp.getSignIn1());

	}

	@When("^User enter the email address in the authentication page$")
	public void user_enter_the_email_address_in_the_authentication_page() throws Throwable {
		 LoginPage lp=new LoginPage(driver);
		    inputValue(lp.getEmailAddress(), "lakshmipriya.ramprakash@gmail.com");

	}

	@When("^User enter the password in the authentication page$")
	public void user_enter_the_password_in_the_authentication_page() throws Throwable {
		LoginPage lp=new LoginPage(driver);
	    inputValue(lp.getPassWd(), "India@143");

	}

	@When("^User click on the signIn button$")
	public void user_click_on_the_signIn_button() throws Throwable {

		LoginPage lp=new LoginPage(driver);
		  clickOnTheElement(lp.getSignIn());
	}

	@Then("^User verify the username in the header$")
	public void user_verify_the_username_in_the_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		  Assert.assertEquals("MY ACCOUNT", getTextOfTheElement(lp.getMyAccount()));

	}

	@When("^User enter product name in the search feild$")
	public void user_enter_product_name_in_the_search_feild() throws Throwable {

		HomePage hp=new HomePage(driver);
	    inputValue(hp.getSeachFeild(), "Blouse");
	}

	@When("^User click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {

		HomePage hp=new HomePage(driver);
		clickOnTheElement(hp.getSearchBtn());
	}

	@Then("^User verify the search result in the search header$")
	public void user_verify_the_search_result_in_the_search_header() throws Throwable {
		HomePage hp=new HomePage(driver);
		Assert.assertEquals("\"BLOUSE\"", getTextOfTheElement(hp.getValidateBlouseResult()));

	}

	@When("^User mouse hover on the Women Menu$")
	public void user_mouse_hover_on_the_Women_Menu() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		mouseHover(lp.getWomenMenuBtn());


	}

	@When("^User click on the Blouses option$")
	public void user_click_on_the_Blouses_option() throws Throwable {

		LoginPage lp=new LoginPage(driver);
		clickOnTheElement(lp.getBlouses());

	}

	@Then("^User Verify the Blouse result in the header$")
	public void user_Verify_the_Blouse_result_in_the_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals("BLOUSES", getTextOfTheElement(lp.getBlouseResult()));

	}
	@When("^User mouse hover on the Image of the product$")
	public void user_mouse_hover_on_the_Image_of_the_product() throws Throwable {
		LoginPage lp=new LoginPage(driver);
mouseHover(lp.getBlouseImage());	}

	@When("^User click on the AddToCart Button of the product$")
	public void user_click_on_the_AddToCart_Button_of_the_product() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		clickOnTheElement(lp.getAdToCart());	
	}
	@Then("^User verify the product added to the cart in the header$")
	public void user_verify_the_product_added_to_the_cart_in_the_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
Assert.assertEquals("Product successfully added to your shopping cart", getTextOfTheElement(lp.getSuccessfullyAdToCart()));
	}

	

	@When("^User Click on Proceed to CheckOut in the summary page$")
	public void user_Click_on_Proceed_to_CheckOut_in_the_summary_page() throws Throwable {
		HomePage hp=new HomePage(driver);
clickOnTheElement(hp.getProceedToCheckOut1());

	}

	@Then("^User Verify the product CheckOut result in the header$")
	public void user_Verify_the_product_CheckOut_result_in_the_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
Assert.assertEquals("SHOPPING-CART SUMMARY", getTextOfTheElement(lp.getShoppingCartSummary()));
}
	
	@When("^User click on the plus button to add  the quantity of the product$")
	public void user_click_on_the_plus_button_to_add_the_quantity_of_the_product() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		clickOnTheElement(lp.getCartQuantity());
	}

	@When("^Click on Proceed to Check out button of the summary page$")
	public void click_on_Proceed_to_Check_out_button_of_the_summary_page() throws Throwable {
		HomePage hp=new HomePage(driver);
		clickOnTheElement(hp.getProceedToCheckOut2());


	}

	@Then("^Verify the Summary page result in the Next page header$")
	public void verify_the_Summary_page_result_in_the_Next_page_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
Assert.assertEquals("ADDRESSES", getTextOfTheElement(lp.getAddressPageValidate()));

	}
	@When("^User enter the comment about the order$")
	public void user_enter_the_comment_about_the_order() throws Throwable {
		LoginPage lp=new LoginPage(driver);
inputValue(lp.getCommentAboutOrder(), "deliver the order as early as possible");

	}

	@When("^User click on proceed to checkout product$")
	public void user_click_on_proceed_to_checkout_product() throws Throwable {
		HomePage hp=new HomePage(driver);
		clickOnTheElement(hp.getProceedToCheckOut3());

	}

	@Then("^User verify the Address page result on the next page header$")
	public void user_verify_the_Address_page_result_on_the_next_page_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
Assert.assertEquals("SHIPPING", getTextOfTheElement(lp.getShippingValidation()));

	}
	@When("^User Click on the Terms of Service  check-box$")
	public void user_Click_on_the_Terms_of_Service_check_box() throws Throwable {
		HomePage hp=new HomePage(driver);
clickOnTheElement(hp.getIAgree());

	}

	@When("^User Clicks the Proceed Checkout button in the Shipping Page$")
	public void user_Clicks_the_Proceed_Checkout_button_in_the_Shipping_Page() throws Throwable {
		HomePage hp=new HomePage(driver);
		clickOnTheElement(hp.getProceedToCheckOut4());

	}

	@Then("^User Verify the shipping page result in the next page header$")
	public void user_Verify_the_shipping_page_result_in_the_next_page_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", getTextOfTheElement(lp.getPaymentPageValidation()));

	}
	@When("^User click on Pay By Bank Wire option in the payment page$")
	public void user_click_on_Pay_By_Bank_Wire_option_in_the_payment_page() throws Throwable {
		HomePage hp=new HomePage(driver);
clickOnTheElement(hp.getPayByBankWire());
	}

	@When("^Click on I confirm my Order to complete the payment$")
	public void click_on_I_confirm_my_Order_to_complete_the_payment() throws Throwable {
		HomePage hp=new HomePage(driver);
clickOnTheElement(hp.getConfirmOrder());

	}

	@Then("^User Verify the Payment Page result in the next page header$")
	public void user_Verify_the_Payment_Page_result_in_the_next_page_header() throws Throwable {
		LoginPage lp=new LoginPage(driver);
Assert.assertEquals("Your order on My Store is complete.", getTextOfTheElement(lp.getPaymentConfirmationValidate()));

	}
	}
