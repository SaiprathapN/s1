package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {
	//initialization
	public WebPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//declaration
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	@FindBy(xpath="//label[text()='First name:']/following-sibling::input")
	private WebElement firstNameTextfileld;

	public WebElement getFirstNameTextfileld() {
		return firstNameTextfileld;
	}
	
}
