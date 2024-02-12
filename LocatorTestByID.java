import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTestByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		// Set URL
		
		driver.get("https://www.yahoo.com");
		WebElement searchBox = driver.findElement(By.id("ybar.sbq"));
		System.out.println("SerachBox Found");
		searchBox.sendKeys("Google");
		System.out.println("Keys Sent !");

	}

}
