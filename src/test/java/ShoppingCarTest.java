import Setup.TestSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Screen.HomeScreen;
import Screen.ProductScreen;
import Screen.SearchList;
import Screen.ShoppingCar;

import java.net.MalformedURLException;

public final class ShoppingCarTest {

    private WebDriver driver;
    private HomeScreen homeScreen;
    private ProductScreen productScreen;
    private SearchList searchList;
    private ShoppingCar shoppingCar;

    // Prevents this class from being instantiated
    private ShoppingCarTest() {
    }

    @BeforeMethod
    public void setUp(){
        TestSetup.Setup();
    }

    @Test
    public void canAddProductToShoppingCar() {
        homeScreen.searchProduct();
        searchList.selectFirstResult();
        productScreen.addProducttothecar();
    }

    @Test
    public void canRemoveAnyProduct(){
        homeScreen.selectShoppingCar();
        shoppingCar.removeProduct();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
