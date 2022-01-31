package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class exceptions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.getWindowHandle();
		String url="https://www.google.com";
		driver.manage().window().maximize();
	
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("Selenium");

		Actions builder = new Actions(driver);
		Thread.sleep(3000);
        builder.sendKeys(Keys.ENTER);
				
		//driver.findElement(By.id("input")).sendKeys(Keys.RETURN);
		//driver.quit();
				

	}

}
