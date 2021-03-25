package com.travelocity.tasks;

import com.travelocity.interactions.SearchLowestPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class SelectHotel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SearchLowestPrice.ofResults());
    }

    public static SelectHotel withLowestPrice() {
        return Tasks.instrumented(SelectHotel.class);
    }
}
