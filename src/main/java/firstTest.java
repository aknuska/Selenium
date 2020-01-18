import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {

        System.out.println("Hello in first class");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.pracuj.pl/");
        driver.close();

    }

}
