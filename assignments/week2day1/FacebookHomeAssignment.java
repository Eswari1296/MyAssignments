package assignments.week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssignment {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Create new account")).click();
		//differ x path to use(//a[text()='Create new account'])
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SurName");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9898787676");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Test@Eshu@12");
		WebElement DropDown1= driver.findElement(By.id("day"));
		Select Date = new Select(DropDown1);
		Date.selectByIndex(11);
		WebElement DropDown2= driver.findElement(By.id("month"));
		Select Month = new Select(DropDown2);
		Month.selectByIndex(10);
		WebElement DropDown3= driver.findElement(By.id("year"));
		Select Year = new Select(DropDown3);
		Year.selectByIndex(28);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
}