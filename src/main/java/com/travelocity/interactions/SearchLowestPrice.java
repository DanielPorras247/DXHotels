package com.travelocity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.travelocity.userinterfaces.ResultsPage.*;

public class SearchLowestPrice implements Interaction {

    private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

    public static SearchLowestPrice ofResults() {
        return Tasks.instrumented(SearchLowestPrice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> hoteles = DIV_HOTELS.resolveAllFor(actor);
        int valorMenor=100000;
        int aux=0;
        int fila=0;
        for (int i=1; i<= hoteles.size();i++){
            WebElementFacade hotel = hoteles.get(i-1);
            By PRICE = By.xpath("(//p[@class='rate-number'])["+i+"]");
            if(hotel.find(PRICE).isVisible()){
                String price = hotel.find(PRICE).getText();
                price = price.replace("$","");
                aux = Integer.parseInt(price);
                if(aux<valorMenor){
                    valorMenor = aux;
                    fila = i;
                }
            }
        }
        WebElement webElement = driver.findElement(By.xpath("(//span[contains(text(),'Book it')])["+fila+"]"));
        webElement.click();
    }
}
