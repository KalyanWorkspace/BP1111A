package steps;

import java.io.IOException;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LearnerSearchPage;
import pageObjects.LoginPage;

import resources.TestBase;


public class AppealsLogin extends TestBase {
	
	
	
	@Given("^the user has access to SQA Appeals Portal$")
    public void the_user_has_access_to_sqa_portal() throws IOException {
		driver= initializeDriver();
		driver.get(OR.getProperty("URLdevAppeals"));
		LoginPage lp = new LoginPage(driver);
    	lp.getEmail().sendKeys(OR.getProperty("CentreUser"));		
		lp.getPassword().sendKeys(OR.getProperty("password"));		
		lp.submitButton().click();	
		
    }
	@When("^the user clicks on Learners$")
    public void the_user_clicks_on_learners()  {
LearnerSearchPage ls = new LearnerSearchPage(driver);
		
		
		Assert.assertEquals("Learners", ls.clickOnLearners().getText()); 
    }
	  
    @Then("^the user will land on the learner search page$")
    public void the_user_will_land_on_the_learner_search_page() {
    	LearnerSearchPage ls = new LearnerSearchPage(driver); 
        	
        	ls.clickOnLogout().click();
    }
    @When("^the user clicks on the centres$")
    public void the_user_clicks_on_the_centres() throws Throwable {
    	LearnerSearchPage ls = new LearnerSearchPage(driver); 
    	ls.clickOnCentres().click();
    }

    @Then("^the user will land on the centre search page$")
    public void the_user_will_land_on_the_centre_search_page(){
    	 
    	LearnerSearchPage ls = new LearnerSearchPage(driver); 
    	Assert.assertEquals("Centre Search", ls.centreSearchText().getText()); 
    	
    }
    @When("^the user clicks on Admin$")
    public void the_user_clicks_on_admin() {
    	LearnerSearchPage ls = new LearnerSearchPage(driver); 
    	ls.clickOnAdmin().click();
    	ls.clickOnKeyDates().click();
        
    }

    @Then("^the user will land on the Learner Direct Service$")
    public void the_user_will_land_on_the_learner_direct_service()  {
    	LearnerSearchPage ls = new LearnerSearchPage(driver); 
    	Assert.assertEquals("Learner Direct Service", ls.learnerDirectServiceText().getText()); 
        
    }

}