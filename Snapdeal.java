package task17;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span [text ()='Sign In']")); 
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		driver.findElement(By.linkText("LOGIN")).click();

		WebElement user = driver.findElement(By.xpath("//input[@id ='userName']"));
		WebElement login = driver.findElement(By.name("commit"));
		user.sendKeys("abcd@gmail.com");
		login.click();
		Thread.sleep(1000);
				
		
		
		




//.sendKeys("sankarirvg@gmail.com");
		
		//iframeElement.sendKeys("sankarirvg@gmail.com");
				
		
		//driver.findElement(By.id("checkUser")).click(); 
		
		
		
			
		
	}
	
}
