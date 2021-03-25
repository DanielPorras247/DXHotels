package com.travelocity.tasks;

import com.travelocity.interactions.SelectDate;
import com.travelocity.interactions.SelectLocations;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.userinterfaces.HomePage.*;

public class SearchHotel implements Task {
    private final List<String> data;

    public SearchHotel(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectLocations.onPage(data.get(0)),
                Click.on(BTN_CHECK_IN),
                SelectDate.intoCalendar(data.get(1)),
                Click.on(BTN_SEARCH));
    }

    public static SearchHotel onPage(List<String> data) {
        return Tasks.instrumented(SearchHotel.class, data);
    }
}
