package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class KrimProccedingsPage extends ParentPage {

    @FindBy (id = "a_23")
    private WebElement unregisteredOfenses;

    @FindBy (id = "a_22")
    private WebElement listKP;

    @FindBy (id = "caption_32")
    private WebElement filtr;

    @FindBy (id = "caption_60")
    private WebElement status;

    @FindBy (id = "cb_7_64")
    private WebElement check;

    @FindBy (id = "control_223")
    private WebElement applyFiltrBut;

    @FindBy (id = "")
    private WebElement statusPO;

    @FindBy (id = "cb_6_64")
    private WebElement checkRT;

    @FindBy (id = "cb_1_64")
    private WebElement stopped;

    public KrimProccedingsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void openNewRegKP() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.chooseNewWindow(".//*[@id='a_21']");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToUnregisteredOffenses() {
        actionsWithOurElements.clickOnElement(unregisteredOfenses);
    }

    @Step
    public boolean chooseOffense(String locator, String status) {
        try {
            Thread.sleep(3500);
        WebElement offenses = webDriver.findElement(By.id(locator));
        List<WebElement> columns = offenses.findElements(By.tagName("td"));
            System.out.println(columns);
        boolean isElement=false;
        for (WebElement cell : columns)
            if (cell.getText().equals(status)) {
                Actions actions = new Actions(webDriver);
                actions.moveToElement(cell).doubleClick(cell).perform();
                isElement=true;
                logger.info("Offense was choosed");
                break;
            }
        else {JavascriptExecutor jsx = (JavascriptExecutor)webDriver;
            jsx.executeScript("window.scrollBy(0,5)", "");}

            if (!isElement) {
                logger.info("Offense is not exist");
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Step
    public boolean chooseString(String locator, String status) {
        try {
            Thread.sleep(3500);
            WebElement offenses = webDriver.findElement(By.id(locator));
            List<WebElement> columns = offenses.findElements(By.tagName("td"));
            System.out.println(columns);
            boolean isElement=false;
            for (WebElement cell : columns)
                if (cell.getText().contains(status)) {
                    Actions actions = new Actions(webDriver);
                    actions.moveToElement(cell).doubleClick(cell).perform();
                    isElement=true;
                    logger.info("Offense was choosed");
                    break;
                }
                else {JavascriptExecutor jsx = (JavascriptExecutor)webDriver;
                    jsx.executeScript("window.scrollBy(0,10)", "");}

            if (!isElement) {
                logger.info("Offense is not exist");
                return false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
//        logger.info("Offense is not exist");
    }

    @Step
    public void goToRegisterCriminalProceedings() {
        actionsWithOurElements.clickOnElement(listKP);
    }

    @Step
    public void findOffencePointOut() {
        actionsWithOurElements.clickOnElement(filtr);
        actionsWithOurElements.clickOnElement(status);
        actionsWithOurElements.clickOnElement(check);
        actionsWithOurElements.clickOnElement(applyFiltrBut);
        actionsWithOurElements.scrollJS();
    }

    @Step
    public void findOffenceForeignCountry() {
        actionsWithOurElements.clickOnElement(filtr);
        actionsWithOurElements.clickOnElement(status);
        actionsWithOurElements.clickOnElement(check);
        actionsWithOurElements.clickOnElement(applyFiltrBut);
        actionsWithOurElements.scrollJS();
    }

    public void findOffenceResultTrial() {
        actionsWithOurElements.clickOnElement(filtr);
        actionsWithOurElements.clickOnElement(status);
        actionsWithOurElements.clickOnElement(checkRT);
        actionsWithOurElements.clickOnElement(applyFiltrBut);
        actionsWithOurElements.scrollJS();
    }

    public void findOffenceStopped () {
        actionsWithOurElements.clickOnElement(filtr);
        actionsWithOurElements.clickOnElement(status);
        actionsWithOurElements.clickOnElement(stopped);
        actionsWithOurElements.clickOnElement(applyFiltrBut);
        actionsWithOurElements.scrollJS();
    }
}
