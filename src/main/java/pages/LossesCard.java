package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LossesCard extends ParentPage {

    @FindBy (id = "control_12")
    private WebElement amoumtDamage;

    @FindBy (id ="group_9")
    private String damagWind;

    public LossesCard(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void amountOfMaterialDamage() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(damagWind);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.enterTextIntoElement(amoumtDamage, "110,0");
    }
}
