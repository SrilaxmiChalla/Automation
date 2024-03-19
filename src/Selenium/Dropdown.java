package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/register.php");
	
	Select dropdown=new Select(driver.findElement(By.name("title")));
	
	dropdown.selectByIndex(15);
	
	//dropdown.selectByValue("Major");
	//dropdown.selectByVisibleText("General");
	
	//Select year=new Select(driver.findElement(By.id("user_dateofbirth_1i")));
	//year.selectByIndex(6);
	//Select month=new Select(driver.findElement(By.name("month")));
	//month.selectByVisibleText("January");
	//Select date=new Select(driver.findElement(By.name("date")));
	//date.selectByValue("6");
	//Select LC=new Select(driver.findElement(By.id("user_licenceperiod")));
	//LC.selectByIndex(12);
	//Select Occupation=new Select(driver.findElement(By.name("occupation")));
	//Occupation.selectByValue("9");

	}

}
