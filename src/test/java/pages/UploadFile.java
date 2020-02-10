

package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageBase;

public class UploadFile extends PageBase {
	   public UploadFile(WebDriver driver) {
	        super(driver);
	    }

	public static void uploadFile(String fileLocation, String fileName) throws IOException {
	
	Runtime.getRuntime().exec(fileLocation + "\\"+ fileName +".exe");
	sleep(3);
	
	}
}
