package parentTest;

import io.appium.java_client.windows.WindowsDriver;
import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());

    protected ActionsWithOurElements actionsWithOurElements;
    protected TemplatePage templatePage;
    protected KrimProccedingsPage krimProccedingsPage;
    protected KrimOffensePage krimOffensePage;
    protected CharacteristicsOfCriminalOffense characteristicsOfCriminalOffense;
    protected Victims victims;
    protected UnregisteredCriminalOffenses unregisteredCriminalOffenses;
    protected RegisterCriminalProceedings registerCriminalProceedings;
    protected CardCriminalProceedings cardCriminalProceedings;
    protected MovementOfProceedingsPage movementOfProceedingsPage;
    protected LossesCard lossesCard;
    protected OffenderPage offenderPage;

    @Before
    public void setUp() {
        File file = new File("./src/drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
        webDriver = new FirefoxDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://erdr.gp.gov.ua/erdr/erdr.web.system.LoginPage.cls?AutoLogout=1");
        webDriver.findElement(By.id("control_28")).click();


//        WindowsDriver ECPSession = null;
//        WebElement PSDApp = null;
//        WindowsDriver Sesion = null;
//        String PSDAppTopLevelWindowHandle = null;
//        String NumFromNWHandle = null;
//
//        try {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("app", "Root");
//            ECPSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
//            ECPSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//            PSDApp = ECPSession.findElementByName("Personal DS service");
//            PSDAppTopLevelWindowHandle = PSDApp.getAttribute("NativeWindowHandle");
//
//            int number=Integer.parseInt(PSDAppTopLevelWindowHandle);
//            String hex=Integer.toString(number, 16);
//
//            DesiredCapabilities appCapab = new DesiredCapabilities();
//            appCapab.setCapability("appTopLevelWindow",  hex );
//            Sesion = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab);
//            System.out.println(Sesion);
//            Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//        }
//
//        Sesion.findElementByName("English").click();
//        Sesion.findElementByName("English").sendKeys(Keys.CONTROL+"a", Keys.DELETE );
//        Sesion.findElementByName("English").sendKeys(Keys.TAB, "C:\\Users\\achepik\\Desktop\\Keys\\Keys 2019\\GPU\\slid_GPU.pfx");
//        Sesion.findElementByName("English").sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "12345678");
//        Sesion.findElementByName("Ok").click();
//        Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//
//        try {
//            Thread.sleep(2000);
//            webDriver.findElement(By.id("control_17")).click();
//        }catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("ne clikaet");
//        }

//        WindowsDriver ECPSession1 = null;
//        WebElement PSDApp1 = null;
//        WindowsDriver Sesion1 = null;
//        String PSDAppTopLevelWindowHandle1 = null;
//        String NumFromNWHandle1 = null;
//
//        try {
//            DesiredCapabilities capabilities1 = new DesiredCapabilities();
//            capabilities1.setCapability("app", "Root");
//            ECPSession1 = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities1);
//            ECPSession1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//            PSDApp1 = ECPSession1.findElementByName("Personal DS service");
//            PSDAppTopLevelWindowHandle1 = PSDApp1.getAttribute("NativeWindowHandle");
//
//            int number=Integer.parseInt(PSDAppTopLevelWindowHandle1);
//            String hex=Integer.toString(number, 16);
//
//            DesiredCapabilities appCapab1 = new DesiredCapabilities();
//            appCapab1.setCapability("appTopLevelWindow",  hex );
//            Sesion1 = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab1);
//            System.out.println(Sesion1);
//            Sesion1.findElementByName("OK").sendKeys(Keys.ENTER);
////            Sesion1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//        }
//
//        try {
//            Thread.sleep(5000);
//            webDriver.findElement(By.id("control_24")).click();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        templatePage = new TemplatePage(webDriver);
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        krimProccedingsPage = new KrimProccedingsPage(webDriver);
        krimOffensePage = new KrimOffensePage(webDriver);
        characteristicsOfCriminalOffense = new CharacteristicsOfCriminalOffense(webDriver);
        victims = new Victims(webDriver);
        unregisteredCriminalOffenses = new UnregisteredCriminalOffenses(webDriver);
        registerCriminalProceedings = new RegisterCriminalProceedings (webDriver);
        cardCriminalProceedings = new CardCriminalProceedings(webDriver);
        movementOfProceedingsPage = new MovementOfProceedingsPage(webDriver);
        lossesCard = new LossesCard(webDriver);
        offenderPage = new OffenderPage(webDriver);
    }


    @After
    public void tearDown () {
        webDriver.quit();
    }

    @Step
    protected void checkExpectedResult (String message, boolean actualResalt) {
        Assert.assertEquals(message, actualResalt, true);
    }
}
