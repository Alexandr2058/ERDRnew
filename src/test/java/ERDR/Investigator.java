package ERDR;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentTest.ParentTest;

public class Investigator extends ParentTest {

    @Test
    public void registrKrimProv(){
        templatePage.loginAfterECP();
//        templatePage.ECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();
    }//cтворення нового правопорушення (кваліфікація: злочин 2001р) заявник фіз особа, статус проект

    @Test
    public void krimProvPoterMZag() {
        templatePage.loginAfterECP();
//        templatePage.ECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("135");
        krimOffensePage.switchToTabVictim();
        victims.enterNumbOfVict("2");
        victims.enterNumbDead("3");
        victims.chooseCountryOfCitizenship("804","3");
        victims.officialPosition("018", "3", "3");
        krimOffensePage.save();
//        unregisteredCriminalOffenses.goToDom("group_25");

        checkExpectedResult("The dialog box is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кількість потерпілих, які загинули не повинна перевищувати загальної кількості потерпілих"));
    }//Кваліфікація: злочин 2001 року,заявник - фізична особа,(відправка на реєстрацію)(Кваліфікація з множинним вибором) Заповнення вкладки "Потерпілі".
// Не заповнювати вкладку, Кількість потерпілих < Кількість потерпілих, які загинули

    @Test
    public  void krimProvPotBZag () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("135");
        krimOffensePage.switchToTabVictim();
        victims.enterNumbOfVict("4");
        victims.enterNumbDead("3");
        victims.chooseCountryOfCitizenship("804", "4");
        victims.officialPosition("018", "4", "3");
        krimOffensePage.save();

        checkExpectedResult("The dialog box is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Збережено"));
    }//Кваліфікація: злочин 2001 року) заявник - фізична особа(нова ФО) (відправка на реєстрацію)(Кваліфікація з множинним вибором) Заповнення вкладки "Потерпілі". Кількість потерпілих > Кількість потерпілих, які загинули

    @Test
    public void krimProv1960 () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.crim1960();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.sendToReg();

        checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message","Правопорушення відправлено на реєстрацію"));
    }//Кваліфікація: злочин 1960 року-заявник фізична особа,відправка на реєстрацію.

    @Test
    public void krimProv1960Mn () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.crim1960();
        krimOffensePage.qualificationCrime("СТ.93 п.");
        krimOffensePage.pluralQualCrime();
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.additionalQualificationMarkings("137");
        krimOffensePage.sendToReg();

        checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message","Правопорушення відправлено на реєстрацію"));
    }//Кваліфікація: злочин 1960 року, заявник фізична особа збереження кваліфікація з множинним вибором

    @Test
    public void krimProvMunRok () {
//        templatePage.ECP();
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.takeIntoAccount();
        krimOffensePage.numberOfCriminalCase();
        krimOffensePage.dateOfInitiationOfCriminalCase();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDatePast();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.saveWOk();
//        unregisteredCriminalOffenses.goToDom("group_25");
        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Збережено"));
    }// Створення нового правопорушення "минулих років" - заявник - фізична особа

    @Test
    public void editingKrimProv () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        try {
            Thread.sleep(3000);
            krimProccedingsPage.chooseOffense("tpBody_38", "Проект");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            krimOffensePage.enterAdress("Печенежская");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        krimOffensePage.save();

        checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_67", "Печенежская"));
    } // Редагування існуючого незареєстрованого правопорушення (правопорушення у статусі "Проект")

    @Test
    public  void detectedByService () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Кримінальне провадження розпочато за заявою/повідомленням фізичної/юридичної особи, що унеможливлює заповнення поля «Виявлено службою»"));
    } //заявник фізична особа, заповнити поле "Виявлено службою" будь-яким значенням

    @Test
    public void detByServlegal () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.selectLegPers();
        krimOffensePage.enterNameLegPers();
        krimOffensePage.enterCodeLP();
        krimOffensePage.enterLegAddress();
        krimOffensePage.actualAddress();
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.sendToRegWithoutOk();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Кримінальне провадження розпочато за заявою/повідомленням фізичної/юридичної особи, що унеможливлює заповнення поля «Виявлено службою»"));
    }//Заявник - юридична особа, заповнити поле "Виявлено службою" будь-яким значенням (відправка на реєстрацію)

    @Test
    public void anotherSource () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.selectAnothSource();
        krimOffensePage.valueAnotherSource("6");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.124");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
