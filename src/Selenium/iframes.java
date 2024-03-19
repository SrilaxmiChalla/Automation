package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframes {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(frame1);
    driver.findElement(By.name("mytext1")).sendKeys("Srilaxmi");
    driver.switchTo().defaultContent();
    
    WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
	driver.switchTo().frame(frame2);
    driver.findElement(By.name("mytext2")).sendKeys("Prathyush");
    driver.switchTo().defaultContent();
    
    WebElement frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	driver.switchTo().frame(frame3);
    driver.findElement(By.name("mytext3")).sendKeys("Maukshi");
    driver.switchTo().defaultContent();
    
    driver.switchTo().frame(frame3);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//*[@id=\"i11\"]/div[3]/div")).click();
    driver.switchTo().defaultContent();
      
    
	}

}
