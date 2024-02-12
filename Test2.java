import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("http://output.jsbin.com/osebed/2");
        driver.manage().window().maximize();

        Select dropdown = new Select(driver.findElement(By.id("fruits")));
        dropdown.selectByIndex(1);
        dropdown.selectByVisibleText("Banana");

        // Check if the dropdown supports multiple selections before trying to deselect
        if (dropdown.isMultiple()) {
            // dropdown.deselectByValue("Orange"); // This line is not needed for a single-select dropdown
            Thread.sleep(3000);
            dropdown.deselectAll();
        }

        driver.close();
    }
}
