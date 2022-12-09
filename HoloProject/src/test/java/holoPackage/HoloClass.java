package holoPackage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HoloClass {
	
	
	

	
	@Test(priority = 1)
	
	public void Holo() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/ChromeSource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.useholo.com/en/mortgage-products-services");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		driver.findElement(By.id("purchaseType")).click();
		driver.findElement(By.xpath("//*[@id=\"purchaseType\"]/div[3]/button[2]")).click();
		
		driver.findElement(By.id("residenceStatus")).click();
		driver.findElement(By.xpath("//*[@id=\"residenceStatus\"]/div[3]/button[2]")).click();
		
		driver.findElement(By.id("nationality")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]/div[3]/button[2]")).click();
		
		
		driver.findElement(By.id("existingMortgage")).click();
		driver.findElement(By.xpath("//*[@id=\"existingMortgage\"]/div[3]/button[2]")).click();
		
		driver.findElement(By.id("applicantType")).click();
		driver.findElement(By.xpath("//*[@id=\"applicantType\"]/div[3]/button[2]")).click();
		
		driver.findElement(By.id("employmentStatus")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentStatus\"]/div[3]/button[2]")).click();
		

		driver.findElement(By.name("monthlyIncome")).click();
		driver.findElement(By.name("monthlyIncome")).sendKeys("25000");
		driver.findElement(By.xpath("//*[@id=\"monthlyIncome\"]/div[3]/button[2]")).click();
		
		driver.findElement(By.name("age")).click();
		driver.findElement(By.name("age")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"age\"]/div[3]/button[2]")).click();
		
		
		driver.findElement(By.id("foundProperty")).click();
		driver.findElement(By.xpath("//*[@id=\"foundProperty\"]/div[3]/button[2]")).click();
		
		
		
		driver.findElement(By.name("propertyValue")).click();
		driver.findElement(By.name("propertyValue")).sendKeys("2000000");
		driver.findElement(By.xpath("//*[@id=\"propertyValue\"]/div[4]/button[2]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"loanToValue\"]/div[4]/button[2]")).click();


	}
}
	
	
