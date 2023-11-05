package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;

public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;

    public TestSteps(ContextSetup setup){
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }
//Check Home button start
    @Given("Check home button is available")
    public void checkHomeButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(testingApp.Get_Home().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the home button")
    public void clickOnTheHomeButton() throws InterruptedException {

        WebElement homeButton = testingApp.Click_Home();
        homeButton.click();
        Thread.sleep(2000);
    }

    @Then("Check that home is display")
    public void checkThatHomeIsDisplayed() throws InterruptedException {
        Assert.assertTrue(testingApp.Click_Home_page().isDisplayed());
        Thread.sleep(2000);

    }


//Check Home button end

//Check Categories Start
    @Given("Check categories button is available")
    public void checkCategoriesButtonIsAvailable() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Get_categories().isDisplayed());
        Thread.sleep(2000);
}

    @When("Click on the Categories button")
    public void clickOnTheCategoriesButton() throws InterruptedException {
         testingApp.Click_categories().click();
         Thread.sleep(2000);


    }

    @Then("Check the Categories is Display")
    public void checkTheCategoriesIsDisplay() throws InterruptedException {
        Assert.assertTrue(testingApp.Click_categories_page().isDisplayed());
        Thread.sleep(2000);
    }


//Check Categories End

//Check Support Start
    @Given("Check Support button is available")
    public void checkSupportButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(testingApp.Get_support().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click on the Support button")
    public void clickOnTheSupportButton() throws InterruptedException {
       testingApp.Click_support().click();
       Thread.sleep(2000);

    }

    @Then("Check the Support us Display")
    public void checkTheSupportUsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_support_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Support End

//Check Slider Start
    @Given("Check Slider button is available")
    public void checkSliderButtonIsAvailable() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Get_Slider().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the Slider Button")
    public void clickOnTheSliderButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Slider().click();
        Thread.sleep(2000);

    }

    @Then("Check the Slider is Display")
    public void checkTheSliderIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_Slider_page().isDisplayed());
        Thread.sleep(2000);
    }

//Check cart Start

    @Given("Check Cart button is available")
    public void checkCartButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(testingApp.Get_cart().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click the Cart button")
    public void clickTheCartButton() throws InterruptedException {
        Thread.sleep(1000);
         testingApp.Click_cart().click();
         Thread.sleep(2000);
    }

    @Then("Check the cart button")
    public void checkTheCartButton() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_cart_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Cart End

}
