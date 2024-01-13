package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import base.SharedSteps;

public class SearchPage {
	@FindBy(id = "small-searchterms")
	public static WebElement Search_Box;
	
	@FindBy(xpath = "//input[@value='Search']")
	public static WebElement Search_Button;


	public SearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}

	/*public String get_homepage_title() throws InterruptedException {
		String title = SharedSteps.driver.getTitle();
		return title;
	}*/

	public void click_On_Search() throws InterruptedException {
		Thread.sleep(2000);
		Search_Box.sendKeys();
	}
	
	public void click_On_Search_Button() throws InterruptedException {
		Thread.sleep(2000);
		Search_Button.click();
	}

}
