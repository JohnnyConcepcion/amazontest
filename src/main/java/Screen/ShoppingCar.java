package Screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCar {

    private WebDriver driver;

    WebElement btnRemoveProduct = driver.findElement(By.className("a-size-small sc-action-delete"));

    public void removeProduct () {
        btnRemoveProduct.click();
    }
}
