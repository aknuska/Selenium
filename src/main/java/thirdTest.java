import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputName"))).sendKeys("Anna");

        driver.findElement(By.id("inputUserSurname")).sendKeys("Nowak");
        driver.findElement(By.id("inputEmail")).sendKeys("sample@mail.com");
        driver.findElement(By.id("inputEmailConfirm")).sendKeys("sample@mail.com");
        driver.findElement(By.id("nextButton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputPassword"))).sendKeys("adjdsjdjals");
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
