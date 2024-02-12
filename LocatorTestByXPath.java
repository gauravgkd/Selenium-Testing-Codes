import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTestByXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
//		WebDriverManager.chromedriver();
//		WebDriverManager driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
//		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")); // Relative Path
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/a")); // Absolute Path
		searchBox.click();
		
		WebElement loginMail = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		loginMail.sendKeys("1245362521");
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		submitButton.click();
		
	}

}
