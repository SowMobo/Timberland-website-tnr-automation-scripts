import Poms.HomePage;
import Poms.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AuthenticationTest extends Hook{
    @Test
    public void loginTest() {
        HomePage home = new HomePage(driver);
        LoginPage login = home.closeCookies()
                .closeCommunityPopup()
                .header.openLoginPage();
    }

//    @Test
//    public void logoutTest() {
//        driver.get("https://practice.automationtesting.in/");
//    }
}
