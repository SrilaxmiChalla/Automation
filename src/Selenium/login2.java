package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class login2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.findElement(By.name("title")).click();
		
		Select dropdown=new Select(driver.findElement(By.name("title")));
		dropdown.selectByIndex(0);
		
		driver.findElement(By.name("firstname")).sendKeys("Prathyush");
		driver.findElement(By.name("lastname")).sendKeys("Challa");
		driver.findElement(By.name("phone")).sendKeys("9666560146");
		
		
		Select dob=new Select(driver.findElement(By.name("year")));
		dob.selectByVisibleText("1991");
		
		Select month=new Select(driver.findElement(By.name("month")));
		month.selectByVisibleText("December");
		Select date=new Select(driver.findElement(By.name("date")));
		date.selectByVisibleText("19");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[1]")).click();
		Select lc=new Select(driver.findElement(By.name("licenceperiod")));
		lc.selectByIndex(8);
		Select Occupation=new Select(driver.findElement(By.name("occupation")));
		Occupation.selectByVisibleText("Actor");
		driver.findElement(By.name("street")).sendKeys("GuttalaBazar");
		driver.findElement(By.name("city")).sendKeys("Khammam");
		driver.findElement(By.name("county")).sendKeys("India");
		driver.findElement(By.name("post_code")).sendKeys("507003");
		driver.findElement(By.name("email")).sendKeys("Prathyushchalla@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Prathyush@1929!");
		driver.findElement(By.name("c_password")).sendKeys("Prathyush@1929!");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Prathyushchalla@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Prathyush@1929!");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		Thread.sleep(3000);
		Select Breakdowncover=new Select(driver.findElement(By.id("quotation_breakdowncover")));
		Breakdowncover.selectByVisibleText("At home");
		driver.findElement(By.xpath("//*[@id=\"quotation_windscreenrepair_t\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("incidents")).sendKeys("Checking through News Channel");
		driver.findElement(By.name("registration")).sendKeys("TS08EA9312");
		driver.findElement(By.name("mileage")).sendKeys("60/liter");
		driver.findElement(By.name("value")).sendKeys("1,00,000");
		Thread.sleep(3000);
		Select ParkingLocatoion=new Select(driver.findElement(By.name("parkinglocation")));
		ParkingLocatoion.selectByVisibleText("Locked Garage");
		Select startpolicy=new Select(driver.findElement(By.name("year")));
		startpolicy.selectByVisibleText("2023");
		Select Month=new Select(driver.findElement(By.name("month")));
		Month.selectByVisibleText("July");
		Select date1=new Select(driver.findElement(By.name("date")));
		date1.selectByVisibleText("22");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).sendKeys("save Quotation");
		
		
		

	}

}
