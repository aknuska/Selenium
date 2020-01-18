import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

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
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("passwd");

        driver.findElement(By.id("SubmitLogin")).submit();

        assertThat(driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText())
                .contains("Successfully Logged in...");
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
