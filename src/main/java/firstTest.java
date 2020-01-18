import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class firstTest {
    public static void main(String[] args) {

        String actualTitle = "";

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.pracuj.pl/";
        String expectedTitle = "Praca - Pracuj.pl";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);

        driver.close();
    }
}
