package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchFlightPage {
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement fromtf;
	
	@FindBy(id="destination_0")
	private WebElement totf;
	
	@FindBy(xpath="//span[text()=\"Search Again\"]")
	private WebElement searchagainbtn;
	
	public searchFlightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fromtfclr() {
		fromtf.clear();
	}
	
	public void fromtextfield(String key) {
		fromtf.sendKeys(key);
	}
	
	public void totfcli() {
		totf.click();
	}
	
	public void totfclr() {
		totf.clear();
	}
	
	public void totextfield(String key) {
		totf.sendKeys(key);
	}
	
	public void searchagainbutton() {
		searchagainbtn.click();
	}

}
