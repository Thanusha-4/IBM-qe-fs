import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        // Launch Firefox browser
        WebDriver driver = new FirefoxDriver();
        
        // Set up an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the website
        driver.get("https://www.training-support.net/webelements/dynamic-content");

        // Print page title
        System.out.println("Page title: " + driver.getTitle());

        // Click the Generate button
        WebElement generateButton = driver.findElement(By.id("genButton"));
        generateButton.click();

        // Wait for the word "release" to appear in the element
        WebElement wordElement = driver.findElement(By.id("word"));
        wait.until(ExpectedConditions.textToBePresentInElement(wordElement, "release"));

        // Print the word
        System.out.println("Word found: " + wordElement.getText());

        // Close the browser
        driver.quit();
    }
}
/*
 * import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.training-support.net/webelements/dynamic-content");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the button and click it
        driver.findElement(By.id("genButton")).click();
        // Wait for the word to appear
        if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"))) {
            // Print the text to console
            System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
        }
        // Close the browser
        driver.quit();
    }
}*/
