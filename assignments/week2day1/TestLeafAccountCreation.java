package assignments.week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeafAccountCreation {public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Eshu");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	WebElement Industry= driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	Select sec=new Select(Industry);
	sec.selectByVisibleText("Computer Software");
	WebElement Ownership= driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	Select sec1=new Select(Ownership);
	sec1.selectByVisibleText("S-Corporation");
	WebElement Source= driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	Select sec2=new Select(Source);
	sec2.selectByValue("LEAD_EMPLOYEE");
	WebElement MC= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	Select sec3=new Select(MC);
	sec3.selectByIndex(6);
	WebElement State= driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	Select sec4=new Select(State);
	sec4.selectByValue("TX");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	driver.close();
}
}