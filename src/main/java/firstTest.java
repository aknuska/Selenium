import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {

        String actualTitle = "";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.pracuj.pl/";
        String expectedTitle = "Praca - Pracuj.pl";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle))  {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! " +  actualTitle);
        }
        driver.close();
    }
}
