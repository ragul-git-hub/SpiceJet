package spicejet;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import components.ActionComponents;

public class FlightInfo extends ActionComponents {
	
	
	WebDriver driver;
	public FlightInfo(WebDriver driver) 
	{
		super(driver);	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public  void availableFlights() throws IOException, InterruptedException {
		
		
				
		scrolling();
		screenShot();
		
		
	}
	

}
