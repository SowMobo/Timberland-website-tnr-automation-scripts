package Poms;

import Common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.timberland.fr/");
    }
    public HomePage closeCookies() {
        driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"))
                .click();
        return new HomePage(driver);
    }

    public HomePage closeCommunityPopup() {
        driver.findElement(By.cssSelector("div.tbl-S23_community-and-newsletter-popover__close"))
                .click();
        return new HomePage(driver);
    }
}
