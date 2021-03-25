package com.travelocity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResultsPage extends PageObject {
    public static final Target DIV_HOTELS = Target.the("Input location").locatedBy("//div[@class='hotels-data']");
}
