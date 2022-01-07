package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Amudhini");
		driver.findElement(By.name("lastname")).sendKeys("Rajavel");
		driver.findElement(By.name("reg_email__")).sendKeys("9789160305");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9789160305");
		WebElement dd = driver.findElement(By.name("birthday_day"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(9);
		WebElement dd1 = driver.findElement(By.name("birthday_month"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(7);
		WebElement dd2 = driver.findElement(By.name("birthday_year"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("1991");
		WebElement radio1 = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radio1.click();

		


		//driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]")).click();

		
		
	
	
	}

}
