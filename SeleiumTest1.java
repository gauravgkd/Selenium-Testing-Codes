import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleiumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Driver Setup
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		// Set URL
		driver.get("https://www.google.com");
		
	}

}
