package Cucumber_Project_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cucumber_Project_one {
	@Test
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//driver.findElement(By.id("ControlID-17")).click();
		//driver.findElement(By.linkText("Set SkyBlue Background")).click();
		
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();

		driver.close();

	}
}
