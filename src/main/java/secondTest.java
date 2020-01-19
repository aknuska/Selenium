import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class secondTest {

    WebDriver driver;

    @Before
    public void setUp() {
        //podanie sciezki do chromedrivera
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //wystaruj przegladarke:
        driver = new ChromeDriver();
    }

    @Test
    public void checkIfCanLogInToGuru() {
        //zadeklaruj strone ktora otwieramy:
        String baseUrl = "http://demo.guru99.com/test/login.html";
        //Otworz strone pracuj.pl
        driver.get(baseUrl);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Agnieszka");

        WebElement passwd = driver.findElement(By.id("passwd"));
        passwd.sendKeys("Haselko");

        WebElement btn = driver.findElement(By.cssSelector("button"));
        btn.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Otworzyl strone: "+ currentUrl);

        String expectedUrl = "http://demo.guru99.com/test/success.html";
        assertThat(currentUrl).isEqualTo(expectedUrl);

        String curretTxt = driver.findElement(By.tagName("h3")).getText();
        System.out.println("" + curretTxt);

        String expectedText = "Successfully Logged in...";
        assertThat(curretTxt).isEqualTo(expectedText);
    }


    @After
    public void tearDown(){
        //driver.close();
    }
}
