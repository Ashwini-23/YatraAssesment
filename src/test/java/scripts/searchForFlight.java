package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.searchFlightPage;
import PomPages.yatraHomePage;
import genericlib.BaseClass;

public class searchForFlight extends BaseClass {
	@Test
	public void searchFlight() throws FileNotFoundException, IOException, InterruptedException {
		
		yatraHomePage yhp = new yatraHomePage(driver);
		yhp.searchbutton();
		
		searchFlightPage sfp = new searchFlightPage(driver);
		
		sfp.fromtfclr();
		sfp.fromtextfield(p.getData("from"));
		
		sfp.totfcli();
		sfp.totfclr();
		sfp.totextfield(p.getData("To"));
		sfp.searchagainbutton();
		Thread.sleep(6000);
	
	}
}
