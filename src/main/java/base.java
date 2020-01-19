import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

    public WebDriver driver;

    @Before
    public void setUp() {
        //podanie sciezki do chromedrivera
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //wystaruj przegladarke:
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        //driver.close();
    }
}
