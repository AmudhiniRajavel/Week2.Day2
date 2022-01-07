package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]")).click();
		

		WebElement firstName = driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']"));
		firstName.sendKeys("Amudhini");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
	}

}
