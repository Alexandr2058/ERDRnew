package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TemplatePage extends ParentPage {

    @FindBy (id = "control_17")
    private WebElement click;

    @FindBy (id = "control_28")
    private WebElement click2;

    @FindBy (id = "control_24")
    private WebElement click3;

    public TemplatePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void ECP() {
        actionsWithOurElements.ECPF();
        actionsWithOurElements.ECPS();
    }

    @Step
    public void krimProvTab() {
        WebDriverWait wait100;
        wait100 = new WebDriverWait(webDriver, 200);
        try {
            webDriver.findElement(By.xpath(".//*[@id='a_5']")).click();
        }catch (Exception e) {
            logger.error("Can't work with element");
        }
    }

    @Step
    public void loginAfterECP() {
        actionsWithOurElements.clickOnElement(click);
        try {
            Thread.sleep(2000);
            actionsWithOurElements.ECPS();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.clickOnElement(click2);
//        actionsWithOurElements.clickOnElement(click);
//        actionsWithOurElements.clickOnElement(click3);
    }
}
