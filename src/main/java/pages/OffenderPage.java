package pages;

import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class OffenderPage extends ParentPage {

    @FindBy(id = "a_184")
    private WebElement addNewOffender;

    @FindBy(id = "control_19")
    private WebElement but19;

    @FindBy (id = "control_35")
    private WebElement surname;

    @FindBy (id = "control_37")
    private WebElement name;

    @FindBy (id = "control_39")
    private WebElement middleName;

    @FindBy (id = "control_42")
    private WebElement surnameR;

    @FindBy (id = "control_44")
    private WebElement nameR;

    @FindBy (id = "control_46")
    private WebElement middleNameR;

    @FindBy (id = "control_56")
    private WebElement birthData;

    @FindBy (id = "input_327")
    private WebElement areaPlace;

    @FindBy (id = "input_339")
    private WebElement areaPlaceReg;

    @FindBy (id = "control_79")
    private WebElement street;

    @FindBy (id = "control_82")
    private WebElement hous;

    @FindBy (id = "input_345")
    private WebElement occupation;

    @FindBy (id = "btn_2_15")
    private WebElement personalityInformation;

    @FindBy (id = "control_137")
    private WebElement qualifRaisingSusp;

    @FindBy (id = "image_23")
    private WebElement specialPart;

    @FindBy (id = "tr_0_13")
    private String line;

    @FindBy (xpath = ".//*[@title='Вибрати виділений запис']")
    private WebElement choose;

    @FindBy (id = "control_16")
    private WebElement saveBut16;

    @FindBy (id = "control_183")
    private WebElement seriousnessOfCrime;

    @FindBy (id = "control_311")
    private WebElement saveBut311;

    @FindBy (id = "control_86")
    private WebElement apartmen;

    @FindBy (id = "btn_1_15")
    private WebElement persData;

    @FindBy (id = "input_315")
    private WebElement country;

    @FindBy (id = "input_54")
    private WebElement sex;

    @FindBy (id = "input_10")
    private WebElement point;

    @FindBy (id = "control_130")
    private WebElement point2;

    @FindBy (id = "control_313")
    private String but313;

    @FindBy (id = "popup_ok")
    private WebElement ok;

    @FindBy (id = "control_130")
    private WebElement suspReport;

    @FindBy (id = "btn_3_8")
    private WebElement offenceTub;

    @FindBy (xpath = "//*[@id='tr_0_115']/td[15]/a/div")
    private WebElement seeOffenderTub;

    @FindBy (xpath = "//*[@id='tr_1_115']/td[15]/a/div")
    private WebElement seeOffenderTwoTub;

    @FindBy (id = "control_9")
    private WebElement editForm2;

    @FindBy (id = "control_34")
    private WebElement surname34;

    @FindBy (id = "control_407")
    private WebElement defMainCard;

    @FindBy (id = "control_670")
    private WebElement exitTub;

    @FindBy (id = "btn_2_18")
    private WebElement crimeOffenceTub;

    @FindBy (id = "btn_3_6")
    private WebElement precautMeasure;

    @FindBy (id ="control_308")
    private WebElement precautMeasureTub;

    @FindBy (id = "control_8")
    private WebElement kindOfMeasure;

    @FindBy (id = "control_10")
    private WebElement dateKindOfMeasure;

    @FindBy (id = "control_12")
    private WebElement dateEndOfMeasure;

    @FindBy (name = "itemSave")
    private WebElement saveBut;

    @FindBy (id = "control_310")
    private WebElement conttMeasureTub;

    @FindBy (id = "control_11")
    private WebElement dateContinued;

    @FindBy (id = "control_309")
    private WebElement cancelMeasureTub;

    @FindBy (id = "control_18")
    private WebElement saveBut18;

    @FindBy (id = "btn_4_6")
    private WebElement detentionTub;

    @FindBy (id = "control_323")
    private WebElement detentionPersTub;

    public OffenderPage(WebDriver webDriver) {super(webDriver);}

    @Step
    public void addNewOffender() {
        actionsWithOurElements.clickOnElement(addNewOffender);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchFour(but19);
            actionsWithOurElements.clickOnElement(personalityInformation);
            actionsWithOurElements.enterDateInArea(suspReport);
            actionsWithOurElements.clickOnElement(qualifRaisingSusp);
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchFive(point);
            actionsWithOurElements.clickOnElement(specialPart);
            actionsWithOurElements.windowSearchSix(line);
            actionsWithOurElements.clickOnElement(choose);
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchFive(point);
            actionsWithOurElements.clickOnElement(saveBut16);
            actionsWithOurElements.windowSearchFour(point2);
            Thread.sleep(500);
            webDriver.findElement(By.id("control_183")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.clickOnElement(persData);

            actionsWithOurElements.enterTextIntoElement(surname, ActionsWithOurElements.getRandomName());
            actionsWithOurElements.enterTextIntoElement(name, ActionsWithOurElements.getRandomName());
            actionsWithOurElements.enterTextIntoElement(middleName, ActionsWithOurElements.getRandomName());
            actionsWithOurElements.enterTextIntoElement(surnameR, ActionsWithOurElements.getRandomName());
            actionsWithOurElements.enterTextIntoElement(nameR, ActionsWithOurElements.getRandomName());
            actionsWithOurElements.enterTextIntoElement(middleNameR, ActionsWithOurElements.getRandomName());
            webDriver.findElement(By.id("input_54")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.enterTextIntoElement(birthData, "01.03.1979");
            actionsWithOurElements.enterTextIntoElement(areaPlace,"Солом'янський район");
            Thread.sleep(1000);
            webDriver.findElement(By.id("control_70")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);//input_328
            actionsWithOurElements.enterTextIntoElement(areaPlaceReg,"Солом'янський район");
            webDriver.findElement(By.id("input_339")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.enterTextIntoElement(street,"Солом'янськa");
            actionsWithOurElements.enterTextIntoElement(hous,"82");
            actionsWithOurElements.enterTextIntoElement(occupation,"учитель");
            Thread.sleep(1000);
            webDriver.findElement(By.id("input_345")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.windowSearchFour(personalityInformation);
            actionsWithOurElements.enterTextIntoElement(apartmen, "5");
            webDriver.findElement(By.id("control_86")).sendKeys(Keys.TAB, Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB, Keys.ENTER);
            actionsWithOurElements.clickOnElement(ok);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(offenceTub);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void editOffender() {
        actionsWithOurElements.windowSearchs(seeOffenderTub);
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearchThre(editForm2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.windowSearchFour(surname);
        actionsWithOurElements.enterTextIntoElement(surname,"Саша");
        actionsWithOurElements.clickOnElement(saveBut311);
        actionsWithOurElements.clickOnElement(ok);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchThre(surname34);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void removeMainCard() {
        try {
            actionsWithOurElements.clickOnElement(seeOffenderTwoTub);
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchThre(defMainCard);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchFour(saveBut16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToRemMainCard() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(exitTub);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchs(crimeOffenceTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void electionPreventivMeasure() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(seeOffenderTub);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(precautMeasure);
            actionsWithOurElements.clickOnElement(precautMeasureTub);
            Thread.sleep(1200);
            actionsWithOurElements.windowSearchFour(kindOfMeasure);
            webDriver.findElement(By.id("control_8")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.enterDateInArea(dateKindOfMeasure);
            actionsWithOurElements.enterDatePlusTwoM(dateEndOfMeasure);
            webDriver.findElement(By.id("control_14")).sendKeys(Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.clickOnElement(saveBut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void contPreventivMeasure() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(seeOffenderTub);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(precautMeasure);
            actionsWithOurElements.clickOnElement(conttMeasureTub);
            Thread.sleep(1200);
            actionsWithOurElements.windowSearchFour(editForm2);
            actionsWithOurElements.selectValueInDD(editForm2, "2");
            actionsWithOurElements.enterDateHWN(dateContinued,3);
            actionsWithOurElements.clickOnElement(saveBut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void cancelPreventivMeasure() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(seeOffenderTub);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(precautMeasure);
            actionsWithOurElements.clickOnElement(cancelMeasureTub);
            Thread.sleep(1200);
            actionsWithOurElements.windowSearchFour(dateKindOfMeasure);
            actionsWithOurElements.enterDateInArea(dateKindOfMeasure);
            actionsWithOurElements.clickOnElement(saveBut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void detOfPerson() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(seeOffenderTub);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(detentionTub);
            actionsWithOurElements.clickOnElement(detentionPersTub);//
            Thread.sleep(1200);
            actionsWithOurElements.windowSearchFour(dateKindOfMeasure);
            actionsWithOurElements.enterTodayDateExtended(dateKindOfMeasure);
            actionsWithOurElements.clickOnElement(saveBut);
            actionsWithOurElements.clickOnElement(ok);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
