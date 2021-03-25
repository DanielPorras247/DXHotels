package com.travelocity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDate implements Interaction {
    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    private final String content;

    public SelectDate(String content) {
        this.content = content;
    }

    public static SelectDate intoCalendar(String content) {
        return Tasks.instrumented(SelectDate.class, content);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement webElement = driver.findElement(By.xpath("//td[@data-value='"+content+"']"));
        webElement.click();
    }
}
