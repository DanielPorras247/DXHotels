package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.travelocity.userinterfaces.BookHotelElements.TXT_TOTAL_TO_PAY;

public class VerifyRoom implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_TOTAL_TO_PAY).viewedBy(actor).asString();
    }

    public static VerifyRoom reserved() {
        return new VerifyRoom();
    }
}
