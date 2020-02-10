

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class HomePage extends PageBase {

    //*********Constructor*********
    public HomePage(WebDriver driver) {
        super(driver);
    }
        
    
	//*********Web Elements*********
    By btnUploadBy = By.id("upload");
 
    
	
	//*********Page Methods*********
   	
	
	public HomePage clickOnUploadButton() {
		click(btnUploadBy);
	
		return this;	
	}
	
	public HomePage goToGoogleDotCom() {
		
		goToWebPage("https://www.google.com");
	
		return this;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}