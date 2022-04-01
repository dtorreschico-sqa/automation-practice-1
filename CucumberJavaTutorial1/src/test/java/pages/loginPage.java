package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
// Create locators for all objects to be used on this page
// username, password, login
	
	WebDriver _driver;
	
	By txt_usernameField = By.id("name");
	
	By txt_passwordField = By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	
	public loginPage(WebDriver driver) {
		_driver = driver;
	}
	
	
	public void enterUsername(String username) {
		
		_driver.findElement(txt_usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		_driver.findElement(txt_passwordField).sendKeys(password);
	}
	
	public void clickLogin() {
		_driver.findElement(btn_login).click();
	}
	
	public void checkLogoutisDisplayed() {
		_driver.findElement(btn_logout).isDisplayed();
	}
	
	
	public void loginValidUser(String username, String password) {
		_driver.findElement(txt_usernameField).sendKeys(username);
		_driver.findElement(txt_passwordField).sendKeys(password);
		_driver.findElement(btn_login).click();
	
	}
	
}
