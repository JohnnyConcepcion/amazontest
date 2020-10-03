package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class HomeScreen {

    private static WebDriver driver;

    private WebElement amazonLogo = driver.findElement(By.className("nav-sprite nav-logo-base"));
    private WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
    private WebElement btnsearch = driver.findElement(By.className("nav-input"));
    private WebElement btnShoppingCar = driver.findElement(By.id("nav-cart-count-container"));



    public boolean isHomepageThere() {
        return ElementUtils.isDisplayed(amazonLogo);
    }

    public void searchProduct(){
        searchBar.sendKeys("lenovo");
        btnsearch.click();
    }

    public void selectShoppingCar () {
        btnShoppingCar.click();
    }
}
