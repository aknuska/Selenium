import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class secondTest {
    private WebDriver driver;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement submitButton;
    private String baseUrl;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfUserCanLoginOnGuru99() {
        baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("abc@gmail.com");

        passwordField = driver.findElement(By.id("passwd"));
        passwordField.sendKeys("passwd");

        submitButton = driver.findElement(By.id("SubmitLogin"));
        submitButton.submit();

        assertThat(driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText())
                .contains("Successfully Logged in...");
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
