import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class firstTest {

    private WebDriver driver;

    //metoda wywoływana przed kazdym testem
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfPracujPlTitleIsCorrect() {
        String actualTitle = "";
        String baseUrl = "https://www.pracuj.pl/";
        String expectedTitle = "Praca - Pracuj.pl";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
