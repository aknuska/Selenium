import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfUserCanLoginOnGuru99() {
        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
