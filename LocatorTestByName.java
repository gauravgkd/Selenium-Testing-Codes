import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorTestByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Driver Setup
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		// Set Url
		
		driver.get("https://www.google.com");
		
		// Select TextField on Browser
		
		// Find Element by Name
		
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("CDAC");
		
		

	}

}
