package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99 {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/register.php");
	
	Select title=new Select(driver.findElement(By.name("title")));
	title.selectByIndex(5);
	
	driver.findElement(By.id("user_firstname")).sendKeys("Srilaxmi");
	
	driver.findElement(By.id("user_surname")).sendKeys("Challa");
	
	driver.findElement(By.id("user_phone")).sendKeys("5871997289");
	
	Select year=new Select(driver.findElement(By.name("year")));
	year.selectByIndex(6);
	
	Select month=new Select(driver.findElement(By.name("month")));
	month.selectByVisibleText("January");
	
	Select date=new Select(driver.findElement(By.name("date")));
	date.selectByValue("6");
	
	driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[2]")).click();
	
	Select LC=new Select(driver.findElement(By.id("user_licenceperiod")));
	LC.selectByIndex(12);
	
	Select Occupation=new Select(driver.findElement(By.name("occupation")));
	Occupation.selectByValue("9");
	
	driver.findElement(By.name("street")).sendKeys("FrenchStreet");
	
	driver.findElement(By.name("city")).sendKeys("Pondicherry");
	
	driver.findElement(By.name("county")).sendKeys("India");
	
	driver.findElement(By.name("post_code")).sendKeys("500021");
	
	driver.findElement(By.name("email")).sendKeys("srilaxmichalla@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("Srilaxmi!");
	
	driver.findElement(By.name("c_password")).sendKeys("Srilaxmi!");
	
	driver.findElement(By.name("submit")).click();
	
	driver.findElement(By.name("email")).sendKeys("srilaxmichalla@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("Srilaxmi!");
	
	driver.findElement(By.name("submit")).click();
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
