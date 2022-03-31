package retosistecredito.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.Pay;

public class retoSistecreditoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than Isabel wants to enter products and redirect to successful checkout")
    public void thanIsabelWantsToEnterProductsAndRedirectToSuccessfulCheckout() {
        OnStage.theActorCalled("Isabel").wasAbleTo(OpenUp.thePage(), Pay.onThePage());
    }

    @When("you select a product you are redirected to checkout")
    public void youSelectAProductYouAreRedirectedToCheckout() {
    }

    @Then("it shows the process of the purchase completed successfully")
    public void itShowsTheProcessOfThePurchaseCompletedSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Elige tu medio de pago",Answer.toThe()));
    }
}
