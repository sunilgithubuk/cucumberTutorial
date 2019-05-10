package StepDef;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static StepDef.CucumberHook.getScenario;

public class CucumberBasicStepDef {
    private Scenario scenario;

    public CucumberBasicStepDef(){
        scenario=getScenario();
    }

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        System.out.println("User is on homepage");
    }

    @When("sign up with valid personal data")
    public void sign_up_with_valid_personal_data() {
        System.out.println("sign up with valid personal data");
    }

    @Then("user should get logged in")
    public void user_should_get_logged_in() {
        System.out.println("user should get logged in");
    }

    @And("my account page is displayed")
    public void my_account_page_is_displayed() {
        System.out.println("my account page is displayed");
    }

    @Given("user has a site url (.*)")
    public void user_has_a_site_url(String url) {
        // we have used reg exp (.*) and received as a variable
        System.out.println("feature file has passed the variable: "+url);
    }
    @Given("user has provided (.*)")
    public void user_has_provided_status(String status) {
        System.out.println("user has provided status as: "+status);
    }
    @Given("user has provide personal details as")
    public void user_has_provide_personal_details_as(DataTable dataTable) {
        //we have converted the data table to list of type map
        scenario.write("****** Printing Via scenario method ****");
        List<Map<String,String>> mapUserDetails = dataTable.asMaps();
        System.out.println("User has provide name as: "+mapUserDetails.get(0).get("name"));
        System.out.println("User has provide age as: "+mapUserDetails.get(0).get("age"));
        System.out.println("User has provide name as: "+mapUserDetails.get(1).get("name"));
        System.out.println("User has provide age as: "+mapUserDetails.get(1).get("age"));

    }


}
