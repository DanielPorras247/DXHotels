package com.travelocity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static final Target INPUT_LOCATION = Target.the("Input location").locatedBy("[class='dx-texteditor-container']>div:nth-child(3)");
    public static final Target BTN_CHECK_IN = Target.the("Field Check-in").locatedBy("(//div[@class='dx-button-content']//div)[2]");
    public static final Target BTN_CHECK_OUT = Target.the("Field Check-out").locatedBy("(//div[@class='dx-button-content']//div)[3]");
    public static final Target BTN_SEARCH = Target.the("Button travelers done").locatedBy("(//span[@class='dx-button-text'])[4]");



}
