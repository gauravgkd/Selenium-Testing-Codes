import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/table/tbody/tr/td[2]/table/tbody/"));
		fname.sendKeys("Gaurav");
		
		WebElement lname = driver.findElement(By.xpath(""));
		lname.sendKeys("Gaurav");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("8698745732");
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("abc@example.com");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Kothurd");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Pune");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharashtra");
		
		WebElement postalCode = driver.findElement(By.name("postalcode"));
		postalCode.sendKeys("456532");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("India");
		
		WebElement email1 = driver.findElement(By.name("email1"));
		email1.sendKeys("abc@example.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1234");
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("1234");
		
		Thread.sleep(5000);
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Thread.sleep(5000);
		
		driver.quit();
			
	}

}
