package spicejet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JourneyDetail {

	WebDriver driver;

	public JourneyDetail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'] input[autocapitalize='sentences']")
	WebElement fromCity;

	@FindBy(css = "div[class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3'] div[class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'] div[class='css-1dbjc4n'] div[class='css-1dbjc4n r-18u37iz']")
	List<WebElement> suggestedCity;

	public void departureCity() {

		fromCity.sendKeys("Pu");
		suggestedCity.stream().filter(s -> s.getText().equalsIgnoreCase("Pune")).forEach(s -> s.click());

	}

	public void destinationCity() {

		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.sendKeys("De");

		List<WebElement> cityName = driver.findElements(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//div[1]"));

		for (WebElement destination : cityName) {
			if (destination.getText().equalsIgnoreCase("Delhi")) {
				destination.click();
				break;

			}
		}

	}

}