//        krimOffensePage.detectByServ("15");
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","У разі обраного значення з кодом 6 у полі «Інше джерело», у полі «Виявлено службою» може бути обрано лише одне із наступних значень: 01, 02, 03, 05, 06, 40, 47, 91."));

    }// заявник Інше джерело - обране значення з кодом 6. Поле "Виявлено службою" - пусте

//    @Test
//    public void KPWithSpecialNotice () {
//        templatePage.ECP();
//        templatePage.krimProvTab();
//        krimProccedingsPage.openNewRegKP();
//        krimOffensePage.selectKRODRInDD();
//        krimOffensePage.selectKerOP();
//        krimOffensePage.takeIntoAccountID();//іноземних держжав
//        krimOffensePage.enterNumStatement();
//        krimOffensePage.enterDate();
//        krimOffensePage.enterLastName();
//        krimOffensePage.enterName();
//        krimOffensePage.patronymic();
//        krimOffensePage.selectGender();
//        krimOffensePage.selectDataOfBirth();
//        krimOffensePage.enterAdress("Празька");
//        krimOffensePage.offense();
//        krimOffensePage.personWhoCriminal();
//        krimOffensePage.enterStory();
//        krimOffensePage.qualificationCrime("СТ.124");
//        krimOffensePage.chooseArea();
//        krimOffensePage.environmentalOffenses();
//        krimOffensePage.offenseATO();
//        krimOffensePage.tortureOfPersons();
//        krimOffensePage.switchToTabFeaturePP();
//        characteristicsOfCriminalOffense.specialNotes("1");
//        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
//        krimOffensePage.save();
////        unregisteredCriminalOffenses.goToDom("group_25");
//        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Значення «1 -  рішення суду про повернення справи на додаткове розслідування» в полі «Особливі відмітки» може бути обране лише у разі значення «4 -  кримінальні правопорушення минулих років та у яких прийнято рішення», «5 - кримінальні правопорушення, які на день набрання чинності КПК 2012 р. перебувають у провадженні» або «2 – виділено» в полі «Врахувати»."));
//
//    }//результат не пляшет!!! нового правопорушення - врахувати - обране значення з кодом 1, або 3, в полі "Особливі відмітки" обрано значення з кодом  1 (збереження)

    @Test
    public void krimProv209KKU () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.209");
        krimOffensePage.chooseArea();
        krimOffensePage.environmentalOffenses();
        krimOffensePage.offenseATO();
        krimOffensePage.tortureOfPersons();
        krimOffensePage.switchToTabFeaturePP();
        characteristicsOfCriminalOffense.placeOfCommissionPfOffense();
        characteristicsOfCriminalOffense.typeEconomicActivity();
        characteristicsOfCriminalOffense.specialNotes("2");
        krimOffensePage.save();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message","Значення «2 - суспільно небезпечне протиправне діяння, що передувало легалізації (відмиванню) доходів» в полі «Особливі відмітки» можливо тільки у випадку наявності у провадженні правопорушення кваліфікованого за ст. 209 КК України 2001р."));

    }// кваліфікація правопорушення ст.209 ККУ 2001, в полі "Особливі відмітки" обрано значення з кодом  2

    @Test
    public void sendForReg () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        unregisteredCriminalOffenses.chooseKP();
        krimOffensePage.sendForRegistr();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Правопорушення відправлено на реєстрацію"));
    }//Відправлення правопорушення на реєстрацію

    @Test
    public void withdrawFromReg () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToUnregisteredOffenses();
        try {
            Thread.sleep(2000);
            krimProccedingsPage.chooseOffense("tpBody_38","На реєстрації");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        krimOffensePage.withdrawFromReg();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Правопорушення відкликано з реєстрації"));

    }//Відкликати правопорушення з реєстрації

    @Test
    public void douplKS1 () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.chooseKP("tpBody_237", "У провадженні");
        cardCriminalProceedings.goToCriminalOffensesTab();
        cardCriminalProceedings.performDuplicateFunction();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Функція не доступна. Провадження містить лише одне правопорушення із статусом «У провадженні» та/або «Повернуто судом»"));
    }//функція Дублікат Для КС в якому 1 КП

    @Test
    public void filtrByNumber () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.chooseNumbKP();
        registerCriminalProceedings.searchKP();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareResultFiltr());
    }//проверка фильтра по номеру провадження

    @Test
    public void filtrByData() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.searchKPByData();

        checkExpectedResult("Avatar is present", actionsWithOurElements.compareResultFiltDate());
    }//проверка филтра по номеру дате

    @Test
    public void procToProc() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        registerCriminalProceedings.chooseKP("tpBody_237", "У провадженні");
        cardCriminalProceedings.admissionToProceedings();

        checkExpectedResult("Avatar is present", actionsWithOurElements.comparisonTipeAction());
       }//Прийняття провадження до провадження. Статус провадження "У проваджені"

    @Test
    public void editOffenceProceed () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.enterAdress("Печенежская");
            krimOffensePage.saveEdProc();
            krimOffensePage.chooseWind();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_63", "Печенежская"));
        }
    }//Редагування правопорушення у КС зі статусами «У провадженні»

    @Test
    public void editOffenceProceedStopped() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Зупинено")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToEditCrimOffenses();
            try {
                Thread.sleep(2000);
                krimOffensePage.enterAdress("Печенежская");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            krimOffensePage.saveEdProc();
            krimOffensePage.chooseWind();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_63", "Печенежская"));
        }
    }//Редагування правопорушення у КС зі статусами  «Зупинено»

    @Test
    public void editOffenceProceedToCoutr() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "До суду")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.enterAdress("Печенежская");
            krimOffensePage.saveEdProc();
            krimOffensePage.chooseWind();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_63", "Печенежская"));
        }
    } //Редагування правопорушення у КС зі статусами «До суду»

    @Test
    public void editOffenceProceedClosed () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Закрито")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.enterAdress("Печенежская");
            krimOffensePage.saveEdProc();
            krimOffensePage.chooseWind();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_63", "Печенежская"));
        }
    }//Редагування правопорушення у КС зі статусами «Закрито»

    @Test
    public void editOffenceProceedReturnedByCourt() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.enterAdress("Печенежская");
            krimOffensePage.saveEdProc();
            krimOffensePage.chooseWind();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_63", "Печенежская"));
        }
    }//Редагування правопорушення у КС зі статусами «Повернуто судом»

    @Test
    public void editOffenceProceedWithResultTrial() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Результат суду")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToCrimOffense();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("control_190", "Перегляд правопорушення заборонено!"));
        }
    }//Редагування правопорушення у КС зі статусами "Результат суду"

    @Test
    public void editOffenceProceedCombined() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Об'єднано")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            cardCriminalProceedings.goToCrimOffense();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("control_190", "Перегляд правопорушення заборонено!"));
        }
    }//Редагування правопорушення у КС зі статусами "Об'єднано"

    @Test
    public void editOffenceProceedPP() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_109"));
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.serchQualCrimeField();
            krimOffensePage.qualificationCrime("СТ.118");
            krimOffensePage.save();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кваліфікацію змінено. Необхідно очистити та при наявності підстави повторно вказати додаткову відмітку."));
        }
    }//Редагування правопорушення з ПП у КС зі статусами «У провадженні». Змінити статтю.

    @Test
    public  void editOffenceProceedPPStopped() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Зупинено")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_106"));
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.serchQualCrimeField();
            krimOffensePage.qualificationCrime("СТ.118");
            krimOffensePage.save();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кваліфікацію змінено. Необхідно очистити та при наявності підстави повторно вказати додаткову відмітку."));
        }
    }//Редагування правопорушення з ПП у КС зі статусами «Зупинено». Змінити статтю.

    @Test
    public void editOffenceProceedPPToCoutr() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "До суду")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_104"));
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.serchQualCrimeField();
            krimOffensePage.qualificationCrime("СТ.118");
            krimOffensePage.save();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кваліфікацію змінено. Необхідно очистити та при наявності підстави повторно вказати додаткову відмітку."));
        }
    }//Редагування правопорушення з ПП у КС зі статусами «До суду». Змінити статтю.

    @Test
    public void editOffenceProceedPPClosed() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Закрито")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_80"));
            cardCriminalProceedings.goToEditCrimOffenses();
            krimOffensePage.serchQualCrimeField();
            krimOffensePage.qualificationCrime("СТ.118");
            krimOffensePage.save();

            checkExpectedResult("Popup is present", actionsWithOurElements.compareWithDialogBox("popup_message", "Кваліфікацію змінено. Необхідно очистити та при наявності підстави повторно вказати додаткову відмітку."));
        }
    }//Редагування правопорушення з ПП у КС зі статусами «Закрито». Змінити статтю.

    @Test
    public void enteringDataOnLosses() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_109"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }else {
            Assert.fail("There is not offense");
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «У провадженні»

    @Test
    public void enteringDataOnLossesStopped() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        krimProccedingsPage.findOffenceStopped();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Зупинено")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_106"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }else {
            Assert.fail("There is not offense");
        }

    }//Внесення даних по збиткам у правопорушенні зі статусами «Зупинено»

    @Test
    public void enteringDataOnLossesToCoutr() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "До суду")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_104"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «До суду»

    @Test
    public void enteringDataOnLossesClosed() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Закрито")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_80"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «Закрито»

    @Test
    public void enteringDataOnLossesReturnedByCourt() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_84"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }else {
            System.out.println("There is not offense");
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «Повернуто судом»

    @Test
    public void enteringDataOnLossesWithResultTria() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        krimProccedingsPage.findOffenceResultTrial();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Результат суду")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_84"));
            cardCriminalProceedings.goToLossesCard();
            lossesCard.amountOfMaterialDamage();
            krimOffensePage.saveDamageCard();

            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
        }else {
            Assert.fail("There is not offense");
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «Результат суду»

//    @Test
//    public void enteringDataOnLossesPointOut() {
//        templatePage.loginAfterECP();
//        templatePage.krimProvTab();
//        krimProccedingsPage.goToRegisterCriminalProceedings();
//        krimProccedingsPage.findOffencePointOut();
//        if (krimProccedingsPage.chooseOffense("tpBody_237", "Виділено")) {
//            cardCriminalProceedings.goToCriminalOffensesTab();
//            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_109"));// валью не менял нет провадження с таким статусом
//            cardCriminalProceedings.goToLossesCardWithoutForm11();
//
//            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Збитки додані"));
//        }else {
//            System.out.println("There is not offense");
//        }
//    }//Внесення даних по збиткам у правопорушенні зі статусами «Виділено».УТОЧНИТЬ НУЖНО ЛИ

    @Test
    public void enteringDataOnLossesToForeignCountry() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        krimProccedingsPage.findOffenceForeignCountry();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "До іноземної держави")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            checkExpectedResult("The offender is present", actionsWithOurElements.checkTheOffender("tr_0_79"));
            cardCriminalProceedings.goToLossesCardWithoutForm11();

            checkExpectedResult("The offens was changed", actionsWithOurElements.isElementPresent("control_301"));
        }else {
            Assert.fail("There is not offense");
        }
    }//Внесення даних по збиткам у правопорушенні зі статусами «До іноземної держави»

    @Test
    public void stoppingCriminalProceedings() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.stoppCrimProc();
            if(actionsWithOurElements.compareWithDialogBox("popup_message","Функція не доступна. Відсутні відомості про повідомлення особі про підозру")){
                cardCriminalProceedings.findStopWind();
                cardCriminalProceedings.stoppingCrimProc();
                cardCriminalProceedings.fillForm();
            }
            else{
                cardCriminalProceedings.fillForm();
            }
            checkExpectedResult("The offens was changed", actionsWithOurElements.compareWithDialogBox("popup_message", "Зупинення провадження успішно завершено"));
        }else {
            Assert.fail("There is not offense");
        }
    }//Зупинення кримінального провадження(наговнокодил ппц, под контролем!)

    @Test
    public void resumptionOfCrimProceedings() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Зупинено")) {
            cardCriminalProceedings.recover();
        }
            else{
            System.out.println("nema");
        }
            checkExpectedResult("criminal proceedings have been resumed", actionsWithOurElements.compareWithDialogBox("popup_message","Відновлення провадження успішно завершено"));
    }//Відновлення кримінального провадження

    @Test
    public void determinationOffenseOfOGiZO() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.establishingFeatureOGiZO();
            System.out.println("");
        }else {
            System.out.println("There is no offense with title Povernuto sudom");
        }

        checkExpectedResult("Installation of 'Signs of Offense by OG and ZO' has been completed", krimProccedingsPage.chooseString("tpBody_593", "Ознаки правопорушення ОГ і ЗО"));

    }//Встановлення ознаки правопорушення ОГ і ЗО для КП "Повернуто судом". Перегляд "Рух правопорушення"

    @Test
    public void cancellationOffenseOfOGiZO() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.cancellationFeatureOGiZO();
            System.out.println("");
        }else {
            System.out.println("There is no offense with title Povernuto sudom");
        }

        checkExpectedResult("Installation of 'Signs of Offense by OG and ZO' has been completed", krimProccedingsPage.chooseString("tpBody_593", "Скасовано. Підстава:"));
    }//Скасування ознаки ОГ і ЗО. Перегляд "Рух правопорушення"

    @Test
    public void closingProceedings() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.closeProceed();
        }
        else{
            System.out.println("nema");
        }

        checkExpectedResult("criminal proceedings have been closed", actionsWithOurElements.compareWithDialogBox("popup_message","Закриття провадження виконано"));

    }//Закриття провадження. Провадження містить 1 правопорушення.

    @Test
    public void restorationClosProc() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.recover();
        }
        else{
            System.out.println("nema");
        }

        checkExpectedResult("The reopening process has been successfully completed", actionsWithOurElements.compareWithDialogBox("popup_message","Відновлення провадження успішно завершено"));
    }// Відновлення після закриття

    @Test
    public void closingSeparateOffense() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.closeOffence();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("the proceedings are not closed", actionsWithOurElements.compareWithDialogBox("control_710","Провадження містить одне правопорушення, тому необхідно скористатися функцією закриття провадження, яка розташована на закладці «Основні відомості»"));

    }//Закриття окремого правопорушення. Провадження містить одне правопорушення

    @Test
    public void closingSeparateSevOffense() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.closeSavOffence();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("the proceedings are closed", actionsWithOurElements.compareWithDialogBox("popup_message","Закриття правопорушення виконано"));

    }//Закриття провадження яке яке містить 2 чи більше правопорушень. Відновлення після закриття. ЖОПА С ИФОМ НУЖЕН ВАДИМ

    @Test
    public void determinationOfHeadODR() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.detOfHeadOfODR();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("the proceedings are closed", actionsWithOurElements.compareWithDialogBox("popup_message","Визначення керівника ОДР виконано"));

    }//Визначення керівника ОДР

    @Test
    public void openingMaterials() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.openMaterials();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Дату відкриття матеріалів досудового розслідування іншій стороні встановлено"));

    }//Відкриття матеріалів КС у разі відсутності значення в полі «Матеріали ДР відкрито іншій стороні»

    @Test
    public void openMatWichWasOpen() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.openMaterialsWWO();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("a_24"));

    }//Відкриття матеріалів КС. Поле «Матеріали ДР відкрито іншій стороні» заповнено.

    @Test
    public void recoveryMaterials() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.recMaterials();
        }
        else{
            System.out.println("nema");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Відновлення провадження успішно завершено"));

    }//Відновлення  матеріалів КС після відкриття матеріалів. Поле «Матеріали ДР відкрито іншій стороні» заповнено.

    @Test
    public void formAnExtractOnLosses(){
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.formExtract();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("viewer"));

    }//Сформувати Витяг з ЄРДР в КС з статусом «У провадженні»

    @Test
    public void formAnExtractStopped(){
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "Зупинено")) {
            cardCriminalProceedings.formExtractStoped();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status STOPPED");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("viewer"));

    }//Сформувати Витяг з ЄРДР в КС з статусом «Зупинено»

    @Test
    public void formAnExtractToCoutr() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "До суду")) {
            cardCriminalProceedings.formExtractStoped();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status to court");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("viewer"));

    }//Сформувати Витяг з ЄРДР в КС з статусом «До суду»

    @Test
    public void formAnExtractClosed() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "Закрито")) {
            cardCriminalProceedings.formExtractStoped();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status to court");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("viewer"));

    }//Сформувати Витяг з ЄРДР в КС з статусом «Закрито»

    @Test
    public void formAnExtractReturnedByCourt() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.formExtractStoped();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status to court");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("viewer"));

    }//Сформувати Витяг з ЄРДР в КС з статусом «Повернуто судом»

    @Test
    public void setPreTrialPeriod() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCrimOffensePage();
