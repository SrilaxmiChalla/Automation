package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactionsdouble {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//doubleclick
		Actions Act=new Actions(driver);
		WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Act.doubleClick(Double).perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
