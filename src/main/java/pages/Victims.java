package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Victims extends ParentPage {

    @FindBy (id = "control_249")
    private WebElement victArea;

    @FindBy (id = "control_298")
    private WebElement deadArea;

    @FindBy (id = "control_328")
    private WebElement countryOfSitBut;

    @FindBy (id = "input_20")
    private String countryArea;

    @FindBy (id = "image_22")
    private WebElement openTab;

    @FindBy (id = "th_column1_14")
    private String windCod;

    @FindBy (id = "filter1_column1_14")
    private WebElement codeOfCounry;

    @FindBy (xpath =  ".//*[@title='Вибрати виділений запис']")
    private WebElement chooseAddMark;

    @FindBy (id = "txtqty")
    private WebElement sum1;

    @FindBy (id = "control_10")
    private WebElement sum;

    @FindBy (id = "control_15")
    private WebElement save;

    @FindBy (id = "control_355")
    private WebElement wind;

    @FindBy (id = "control_342")
    private WebElement officPos;

    @FindBy (id = "image_25")
    private String positBut;

    @FindBy (id = "image_25")
    private WebElement butWork;

    @FindBy (id = "th_column1_14")
    private String codWork;

    @FindBy (id = "filter1_column1_14")
    private WebElement fieldWork;

    @FindBy (id = "control_11")
    private WebElement all1;

    @FindBy (id = "control_11")
    private WebElement all;

    @FindBy (id ="control_13")
    private WebElement ofThemDied;

    @FindBy (id = "control_18")
    private WebElement saveBut;

    public Victims(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void enterNumbOfVict(String numberOfVict) {
        actionsWithOurElements.enterTextIntoElement(victArea, numberOfVict);
    }

    @Step
    public void enterNumbDead(String numbDead) {
        actionsWithOurElements.enterTextIntoElement(deadArea, numbDead);
    }

    @Step
    public void chooseCountryOfCitizenship(String country, String number) {
        actionsWithOurElements.clickOnElement(countryOfSitBut);
        actionsWithOurElements.windowSearch(countryArea);
        actionsWithOurElements.clickOnElement(openTab);
        actionsWithOurElements.windowSearch(windCod);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.enterTextIntoElement(codeOfCounry, country);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
            actionsWithOurElements.clickOnElement(chooseAddMark);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.windowSearchThre(sum1);
        actionsWithOurElements.enterTextIntoElement(sum, number);
        actionsWithOurElements.clickOnElement(save);
    }

    @Step
    public void officialPosition(String workSpace, String allVict, String victWhoDied) {
        actionsWithOurElements.windowSearchs(wind);
        actionsWithOurElements.clickOnElement(officPos);
        actionsWithOurElements.windowSearch(positBut);
        actionsWithOurElements.clickOnElement(butWork);
        actionsWithOurElements.windowSearch(codWork);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.enterTextIntoElement(fieldWork, workSpace);
            webDriver.findElement(By.id("filter1_column1_14")).sendKeys(Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(chooseAddMark);
        actionsWithOurElements.windowSearchThre(all1);
        actionsWithOurElements.enterTextIntoElement(all,allVict);
        actionsWithOurElements.enterTextIntoElement(ofThemDied, victWhoDied);
        actionsWithOurElements.clickOnElement(saveBut);
    }
}
