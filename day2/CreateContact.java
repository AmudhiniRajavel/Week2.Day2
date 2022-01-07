package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Amudhini");
		driver.findElement(By.id("lastNameField")).sendKeys("Rajavel");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Amudhini");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Rajavel");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createContactForm_description"))
				.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
		WebElement dd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(dd);
		dropdown.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Nothing");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
