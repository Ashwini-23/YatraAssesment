package genericlib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
public void dropDown(WebElement ele,String text) {
	Select s=new Select(ele);
	if(s.isMultiple()) {
		System.out.println("DropDown is Multiselect");
	}
	s.selectByVisibleText(text);
}
public void mouseHover(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
}
public void doubleClick(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
}
public void alertPopup(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void switchFrame(WebDriver driver) {
	driver.switchTo().frame(0);
}
public void switchBack(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void scrollBar(WebDriver driver,int x,int y) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy("+x+","+y+")");
}
public void switchTab(WebDriver driver) {
	Set<String> ele = driver.getWindowHandles();
	for (String b : ele) {
		driver.switchTo().window(b);
	}
}

}
