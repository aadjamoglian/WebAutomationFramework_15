package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends WebAPI {
    // Test Class
    HomePage homePage;
//    Registration registration;

    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
//        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test
    public void demo() {

    }

    @Test(enabled = true)
    public void testSearchBox() throws InterruptedException {
        getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        String expectedText = "\"Mask\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

    @Test(enabled = true)
    public void testSearchBox1() throws InterruptedException {
        getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        sleepFor(3);
        String expectedText = "\"Mask1\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

}
