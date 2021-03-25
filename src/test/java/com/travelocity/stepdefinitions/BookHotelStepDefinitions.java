package com.travelocity.stepdefinitions;

import com.travelocity.questions.VerifyRoom;
import com.travelocity.tasks.SearchHotel;
import com.travelocity.tasks.SelectHotel;
import com.travelocity.userinterfaces.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BookHotelStepDefinitions {
    @Given("that the user navigate to the dx hotels website")
    public void thatTheUserNavigateToTheDxHotelsWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(HomePage.class));
    }

    @When("search a hotel")
    public void searchAHotel(DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(SearchHotel.onPage(data));
    }

    @When("book a hotel room")
    public void bookHotelRoom() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectHotel.withLowestPrice());
    }

    @Then("verify that the room was selected")
    public void verifyThatTheRoomWasSelected(DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().should(seeThat(VerifyRoom.reserved(), Matchers.equalTo(data.get(0))));
    }
}
