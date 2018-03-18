package starter;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class googleSearchPage extends PageObject {

    public void openGoogle(){
        withDriver(getDriver()).openUrl("https://www.google.com");
    }
    public void search(String text){
        getDriver().findElement(By.cssSelector("input[title='Search']")).sendKeys(text);
        getDriver().findElement(By.cssSelector("input[value='Google Search']")).click();
    }
}
