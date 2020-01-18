import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfUserCanLoginToSubaru() {
        baseUrl = "https://subaru-maps.com/#/signup/names";
        driver.get(baseUrl);

        driver.findElement(By.id("inputName")).sendKeys("Anna");
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
