package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class blogspot {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("name")).sendKeys("Srilaxmi");
		driver.findElement(By.id("email")).sendKeys("bhagdjn@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9837926523");
		driver.findElement(By.id("address")).sendKeys("hbuhgt7fsaxknjhvfytf");
	
		

	}

}
