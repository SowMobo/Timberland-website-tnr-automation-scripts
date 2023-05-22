package Common;

import Poms.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    public WebDriver driver;
    public Header(WebDriver driver) {
        this.driver = driver;
    }
    By topNavBy = By.cssSelector(".topnav-header .topnav-utility-item");
    private WebElement getTopNavElementBy(int index) {
        return driver.findElements(topNavBy).get(index);
    }
    public LoginPage openLoginPage() {
        getTopNavElementBy(1).click();
        return new LoginPage(driver);
    }
}
