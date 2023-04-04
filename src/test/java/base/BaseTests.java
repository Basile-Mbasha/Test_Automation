package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver"); // add .exe extension on Windows
        driver = new ChromeDriver();

        // Launch browser and load URL
        driver.get("https://the-internet.herokuapp.com/");

        // Get the Shifting Content link and click it
        driver.findElement(By.linkText("Shifting Content")).click();

        // Get the Example 1: Menu Element and click it
        driver.findElement(By.linkText("Example 1: Menu Element")).click();

        // Get the list of menu items in Example 1 and print out it's size
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.printf("In Example 1, the number of menu items is %d\n", menuItems.size());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setUp();
    }
}
