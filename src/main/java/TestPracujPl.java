import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPracujPl {

    WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        String baseURL = "https://www.pracuj.pl/";
        driver.get(baseURL);
    }

    @Test
    public void verifyPageTitle(){

        String actualTitle = driver.getTitle();

        String expectedTitle = "Praca2 - Pracuj.pl";
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Test
    public void veriftPracujPlLogo(){


    }

    @After
    public void after(){
        driver.close();
    }


}
