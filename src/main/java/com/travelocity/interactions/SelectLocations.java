package com.travelocity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.travelocity.userinterfaces.HomePage.INPUT_LOCATION;

public class SelectLocations implements Interaction {

    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    private final String content;

    public SelectLocations(String content) {
        this.content = content;
    }

    public static SelectLocations onPage(String content) {
        return Tasks.instrumented(SelectLocations.class, content);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_LOCATION));
        WebElement webElement = driver.findElement(By.xpath("(//div[@class='dx-item-content dx-list-item-content'])[" + content + "]"));
        webElement.click();
    }
}
