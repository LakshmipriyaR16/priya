package com.selenium.pom;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public WebDriver driver;
public HomePage(WebDriver hdriver) {
	this.driver=hdriver;
	PageFactory.initElements(driver,  this);
		}
@FindBy(id="search_query_top")
private WebElement searchFeild;

@FindBy(xpath="//*[@type=\"submit\"]")
private WebElement searchBtn;

public WebElement getSeachFeild() {
	return searchFeild;
	}

public WebElement getSearchBtn() {
	return searchBtn;
	}
@FindBy(xpath="//span[@class=\"lighter\"]")
private WebElement validateBlouseResult;

public WebElement getValidateBlouseResult() {
	return validateBlouseResult;
}
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div[1]/div/div/a/img")
private WebElement printedSummerDress;

public WebElement getPrintedSummerDress() {
	return printedSummerDress;

}
@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
private WebElement addToCart;

public WebElement getAddToCart() {
	return addToCart;
}

@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
private WebElement proceedToCheckOut1;

public WebElement getProceedToCheckOut1() {
	return proceedToCheckOut1;
}

//Summary
@FindBy(xpath="(//i[@class=\"icon-plus\"])[1]")
private WebElement quantityPlusButton;

public WebElement getQuantityPlusButton() {
	return quantityPlusButton;
}
@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
private WebElement proceedToCheckOut2;

public WebElement getProceedToCheckOut2() {
	return proceedToCheckOut2;
}
//Address
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement proceedToCheckOut3;
	
	public WebElement getProceedToCheckOut3() {
		return proceedToCheckOut3;
	}
@FindBy(xpath="//div[@class='checker']")
private WebElement iAgree;

public WebElement getIAgree() {
	return iAgree;
}
//Shipping
@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
private WebElement proceedToCheckOut4;

public WebElement getProceedToCheckOut4() {
	return proceedToCheckOut4;
}
@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")
private WebElement payByBankWire;

public WebElement getPayByBankWire() {
	return payByBankWire;
}

//Confirm Order

@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
private WebElement confirmOrder;

public WebElement getConfirmOrder() {
	return confirmOrder;
}

}
