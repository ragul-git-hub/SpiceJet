package spicejet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Driver {


	

	
	public  void driver ()throws IOException, InterruptedException {
		WebDriver driver;

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option); // initial
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		JourneyDetail route = new JourneyDetail(driver);
		route.departureCity();
		route.destinationCity();
		TripSchedule Tripdates = new TripSchedule(driver);
		Tripdates.startDate();
		Tripdates.passengersInfo();
		FlightInfo flight = new FlightInfo(driver);
		flight.availableFlights();
		driver.quit();
		
	}
	

}
