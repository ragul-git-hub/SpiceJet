package spicejet;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TripSchedule {

	 WebDriver driver;

	public TripSchedule(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")
	List<WebElement> totalMonth;

	public void startDate() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		for (WebElement month : totalMonth) {

			String name = "August";
			if (month.getText().contains(name)) {
				List<WebElement> dates = month.findElements(By.xpath(
						"./parent::div/parent::div//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
				for (WebElement preferredDate : dates) {
					if (preferredDate.getText().contains("27")) {
						preferredDate.click();
						break;
					}
				}
				break;
			}

		}

	}
	public void passengersInfo() {
		
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")).click();
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
	}
}
