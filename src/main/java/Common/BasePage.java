package Common;

import Poms.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;
    public Header header;
    public Footer footer;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
        footer = new Footer(driver);
    }

}
