import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//Set URL
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
		System.out.println("radioButton Found !");
		radioButton.click();
		System.out.println("radioButton Clicked !");
		
		WebElement checkbox = driver.findElement(By.id("vfb-6-1"));
		System.out.println("checkBox Found !");
		checkbox.click();
		System.out.println("checkBox Clicked !");
		
		// Check if checkbox is selected or not
		
		if (checkbox.isSelected())
		{
			System.out.println("Checkbox Selected");
		}
		else {
			System.out.println("Checkbox is Not Selected");
		}
		
		WebElement radioButton1 = driver.findElement(By.id("vfb-7-2"));
		System.out.println("radioButton1 Found !");
		radioButton1.click();
		System.out.println("radioButton1 Clicked !");
		
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-2"));
		System.out.println("checkbox1 Found !");
		checkbox1.click();
		System.out.println("checkbox1 Clicked !");
		
		// Deselecting Checkbox
		
		checkbox.click();
		System.out.println("CheckBox Deselected");
		
		// Check if Checkbox selected or not
		
		if (checkbox.isSelected()) {
			System.out.println("CheckBox Selected !");
		}
		else {
			System.out.println("CheckBox Not Selected !");
		}
		
	}

}
