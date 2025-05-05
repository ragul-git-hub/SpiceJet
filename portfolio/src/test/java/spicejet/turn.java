package spicejet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class turn {

	public static void main(String[] args) {
		
			WebDriver driver;
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option); // initial
			driver.manage().window().fullscreen();
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-zso239'] svg[data-testid='svg-img'] circle[fill-rule='evenodd']")).click();
			driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")).click();
			List<WebElement>returnMonth = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
			
			for(WebElement dat:returnMonth) {
				if(dat.getText().contains("September")) {
				
			
			List<WebElement> d = dat.findElements(By.xpath("./parent::div/following-sibling::div[2]/div/div"));
			
			for(WebElement mydate:d) {
				if(mydate.getText().contains("28")) {
					
					mydate.click();
					break;
				}
			}
			
			break;
		}
	}
	}
}


