package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.cucumber.listener.Reporter;
import com.selenium.baseclass.Cucumber.BaseClassMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resources\\com\\selenium\\reports\\extentreport.html",
		"pretty",
"html:src\\test\\resources\\com\\selenium\\reports\\",
"json:src\\test\\resources\\com\\selenium\\reports\\report.json",
"junit:src\\test\\resources\\com\\selenium\\reports\\report.xml"
},	
		
features="src\\test\\java\\com\\adactIn\\feature\\",
glue="com.adactin.stepdefinition",


tags=  {"@TC-11"},
dryRun=false,strict=true,monochrome=true)	

public class TestRunner {
public static WebDriver driver;

@BeforeClass
public static void setup() throws Exception, Throwable {
	String browser = FileReaderManager.getInstance().getCr().getBrowser();

driver=BaseClassMaven.browserLaunch("Chrome");
 
}
@AfterClass
public static void tearDown() {
	
	
	
	
//driver.quit();
	Reporter.loadXMLConfig(new File("C:\\Users\\Gautham\\eclipse-workspace\\SeleniumInstall\\Cucumber\\src\\test\\java\\com\\resource\\config.xml"));
}

}

/*plugin= {"pretty",
		"html:src\\test\\resource\\com\\selenium\\reports\\",
		"json:src\\test\\resource\\com\\selenium\\reports\\report.json",
		"junit:src\\test\\resource\\com\\selenium\\reports\\report.xml"
		}*/

//"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resourse\\com\\selenium\\reports\\extentreport.html",