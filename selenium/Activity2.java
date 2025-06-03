import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the login page
        driver.get("https://training-support.net/webelements/login-form/");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Find the username field using XPath and enter "admin"
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("admin");

        // Find the password field using XPath and enter "password"
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("password");

        // Find and click the "Log in" (Submit) button using XPath
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in' or text()='Submit']"));
        loginButton.click();

        // Get and print the login confirmation message using XPath
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@id='action-confirmation' or //h2]"));
        System.out.println("Login message: " + confirmationMessage.getText());

        // Close the browser
        driver.quit();
    }
}