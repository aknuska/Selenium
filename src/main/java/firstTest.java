import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args) {

        String baseURL = "https://www.pracuj.pl/";


        System.out.println("Hello in first class");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        String actualTitle = driver.getTitle();
        System.out.println("tytul z wrorcony:" + actualTitle);

        String expectedTitle = "Praca - Pracuj.pl";

        if(expectedTitle.equals(actualTitle)){
            System.out.println("SUKCES");
        }
        else {
            System.out.println("FAIL");
        }


        driver.close();



    }

}
