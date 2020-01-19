import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class thirdclass extends base {
    //WebDriver driver;

    @Test
    public void checkIfCanLogInToGuru() {
        //zadeklaruj strone ktora otwieramy:
        String baseUrl = "https://subaru-maps.com/#/signup/names";
        driver.get(baseUrl);

        //trzeba poczekać na pierwszy element zeby byl widoczny
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputName"))).sendKeys("Zosia");

        //na resztenie trzeba juz czekac
        driver.findElement(By.id("inputUserSurname")).sendKeys("Nowak");
        driver.findElement(By.id("inputEmail")).sendKeys("sample2@mail.com");
        driver.findElement(By.id("inputEmailConfirm")).sendKeys("sample2@mail.com");
        //driver.findElement(By.id("nextButton")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nextButton"))).click();

        String haslo = "aAdsjdjals2";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputPassword"))).sendKeys(haslo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputPasswordConfirm"))).sendKeys(haslo);

        driver.findElement(By.id("acceptNotification")).click();
        driver.findElement(By.id("acceptTerms")).click();


    }

}
