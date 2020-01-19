import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class firstClass {
    WebDriver driver;

    @Before
    public void setUp() {
        //podanie sciezki do chromedrivera
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //wystaruj przegladarke:
        driver = new ChromeDriver();

    }

    @Test
    public void checkIfPracujPlTitleIsCorrect() {
        //zadeklaruj strone ktora otwieramy:
        String baseUrl = "https://www.pracuj.pl/";
        //Otworz strone pracuj.pl
        driver.get(baseUrl);

        //tytul zwrocony przez webdrivera
        String actualTitle = driver.getTitle();
        //tytul oczekiwany (developerstool znacznik <title>)
        String expectedTitle = "Praca - Pracuj.pl";

        //Porownanie: tytul zwrocony przez driver z oczekiwanym
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Test
    public void checkIfPracujPlTitleIsCorrect2() {



    }


    @After
        public void tearDown(){
        driver.close();
    }

}

