package pages;

import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CardCriminalProceedings extends ParentPage {

    @FindBy(id = "btn_1_18")
    private String basicInformation;

    @FindBy(id = "btn_1_18")
    private WebElement basicInformationW;

    @FindBy(id = "btn_2_18")
    private WebElement tabCrimOff;

    @FindBy(id = "control_663")
    private WebElement doupleBut;

    //    @FindBy (id = "a_24")
    @FindBy(xpath = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[1]/table/tbody/tr/td/div/table/tbody/tr/td[1]/div/table/tbody/tr/td/div/div/table/tbody/tr[1]/td/div/a/img")
    private WebElement proceedBut;

    @FindBy(id = "control_10")
    private WebElement basisArea;

    @FindBy(id = "control_16")
    private WebElement saveBut;

    @FindBy(id = "popup_ok")
    private WebElement ok;

    @FindBy(id = "btn_3_18")
    private WebElement moveProcTub;

    @FindBy(id = "a_24")
    private WebElement move;

    @FindBy(xpath = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[9]/a/div")
    private WebElement see;

    @FindBy(id = "control_11")
    private WebElement makingChangesForm1;

    @FindBy(id = "btn_5_8")
    private WebElement lossesbut;

    @FindBy(id = "bar_8")
    private String panel;

    @FindBy(id = "control_302")
    private WebElement makingChangesForm11;

    @FindBy(xpath = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[15]/a/div")
    private WebElement seeOffender;

    @FindBy(id = "control_400")
    private WebElement suspicMessage;

    @FindBy(id = "zen399")
    private String areaBut;

    @FindBy(id = "control_9")
    private WebElement changForm2;

    @FindBy(id = "btn_1_15")
    private String persDataBut;

    @FindBy(id = "btn_2_15")
    private WebElement identityInfBut;

    @FindBy(id = "control_130")
    private WebElement dateOfSuspNotif;

    @FindBy(id = "control_310")
    private WebElement saveButNot;

    @FindBy(id = "control_11")
    private WebElement dd;

    @FindBy(id = "a_25")
    private WebElement stopFunction;

    @FindBy(id = "control_11")
    private WebElement decree;

    @FindBy(id = "control_11")
    private String decreeS;

    @FindBy(id = "control_19")
    private WebElement saveBut19;

    @FindBy(id = "popup_container")
    private String pum;

    @FindBy(id = "btn_1_18")
    private String wind;

    @FindBy(id = "control_405")
    private WebElement exit;

    @FindBy(xpath = "//*[@id='tr_0_109']/td[15]/a/div")
    private WebElement seeOffenderX;

    @FindBy(id = "control_35")
    private String pIP;

    @FindBy(id = "control_310")
    private WebElement saveBut300;

    @FindBy(id = "a_24")
    private WebElement recov;

    @FindBy(id = "control_9")
    private String recovDate;

    @FindBy(id = "control_9")
    private WebElement recovDateS;

    @FindBy(id = "control_669")
    private WebElement estFeature;

    @FindBy(id = "btn_9")
    private String feuterOGiZO;

    @FindBy(xpath = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[9]/a/div")
    private WebElement seeOffense;

    @FindBy(id = "control_15")
    private WebElement saveBut15;

    @FindBy(id = "btn_7_8")
    private WebElement trafficOffense;

    @FindBy(id = "btn_7_8")
    private String moveBut;

    @FindBy(id = "a_28")
    private WebElement closeProccedBut;

    @FindBy(id = "control_8")
    private String baseArea;

    @FindBy(id = "control_8")
    private WebElement baseAreaW;

    @FindBy(id = "control_17")
    private WebElement saveBut17;

    @FindBy(id = "btn_7_8")
    private WebElement moveOfProceed;

    @FindBy(id = "btn_7_8")
    private WebElement moveOfProceedS;

    @FindBy(id = "a_24")
    private WebElement restore;

    @FindBy(id = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[9]/a/div")
    private String seeOffenseTwo;

    @FindBy(id = "control_667")
    private WebElement closeOffenTab;

    @FindBy(id = "control_18")
    private WebElement saveBut18;

    @FindBy(id = "tr_1_84")
    private String seeOffenseTwoId;

    @FindBy(id = "a_29")
    private WebElement detOfHeadODR;

    @FindBy(id = "btn_8")
    private WebElement headODRArea;

    @FindBy(id = "btn_8")
    private WebElement selecrODR;

    @FindBy(id = "item_0_8")
    private WebElement kerprok;

    @FindBy(id = "chbox_0_8")
    private WebElement area;

    @FindBy(id = "control_14")
    private WebElement saveBut14;

    @FindBy(id = "input_8")
    private WebElement headODRAre;

    @FindBy(id = "btn_1_18")
    private WebElement maindata;

    @FindBy(id = "a_26")
    private WebElement openMaterialBut;

    @FindBy(id = "control_16")
    private WebElement saveBut16;

    @FindBy(id = "control_18")
    private WebElement areaCalBut;

    @FindBy(id = "a_24")
    private WebElement openMaterialButWWO;

    @FindBy(id = "icon_9")
    private String dateBut;

    @FindBy(id = "control_19")
    private WebElement save;

    @FindBy(id = "icon_9")
    private WebElement calBut;

    @FindBy(id = "a_27")
    private WebElement extract;

    @FindBy(id = "viewer")
    private WebElement pdf;

    @FindBy(id = "a_25")
    private WebElement extractS;

    @FindBy (id = "btn_3_8")
    private WebElement offenderTub;

    @FindBy (id = "control_156")
    private String exitTab;

    @FindBy (xpath = "/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td[15]/a/div")
    private String seeOffenderS;

    @FindBy (xpath = "//*[@id='tr_0_109']/td[15]/a/div")
    private WebElement point;

    @FindBy (id = "btn_2_6")
    private WebElement identityInf;

    @FindBy (xpath = "//*[@id='tr_0_200']/td[8]")
    private WebElement qualArea;

    @FindBy (id = "btn_1_8")
    private WebElement registration;

    @FindBy (id = "control_20")
    private WebElement control;

    @FindBy (id = "control_670")
    private WebElement exitProceed;

    @FindBy (id = "control_58")
    private WebElement areaData;

    @FindBy (id = "btn_4_18")
    private WebElement addFilesTub;

    @FindBy (id = "a_134")
    private WebElement addTub;

    @FindBy (id = "control_6")
    private WebElement overview;

    @FindBy (xpath = "//*[@id='File']")
    private WebElement addFileBut;

    @FindBy (id = "a_135")
    private WebElement editTab;

    @FindBy (id = "control_7")
    private WebElement descriptArea;

    @FindBy (id = "control_10")
    private WebElement saveBut10;

    @FindBy (id = "a_136")
    private WebElement deletBut;

    @FindBy (id = "control_401")
    private WebElement changSuspTub;

    @FindBy (id = "control_13")
    private WebElement saveBut13;

    @FindBy (xpath = "//*[@id='tr_1_109']/td[15]/a/div")
    private WebDriver seeOffenderTwoX;


    public CardCriminalProceedings(WebDriver webDriver) {
        super(webDriver);
    }

    @Step
    public void goToCriminalOffensesTab() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(basicInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(tabCrimOff);
    }

    @Step
    public void performDuplicateFunction() {
        actionsWithOurElements.chooseOffense("tr_0_84", "У провадженні");
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(basicInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            actionsWithOurElements.clickOnElement(doupleBut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void admissionToProceedings() {
        actionsWithOurElements.windowSearch(String.valueOf(proceedBut));
        actionsWithOurElements.clickOnElement(proceedBut);
        actionsWithOurElements.windowSearch(String.valueOf(basisArea));
        actionsWithOurElements.clickOnElement(basisArea);
        try {
            Thread.sleep(1500);
            webDriver.findElement(By.xpath("//*[text()='1 після внесення відомостей до Реєстру']")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(saveBut);
        actionsWithOurElements.clickOnElement(ok);
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearchs(move);
            actionsWithOurElements.clickOnElement(moveProcTub);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToEditCrimOffenses() {
        actionsWithOurElements.clickOnElement(see);
        try {
            Thread.sleep(3000);
            actionsWithOurElements.windowSearch(String.valueOf(makingChangesForm1));
            actionsWithOurElements.clickOnElement(makingChangesForm1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToCrimOffense() {
        actionsWithOurElements.clickOnElement(see);
//        try {
//            Thread.sleep(3000);
//            actionsWithOurElements.windowSearch(String.valueOf(makingChangesForm1));
//            actionsWithOurElements.clickOnElement(makingChangesForm1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Step
    public void goToLossesCard() {
        actionsWithOurElements.clickOnElement(see);
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearch(panel);
//            actionsWithOurElements.clickOnElement(lossesbut);
//            actionsWithOurElements.clickOnElement(makingChangesForm11);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            actionsWithOurElements.clickOnElement(lossesbut);
            actionsWithOurElements.clickOnElement(makingChangesForm11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToLossesCardWithoutForm11() {
        actionsWithOurElements.clickOnElement(see);
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearch(panel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            actionsWithOurElements.clickOnElement(lossesbut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void stoppingCrimProc() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.clickOnElement(tabCrimOff);
            actionsWithOurElements.clickOnElement(seeOffender);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
            actionsWithOurElements.windowSearch(areaBut);
            actionsWithOurElements.clickOnElement(suspicMessage);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (actionsWithOurElements.compareWithDialogBox("popup_message", "Функція недоступна. Необхідно заповнити поле «Дата складання повідомлення про підозру»")) {
            actionsWithOurElements.clickOnElement(ok);
            actionsWithOurElements.clickOnElement(changForm2);
            try {
                Thread.sleep(7000);
                actionsWithOurElements.windowSearch(pIP);
                actionsWithOurElements.clickOnElement(identityInfBut);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            actionsWithOurElements.enterTextIntoElement(dateOfSuspNotif, "05.02.2020");
            actionsWithOurElements.clickOnElement(saveBut300);
            actionsWithOurElements.clickOnElement(ok);
            System.out.println("popec");
        } else if (actionsWithOurElements.compareWithDialogBox("popup_message", "Функція не доступна, було скасовано підозру. Необхідно створити нову картку по особі, а для поточної картки зняти ознаку основної")) {
            Assert.fail("Необхідно створити нову картку по особі");
        } else {
//        проверка на "Функція недоступна. Необхідно заповнити поле «Дата складання повідомлення про підозру»"
            actionsWithOurElements.windowSearch(areaBut);
            actionsWithOurElements.windowSearchs(dd);
            try {
                Thread.sleep(2000);
                webDriver.findElement(By.id("control_11")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            actionsWithOurElements.clickOnElement(saveBut);
            actionsWithOurElements.popupmessage();
            actionsWithOurElements.clickOnElement(exit);
            actionsWithOurElements.clickOnElement(stopFunction);
        }
    }

    @Step
    public void stoppCrimProc() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(basicInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(stopFunction);
    }

    @Step
    public boolean findStopWind() {
        try {
            Thread.sleep(1000);
//            actionsWithOurElements.windowSearch(pum);
//        webDriver.findElement(By.id("control_11"));
            actionsWithOurElements.clickOnElement(ok);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Step
    public void fillForm() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(decreeS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.enterTextIntoElement(decree, "5646478");
        webDriver.findElement(By.id("control_13")).sendKeys(Keys.DOWN, Keys.ENTER);
        actionsWithOurElements.clickOnElement(saveBut19);
    }

    @Step
    public void recover() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(recov);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(recovDate);
            DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy");
            Date date2 = new Date();
            String today = dateFormat2.format(date2);
            actionsWithOurElements.enterTextIntoElement(recovDateS, today);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.id("control_13")).sendKeys(Keys.DOWN, Keys.ENTER);
        actionsWithOurElements.clickOnElement(saveBut19);
//        actionsWithOurElements.clickOnElement(ok);
    }

    @Step
    public void establishingFeatureOGiZO() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(tabCrimOff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(seeOffense);
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(String.valueOf(estFeature));
            actionsWithOurElements.clickOnElement(estFeature);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(feuterOGiZO);
            webDriver.findElement(By.id("btn_9")).click();
            webDriver.findElement(By.id("input_9")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(saveBut15);
        actionsWithOurElements.clickOnElement(ok);
        try {
            Thread.sleep(3500);
            actionsWithOurElements.windowSearchThre(decree);
            actionsWithOurElements.clickOnElement(trafficOffense);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void cancellationFeatureOGiZO() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(tabCrimOff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(seeOffense);
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(String.valueOf(estFeature));
            actionsWithOurElements.clickOnElement(estFeature);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(feuterOGiZO);
            webDriver.findElement(By.id("btn_9")).click();
            webDriver.findElement(By.id("input_9")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
            webDriver.findElement(By.id("btn_10")).click();
            webDriver.findElement(By.id("input_10")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.clickOnElement(saveBut15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsWithOurElements.clickOnElement(ok);
        try {
            Thread.sleep(3500);
            actionsWithOurElements.windowSearchThre(moveOfProceedS);
            actionsWithOurElements.clickOnElement(moveOfProceed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");
    }

    @Step
    public void closeProceed() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(closeProccedBut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(baseArea);
//            webDriver.findElement(By.id("btn_9")).click();
            webDriver.findElement(By.id("control_8")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.clickOnElement(saveBut17);
//            actionsWithOurElements.clickOnElement(ok);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void closeOffence() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(tabCrimOff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            JavascriptExecutor jsx = (JavascriptExecutor) webDriver;
            jsx.executeScript("window.scrollBy(10,0)", "");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (webDriver.equals(seeOffenseTwo)) {
            logger.info("2 чи більше правопорушеня");
            Assert.fail("We have more than one offense");
        } else {
            actionsWithOurElements.clickOnElement(seeOffense);
            try {
                Thread.sleep(4000);
                actionsWithOurElements.windowSearchThre(moveOfProceedS);
                actionsWithOurElements.clickOnElement(closeOffenTab);
                try {
                    Thread.sleep(2000);
                    actionsWithOurElements.windowSearch(baseArea);
//            webDriver.findElement(By.id("btn_9")).click();
                    webDriver.findElement(By.id("control_8")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1500);
                    actionsWithOurElements.clickOnElement(saveBut18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Step
    public void closeSavOffence() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(tabCrimOff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            JavascriptExecutor jsx = (JavascriptExecutor) webDriver;
            jsx.executeScript("window.scrollBy(40,0)", "");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (actionsWithOurElements.findElement(seeOffenseTwoId)) {
            actionsWithOurElements.clickOnElement(seeOffense);
            try {
                Thread.sleep(3500);
                actionsWithOurElements.windowSearchThre(moveOfProceedS);
                actionsWithOurElements.clickOnElement(closeOffenTab);
                try {
                    Thread.sleep(2000);
                    actionsWithOurElements.windowSearch(baseArea);
                    webDriver.findElement(By.id("control_8")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1500);
                    actionsWithOurElements.clickOnElement(saveBut18);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            logger.info("менше двох правопорушень");
            Assert.fail("We have less than 2 offense");
        }
    }

    @Step
    public void detOfHeadOfODR() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(detOfHeadODR);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearchThre(headODRArea);
            actionsWithOurElements.clickOnElement(selecrODR);
            actionsWithOurElements.clickOnElement(area);
            webDriver.findElement(By.id("input_8")).sendKeys(Keys.ESCAPE);
//            actionsWithOurElements.clickOnElement(headODRAre);
            actionsWithOurElements.clickOnElement(saveBut14);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void openMaterials() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(moveProcTub);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (actionsWithOurElements.findLine("tpBody_123", "Відкриття матеріалів досудового розслідування для ознайомлення")) {
            logger.info("матеріали відкриті іншій стороні");
            Assert.fail("The material opened other side");
        } else {
            actionsWithOurElements.clickOnElement(maindata);
            actionsWithOurElements.clickOnElement(openMaterialBut);
            try {
                Thread.sleep(2000);
                actionsWithOurElements.windowSearchThre(areaCalBut);
                actionsWithOurElements.clickOnElement(saveBut16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }

    @Step
    public void openMaterialsWWO() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
//            actionsWithOurElements.clickOnElement(moveProcTub);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        if (actionsWithOurElements.chooseOffense("tpBody_127", "Відкриття матеріалів досудового розслідування для ознайомлення")){
        actionsWithOurElements.clickOnElement(maindata);
//            actionsWithOurElements.clickOnElement(openMaterialBut);
//            try {
//                Thread.sleep(2000);
//                actionsWithOurElements.windowSearchThre(areaCalBut);
//                actionsWithOurElements.clickOnElement(saveBut16);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        System.out.println("");
//        }else {
//            logger.info("Функція відкриття матеріалів не виконана");
//            Assert.fail("material opening function is not performed ");
//        }
    }

    @Step
    public void recMaterials() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(recov);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            actionsWithOurElements.windowSearchThre(save);
            if (actionsWithOurElements.compareChangedText("control_13", "8 відновлення провадження після відкриття матеріалів")) {
//                actionsWithOurElements.enterTextIntoElement(recovDateS, "");
                actionsWithOurElements.clickOnElement(recovDateS);
                actionsWithOurElements.enterDateInArea(recovDateS);
                actionsWithOurElements.clickOnElement(saveBut19);
                System.out.println("");
            } else {
                Assert.fail("not relevant with code 8");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void formExtract() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(extract);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
            actionsWithOurElements.windowSearchThre(pdf);
            webDriver.findElement(By.id("viewerContainer"));
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void formExtractStoped() {
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.clickOnElement(extract);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            actionsWithOurElements.windowSearchThre(pdf);
            webDriver.findElement(By.id("viewerContainer"));
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToCrimOffensePage() {
        try {
            Thread.sleep(2000);
//            actionsWithOurElements.windowSearch(wind);
            actionsWithOurElements.windowSearchs(tabCrimOff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public boolean condition() {
        boolean result = true;
        try {
            Thread.sleep(1200);
        webDriver.findElement(By.xpath("//*[@id='tr_0_115']/td[15]/a/div"));
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    @Step
    public void doing() {
        try {
            Thread.sleep(4000);
            actionsWithOurElements.windowSearchs(point);
//            actionsWithOurElements.clickOnElement(suspicMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            actionsWithOurElements.windowSearchThre(suspicMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (actionsWithOurElements.compareWithDialogBox("popup_message", "Функція не доступна, особу вже повідомлено про підозру. Для зміни підозри необхідно скористатися функцією «Зміна підозри».")){
            actionsWithOurElements.clickOnElement(ok);
            actionsWithOurElements.clickOnElement(identityInf);
//                webDriver.close();
//                actionsWithOurElements.windowSearchs(tabCrimOff);
            actionsWithOurElements.getData("//*[@id='control_145']");
            webDriver.close();
            try {
                Thread.sleep(1000);
                actionsWithOurElements.windowSearchs(basicInformationW);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println();
        }else {
            actionsWithOurElements.windowSearchFour(decree);
            actionsWithOurElements.clickOnElement(decree);
            webDriver.findElement(By.id("control_11")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
            actionsWithOurElements.clickOnElement(saveBut16);
            actionsWithOurElements.clickOnElement(ok);
            try {
                Thread.sleep(1000);
                webDriver.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
//            actionsWithOurElements.windowSearchThre(point);
//            actionsWithOurElements.clickOnElement(suspicMessage);
            System.out.println("");
        }
    }

    @Step
    public void preElse() {
        actionsWithOurElements.clickOnElement(seeOffense);
        try {
            Thread.sleep(4000);
            actionsWithOurElements.windowSearchThre(moveOfProceedS);
            actionsWithOurElements.clickOnElement(offenderTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Step
//    public void setPreTrialPeriod() {
////        actionsWithOurElements.clickOnElement(seeOffender);
////        actionsWithOurElements.chooseNewWindow(String.valueOf(tabCrimOff));
////        System.out.println(String.valueOf(seeOffender));
////        actionsWithOurElements.checkTheOffenderX(String.valueOf(seeOffender));
//        webDriver.findElement(By.xpath("//*[@id='tr_0_109']/td[15]/a/div"));
//        System.out.println("es");
//        if (actionsWithOurElements.isElementPresent(seeOffenderX)) {
////            повідомляємо про підозру если валится значит повідомлено
////            actionsWithOurElements.clickOnElement(seeOffenderX);
//            try {
//                Thread.sleep(4000);
//                actionsWithOurElements.windowSearchThre(point);
//                actionsWithOurElements.clickOnElement(suspicMessage);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            if (actionsWithOurElements.compareWithDialogBox("popup_message", "Функція не доступна, особу вже повідомлено про підозру. Для зміни підозри необхідно скористатися функцією «Зміна підозри».")){
//                actionsWithOurElements.clickOnElement(ok);
//                actionsWithOurElements.clickOnElement(identityInf);
////                webDriver.close();
////                actionsWithOurElements.windowSearchs(tabCrimOff);
//                actionsWithOurElements.getData("//*[@id='control_145']");
//                webDriver.close();
//                actionsWithOurElements.windowSearchs(basicInformationW);
//                System.out.println();
//            }else {
//            actionsWithOurElements.windowSearchFour(decree);
//            actionsWithOurElements.clickOnElement(decree);
//            webDriver.findElement(By.id("control_11")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
//            actionsWithOurElements.clickOnElement(saveBut16);
//            actionsWithOurElements.clickOnElement(ok);
//            webDriver.close();
////            actionsWithOurElements.windowSearchThre(point);
////            actionsWithOurElements.clickOnElement(suspicMessage);
//            System.out.println("");
//            }
//        }else{
//            actionsWithOurElements.clickOnElement(seeOffense);
//            try {
//                Thread.sleep(4000);
//                actionsWithOurElements.windowSearchThre(moveOfProceedS);
//                actionsWithOurElements.clickOnElement(offenderTub);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }


    @Step
    public void performFunction() {
//        webDriver.close();
//        actionsWithOurElements.windowSearchs(seeOffender);
        actionsWithOurElements.doublClick(qualArea);
//        actionsWithOurElements.clickOnElement(seeOffender);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchFour(suspicMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.clickOnElement(suspicMessage);
        actionsWithOurElements.windowSearchFive(changForm2);
//        actionsWithOurElements.clickOnElement(dd);
        webDriver.findElement(By.id("control_11")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        actionsWithOurElements.clickOnElement(saveBut16);
        actionsWithOurElements.clickOnElement(ok);
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchFour(control);
            actionsWithOurElements.clickOnElement(identityInf);
            actionsWithOurElements.getData("//*[@id='control_145']");
            actionsWithOurElements.clickOnElement(exit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchThre(exitProceed);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchs(areaData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void addNewFile() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(addFilesTub);
            actionsWithOurElements.clickOnElement(addTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchThre(addFileBut);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        actionsWithOurElements.windowSearchThre(op);
        actionsWithOurElements.clickOnElement(addFileBut);
        actionsWithOurElements.doublClick(overview);
        actionsWithOurElements.addNewFileW();
        actionsWithOurElements.clickOnElement(decree);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchs(addFilesTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToAttachedFilesTub() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(addFilesTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void editFails() {
        actionsWithOurElements.clickOnElement(editTab);
        try {
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(descriptArea);
            actionsWithOurElements.enterTextIntoElement(descriptArea, "Малява");
            actionsWithOurElements.clickOnElement(saveBut10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearchs(addFilesTub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void deletFail() {
        actionsWithOurElements.clickOnElement(deletBut);
    }

    @Step
    public void goToOffenderPage() {
        try {
            Thread.sleep(1500);
            actionsWithOurElements.windowSearchs(tabCrimOff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void goToBasicInf() {
        actionsWithOurElements.clickOnElement(exitProceed);
        try {
            Thread.sleep(2500);
            actionsWithOurElements.windowSearchs(tabCrimOff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Step
    public void changingSusp() {
        try {
            Thread.sleep(1000);
            actionsWithOurElements.clickOnElement(seeOffenderX);
            Thread.sleep(1000);
            actionsWithOurElements.windowSearchThre(changSuspTub);
            actionsWithOurElements.windowSearchFour(saveBut13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Step
    public boolean checkSeveralOffenders() {
//        boolean result = true;
        try {
            Thread.sleep(1500);
            webDriver.findElement(By.xpath("//*[@id='tr_1_109']/td[15]/a/div"));
//            webDriver.equals(seeOffenderTwoX);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
//            result = false;
        }
//        return result;
    }
}
