import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://training-support.net/webelements/target-practice");

        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find and print the 3rd header's text using XPath
        WebElement thirdHeader = driver.findElement(By.xpath("(//h3)[1]"));
        System.out.println("Third header text: " + thirdHeader.getText());

       
        // Find and print the 5th header's color using XPath
        WebElement fifthHeader = driver.findElement(By.xpath("(//h5)[1]"));
        String colorValue = fifthHeader.getCssValue("color");
        System.out.println("Fifth header color: " + colorValue);

        // Find the Purple button by its text and print its classes
        WebElement purpleButton = driver.findElement(By.xpath("//button[text()='Purple']"));
        System.out.println("Purple button classes: " + purpleButton.getAttribute("class"));

        // Find the Slate button using XPath and print its text
        WebElement slateButton = driver.findElement(By.xpath("//button[contains(@class, 'slate')]"));
        System.out.println("Slate button text: " + slateButton.getText());

        // Close the browser
        driver.quit();
    }
}
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/target-practice");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the 3rd header and print its text
        String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
        System.out.println(thirdHeaderText);
        // Find the 5th header and print its color
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

        // Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);

        // Close the browser
        driver.quit();
    }
}*/