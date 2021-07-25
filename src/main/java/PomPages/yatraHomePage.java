package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yatraHomePage {
	
	@FindBy(id="BE_flight_flsearch_btn")
	private WebElement searchbtn;
	
	public yatraHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchbutton() {
		searchbtn.click();
	}
	
	
	
	
	

}
