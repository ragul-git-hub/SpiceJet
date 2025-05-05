package components;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ActionComponents {
	 WebDriver driver;
	public ActionComponents(WebDriver driver) {
		this.driver = driver;
		
	}


	public  void screenShot() throws IOException, InterruptedException {
		
//		WebDriverWait explicit = new WebDriverWait(driver,Duration.ofSeconds(15));
//		explicit.until(ExpectedConditions.visibilityOfElementLocated((path)));
	Thread.sleep(10000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/rragulm/Pictures/Screenshots.png"));

	}
	
	
	public  void scrolling()  {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
	}

}
