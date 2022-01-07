package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnxPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");		 
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();		

		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");	
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Amudhini");		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajavel");
		WebElement dd = driver.findElement(By.xpath("// select[@id = 'createLeadForm_dataSourceId']"));		
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(5);
		driver.findElement(By.name("submitButton")).click();

		// driver.close();

	}

}
