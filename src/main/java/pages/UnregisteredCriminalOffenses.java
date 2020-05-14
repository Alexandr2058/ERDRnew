package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class UnregisteredCriminalOffenses extends ParentPage {
    public UnregisteredCriminalOffenses(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void chooseKP() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.chooseOffense("tpBody_38","Проект");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
