import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		// Automate for Invalid Credentials
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login-button_container\"]/div/form/div[3]"));
		
		// Automate for Valid Credentials
		driver.get("https://www.saucedemo.com/");
		
		// for Standard User
		username.clear();
		username.sendKeys("standard_user");
		password.clear();
		password.sendKeys("secret_sauce");
		loginBtn.click();
		System.out.println("standard_user logged in !");
		
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(1500);
		
		WebElement logout = driver.findElement(By.id("logout sidebar link"));
		logout.click();
		System.out.println("standard_user logged out !");
		
		Thread.sleep(3000);
		
		// for locked_out_user
		driver.get("https://www.saucedemo.com/");
		username.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		loginBtn.click();
		System.out.println("locked_out_user logged in !");
		menu.click();
		Thread.sleep(1500);
		logout.click();
		System.out.println("locked_out_user logged out !");
		
		Thread.sleep(3000);
		
		// For invalid Credentials
		driver.get("https://www.saucedemo.com/");
		username.sendKeys("asdsA");
		password.sendKeys("asdsa");
		loginBtn.click();
		System.out.println(errorMsg.getText());
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		

	}

}
