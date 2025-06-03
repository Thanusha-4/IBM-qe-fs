import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://training-support.net");

        // Print the home page title
        System.out.println("Home page title: " + driver.getTitle());

        // Click the "About Us" link using XPath
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        // Print the new page's title
        System.out.println("About Us page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

