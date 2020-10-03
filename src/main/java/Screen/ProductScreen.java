package Screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class ProductScreen {

    private static WebDriver driver;

    private WebElement btnAddtoTheCar = driver.findElement(By.id("add-to-cart-button"));
    private WebElement btnShoppingCar = driver.findElement(By.id("nav-cart-count-container"));

    public void addProducttothecar() {
        btnAddtoTheCar.click();
    }

    public void selectShoppingCar() {
        btnShoppingCar.click();
    }
}
