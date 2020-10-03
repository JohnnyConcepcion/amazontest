package Screen;

import Utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class SearchList {

    private static WebDriver driver;

   private WebElement firstresult = driver.findElement(By.className("sg-col-inner"));

   public boolean isTheresaResult() {
       return ElementUtils.isDisplayed(firstresult);
   }

   public void selectFirstResult() {
       firstresult.click();
   }

}
