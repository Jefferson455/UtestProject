package co.com.projectutest.stepdefinitions;
import co.com.projectutest.model.UtestData;
import co.com.projectutest.task.Register;
import co.com.projectutest.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jefferson wants to register at the page Utest$")
    public void thanJeffersonWantsToRegisterAtThePageUtest(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled( "Jefferson" ).wasAbleTo(
                OpenUp.thePage(), (
                        Register.onThePage(
                                utestData.get( 0 ).getStrFirstName(),
                                utestData.get( 0 ).getStrLastName(),
                                utestData.get( 0 ).getStrEmail(),
                                utestData.get( 0 ).getStrMonth(),
                                utestData.get( 0 ).getStrDay(),
                                utestData.get( 0 ).getStrYear(),
                                utestData.get( 0 ).getStrPassword())
                )
        );
    }


    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
        //
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
        //
    }
}
