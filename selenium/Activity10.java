import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/drag-drop");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Locate the ball and dropzones
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));

        // Drag and drop to Dropzone 1 using clickAndHold + moveToElement + release
        actions.clickAndHold(ball).moveToElement(dropZone1).release().build().perform();
        if (dropZone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
            System.out.println("Ball dropped in Dropzone 1");
        }

        // Drag and drop to Dropzone 2
        actions.clickAndHold(ball).moveToElement(dropZone2).release().build().perform();
        if (dropZone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
            System.out.println("Ball dropped in Dropzone 2");
        }

        // Close the browser
        driver.quit();
    }
}