//            cardCriminalProceedings.setPreTrialPeriod();
            if (cardCriminalProceedings.condition()){
                cardCriminalProceedings.doing();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.performFunction();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.compareDates("control_58"));

    }//Встановити строк ДР (виконати функцію «Повідомлення про підозру»)

    @Test
    public void additionalNotes() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterDate();
        krimOffensePage.enterLastName();
        krimOffensePage.enterName();
        krimOffensePage.patronymic();
        krimOffensePage.selectGender();
        krimOffensePage.selectDataOfBirth();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");

        checkExpectedResult("opening materials", actionsWithOurElements.isElementPresent("input_96"));
    }//Перевірка наявності додаткових відміток для вибраних статей ККУ

    @Test
    public void additionalNotes135() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.openNewRegKP();
        krimOffensePage.selectKRODRInDD();
        krimOffensePage.selectKerOP();
        krimOffensePage.enterNumStatement();
        krimOffensePage.enterLastName();
        krimOffensePage.selectGender();
        krimOffensePage.enterAdress("Празька");
        krimOffensePage.offense();
        krimOffensePage.personWhoCriminal();
        krimOffensePage.enterStory();
        krimOffensePage.qualificationCrime("СТ.115 Ч.2 П.1");
        krimOffensePage.switchToTabFeaturePP();
        krimOffensePage.addNotes();

        checkExpectedResult("the mark is present", actionsWithOurElements.chooseOffense("tpBody_14", "135"));
    }//Перевірка обовязкових полів при виборі додаткової відмітки 135 для статей 115 - 118

    @Test
    public void addingFilesInProcess() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.addNewFile();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("adding materials", actionsWithOurElements.findLine("tr_0_149", "Заява, повідомлення"));
    }//Додавання файлів до провадження та правопорушення у статусі  «У провадженні»

    @Test
    public void addingFilesReturnedByCourt() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (krimProccedingsPage.chooseOffense("tpBody_237", "Повернуто судом")) {
            cardCriminalProceedings.addNewFile();
        }
        else{
            System.out.println("nema");
            Assert.fail("!!!There is not offense with status In the process!!!");
        }
            checkExpectedResult("The offens was changed", actionsWithOurElements.findLine("tr_0_149", "Заява, повідомлення"));
    }//Додавання файлів до провадження та правопорушення у статусі  «Повернуто судом»

    @Test
    public void editingAddedFileProcess() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToAttachedFilesTub();
            if (actionsWithOurElements.findLine("tblFile", "Слідчийгпу Г.П.")) {
                cardCriminalProceedings.editFails();
            }else {
                cardCriminalProceedings.addNewFile();
                actionsWithOurElements.findLine("tblFile", "Слідчийгпу Г.П.");
                cardCriminalProceedings.editFails();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("The offens was changed", actionsWithOurElements.findLine("tr_0_149", "Малява"));
    }//Редагування доданих файлів до провадження та правопорушення у статусах  «У провадженні»

    @Test
    public void deletingAddedFileProcess() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToAttachedFilesTub();
            if (actionsWithOurElements.findLine("tblFile", "Слідчийгпу Г.П.")) {
                cardCriminalProceedings.deletFail();
            }else {
                cardCriminalProceedings.addNewFile();
                actionsWithOurElements.findLine("tblFile", "Слідчийгпу Г.П.");
                cardCriminalProceedings.deletFail();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("The offens was changed", actionsWithOurElements.isNotLine("tr_0_149", "Малява"));

    }//Видалення доданих файлів до провадження та правопорушення у статусах  «У провадженні»

    @Test
    public void editingOffender(){
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToOffenderPage();
            if (cardCriminalProceedings.condition()){
                offenderPage.editOffender();
                System.out.println();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.editOffender();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("The offens was changed", actionsWithOurElements.compareChangedText("control_34", "Саша"));
    }//Редагування правопорушника у проваджені (Внесення змін у форму 2)

    @Test
    public void changingSuspicion() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCrimOffensePage();
            cardCriminalProceedings.changingSusp();
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Зміну підозри виконано"));
    }//Зміна підозри для КС "У провадженні"

    @Test
    public void removMainCardFeuter() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCrimOffensePage();
            if(cardCriminalProceedings.checkSeveralOffenders()) {
                offenderPage.removeMainCard();
            }else{
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                offenderPage.goToRemMainCard();
                if(cardCriminalProceedings.checkSeveralOffenders())
                {
                    cardCriminalProceedings.goToCrimOffensePage();
                    offenderPage.removeMainCard();
                }else{
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                offenderPage.goToRemMainCard();
                offenderPage.removeMainCard();
                }
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Визначення основної картки виконано"));

    }//Зняття ознаки основної картки

    @Test
    public void electionOfPrecautionaryMeasure(){
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            if (cardCriminalProceedings.condition()){
                offenderPage.electionPreventivMeasure();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.electionPreventivMeasure();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Обрання запобіжного заходу виконано"));

    }//Обрання запобіжного заходу (тримання під вартою)

    @Test
    public void continuationOfPrecautionaryMeasure() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            if (cardCriminalProceedings.condition()){
                offenderPage.contPreventivMeasure();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.contPreventivMeasure();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Продовження запобіжного заходу виконано"));
    }//Продовження запобіжного заходу

    @Test
    public void cancellationOfPreventiveMeasure() {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            if (cardCriminalProceedings.condition()){
                offenderPage.cancelPreventivMeasure();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.cancelPreventivMeasure();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }
        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Скасування запобіжного заходу виконано"));
    }//Скасування запобіжного заходу

    @Test
    public void detentionOfPerson () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            if (cardCriminalProceedings.condition()){
                offenderPage.detOfPerson();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.detOfPerson();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Затримання особи виконано"));

    }//Затримання особи - Немає записів щодо затримання

    @Test
    public void identificationOfPersonalityTraitsOGandZO () {
        templatePage.loginAfterECP();
        templatePage.krimProvTab();
        krimProccedingsPage.goToRegisterCriminalProceedings();
        if (actionsWithOurElements.chooseOffense("tpBody_237", "У провадженні")) {
            cardCriminalProceedings.goToCriminalOffensesTab();
            if (cardCriminalProceedings.condition()){
                offenderPage.detOfPerson();
            }else {
                cardCriminalProceedings.preElse();
                offenderPage.addNewOffender();
                cardCriminalProceedings.goToBasicInf();
                offenderPage.detOfPerson();
            }
        }
        else{
            System.out.println("nema");
            Assert.fail("There is not offense with status In the process");
        }

        checkExpectedResult("opening materials", actionsWithOurElements.compareWithDialogBox("popup_message","Затримання особи виконано"));

    }
}
