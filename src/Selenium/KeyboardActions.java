package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("text1")).sendKeys("Welcome to Selenium");
		Actions Act=new Actions(driver);
		Act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(2000);
		Act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"textCompareForm\"]/div/table/tbody/tr/td[3]/button")).click();
		
	}

}
