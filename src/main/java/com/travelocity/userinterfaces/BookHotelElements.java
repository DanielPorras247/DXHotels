package com.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookHotelElements {

    public static final Target TXT_TOTAL_TO_PAY = Target.the("Total to pay now").locatedBy("//div[@class='sum']//p");

}
