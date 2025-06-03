import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {

        // Start Firefox browser
        WebDriver driver = new FirefoxDriver();

        // Open the target web page
        driver.get("https://training-support.net/webelements/selects");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Find the dropdown menu
        WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));

        // Create a Select object to handle the dropdown
        Select select = new Select(dropdown);

        // Select option "Two" by visible text
        select.selectByVisibleText("Two");
        System.out.println("Selected option: " + select.getFirstSelectedOption().getText());

        // Select the 4th option (index starts at 0)
        select.selectByIndex(3);
        System.out.println("Selected option: " + select.getFirstSelectedOption().getText());

        // Select option using value "four"
        select.selectByValue("four");
        System.out.println("Selected option: " + select.getFirstSelectedOption().getText());

        // Print all options in the dropdown on one line
        System.out.print("All dropdown options: ");
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.print(options.get(i).getText());
            if (i < options.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // New line after printing all options

        // Close the browser
        driver.quit();
    }
}

        
        
        
        
/*import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the dropdown
        WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
        // Pass the WebElement to the Select object
        Select singleSelect = new Select(dropdown);

        // Select the second option using visible text
        singleSelect.selectByVisibleText("Two");
        // Print the selected option
        System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());

        // Select the third option using index
        singleSelect.selectByIndex(3);
        // Print the selected option
        System.out.println("Third option: " + singleSelect.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        singleSelect.selectByValue("four");
        // Print the selected option
        System.out.println("Fourth option: " + singleSelect.getFirstSelectedOption().getText());

        // Print all the options
        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
*/
