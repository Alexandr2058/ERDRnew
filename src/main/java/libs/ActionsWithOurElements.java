package libs;

import io.appium.java_client.windows.WindowsDriver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class ActionsWithOurElements {

    static String dataSM = "";
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait10;
    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 100);
    }

    private static final int nameOfTheIndividual = 6;
    public static String getRandomName() {
        String s = "абвгдежзиклмнопрстуфхцчшщюя";
        StringBuffer phoneNumber = new StringBuffer();
        for (int i = 0; i < nameOfTheIndividual; i++) {
            phoneNumber.append(s.charAt(new Random().nextInt(s.length())));
        }
        return phoneNumber.toString();
    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannon work with element" + e);
        Assert.fail("Cannon work with element" + e);
    }

    public void ECPF() {
        WindowsDriver ECPSession = null;
        WebElement PSDApp = null;
        WindowsDriver Sesion = null;
        String PSDAppTopLevelWindowHandle = null;
        String NumFromNWHandle = null;

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Root");
            ECPSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);//WindowsDriver
            ECPSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//WindowsDriver

            PSDApp = ECPSession.findElementByName("Personal DS service");//WebElement
            PSDAppTopLevelWindowHandle = PSDApp.getAttribute("NativeWindowHandle");//String

            int number=Integer.parseInt(PSDAppTopLevelWindowHandle);
            String hex=Integer.toString(number, 16);

            DesiredCapabilities appCapab = new DesiredCapabilities();
            appCapab.setCapability("appTopLevelWindow",  hex );
            Sesion = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab);//WindowsDriver
            System.out.println(Sesion);
            Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//WindowsDriver

        }catch (Exception e) {
            e.printStackTrace();
        }finally{
        }

        Sesion.findElementByName("English").click();
        Sesion.findElementByName("English").sendKeys(Keys.CONTROL+"a", Keys.DELETE );
        Sesion.findElementByName("English").sendKeys(Keys.TAB, "C:\\Users\\achepik\\Desktop\\Keys\\Keys 2019\\GPU\\slid_GPU.pfx");
        Sesion.findElementByName("English").sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "12345678");
        Sesion.findElementByName("Ok").click();
        Sesion.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
            webDriver.findElement(By.id("control_17")).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("ne clikaet");
        }
    }

    public void  ECPS() {

        WindowsDriver ECPSession1 = null;
        WebElement PSDApp1 = null;
        WindowsDriver Sesion1 = null;
        String PSDAppTopLevelWindowHandle1 = null;
        String NumFromNWHandle1 = null;

        try {
            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("app", "Root");
            ECPSession1 = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities1);
            ECPSession1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            PSDApp1 = ECPSession1.findElementByName("Personal DS service");
            PSDAppTopLevelWindowHandle1 = PSDApp1.getAttribute("NativeWindowHandle");

            int number=Integer.parseInt(PSDAppTopLevelWindowHandle1);
            String hex=Integer.toString(number, 16);

            DesiredCapabilities appCapab1 = new DesiredCapabilities();
            appCapab1.setCapability("appTopLevelWindow",  hex );
            Sesion1 = new WindowsDriver(new URL("http://127.0.0.1:4723") , appCapab1);
            System.out.println(Sesion1);
            Sesion1.findElementByName("OK").sendKeys(Keys.ENTER);
//            Sesion1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }catch (Exception e) {
            e.printStackTrace();
        }finally{
        }

        try {
            Thread.sleep(6500);
            webDriver.findElement(By.id("control_24")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addNewFileW() {
        WindowsDriver ECPSession3 = null;
        WebElement PSDApp1 = null;

        try {
            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("app", "Root");
            ECPSession3 = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities1);
            ECPSession3.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            PSDApp1 = ECPSession3.findElementByName("Open");

//            ECPSession3.findElementByName("Address").sendKeys( "Desktop");
            ECPSession3.findElementByName("File name:").sendKeys( "passwopassword.txt");
            ECPSession3.findElementByName("File name:").sendKeys( Keys.TAB, Keys.TAB, Keys.ENTER);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseNewWindow(String locator) {
        String parent = webDriver.getWindowHandle();
        logger.info("Parent window is" + parent);
        webDriver.findElement(By.xpath(locator)).click();
        Set<String> allWindows = webDriver.getWindowHandles();
        int count = allWindows.size();
        logger.info("Total window " + count);
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                webDriver.switchTo().window(child);
            }
        }
    }

    public void selectDataInDD(String data) {
        try {
//            wait10.until(ExpectedConditions.elementToBeClickable(By.xpath(data)));
            Thread.sleep(2000);
            webDriver.findElement(By.xpath(data)).click();
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void enterTextIntoElement(WebElement element, String text) {
        try {
            Thread.sleep(1500);
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was input into element");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickOnElement(WebElement element) {
        try {
//            wait10.until(ExpectedConditions.elementToBeClickable(element));
            Thread.sleep(1500);
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void enterDate() {
        DateFormat dateFormat2 = new SimpleDateFormat("d");
        Date date2 = new Date();
        String today = dateFormat2.format(date2);
        //find the calendar
        WebElement dateWidget = webDriver.findElement(By.id("calendarDiv_411"));//calendarDiv_411
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        for (WebElement cell : columns) {
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }
    }

    public void enterDateInArea(WebElement element) {
        DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy");
        Date date2 = new Date();
        String today = dateFormat2.format(date2);
//        System.out.println(today);
        element.clear();
        element.sendKeys(today);
    }

    public void enterTodayDateExtended (WebElement element) {
        DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date date2 = new Date();
        String today = dateFormat2.format(date2);
        System.out.println(today);
        element.clear();
        element.sendKeys(today);
    }

    public void enterDatePlusTwoM(WebElement element) {
        long n = 2562000000L;
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        String today = dateFormat2.format(date);
        long date3 = date.getTime();
        long date4 = date3 + n;
        String result = new java.text.SimpleDateFormat("dd.MM.yyyy").format(new Date(date4));
        element.clear();
        element.sendKeys(result);
    }

    public void enterDateHWN(WebElement element, Integer numMonth) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, numMonth);
        String newDate = sdf.format(cal.getTime());
//        System.out.println("new date: " + newDate);
        element.clear();
        element.sendKeys(newDate);
    }

    public void scroll() {
        try {
            Runtime.getRuntime().exec("C:\\Users\\AChepik\\Desktop\\scroll.exe");
            logger.info("AutoIT Script Started");
        }catch (Exception e) {
            logger.error("AutoIt Unvalid");
            e.printStackTrace();
        }
    }

    public void windowSearch(String locator) {
        String currentWindow = webDriver.getWindowHandle();
        for(String winHandle : webDriver.getWindowHandles()){
            if(!winHandle.equals(currentWindow)){
                webDriver.switchTo().window(winHandle);
                logger.info("current window " + currentWindow);
                logger.info("window " + winHandle);
                try {
                    webDriver.findElement(By.xpath(locator));
                    logger.info("catch");
                }catch (Exception e) {
                    e.printStackTrace();
                    logger.info("no");
                }
            }
        }
    }

    public void windowSearchs(WebElement windowH) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String child = null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            child = (String) it.next();
        }
        webDriver.switchTo().window(child);
        try {
            windowH.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public void windowSearchThre(WebElement windowT) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String childOne = null;
        String childTwo =null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            childOne = (String) it.next();
            childTwo = (String) it.next();
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(parent)) {
                webDriver.switchTo().window(parent);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childOne)) {
                webDriver.switchTo().window(childOne);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childTwo)) {
                webDriver.switchTo().window(childTwo);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public void windowSearchFour(WebElement windowT) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String childOne = null;
        String childTwo =null;
        String childThree =null;
//        String childf =null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            childOne = (String) it.next();
            childTwo = (String) it.next();
            childThree = (String) it.next();
//            childf = (String) it.next();
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childOne)) {
                webDriver.switchTo().window(childOne);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childTwo)) {
                webDriver.switchTo().window(childTwo);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childThree)) {
                webDriver.switchTo().window(childThree);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

//        for (String winHandle : webDriver.getWindowHandles()) {
//            if (!winHandle.equals(childf)) {
//                webDriver.switchTo().window(childf);
//            }
//        }
//        try {
//            webDriver.findElement(By.id(windowT)).click();
//            logger.info("wot ono");
//        }catch (Exception e) {
//            e.printStackTrace();
//            logger.info("mimo");
//        }
    }

    public void windowSearchFive(WebElement windowT) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String childOne = null;
        String childTwo =null;
        String childThree =null;
        String childf =null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            childOne = (String) it.next();
            childTwo = (String) it.next();
            childThree = (String) it.next();
            childf = (String) it.next();
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(parent)) {
                webDriver.switchTo().window(parent);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childOne)) {
                webDriver.switchTo().window(childOne);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childTwo)) {
                webDriver.switchTo().window(childTwo);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childThree)) {
                webDriver.switchTo().window(childThree);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childf)) {
                webDriver.switchTo().window(childf);
            }
        }
        try {
            windowT.click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public void windowSearchSix (String windowT) {
        Set<String> windows = webDriver.getWindowHandles();
        String parent = null;
        String childOne = null;
        String childTwo =null;
        String childThree =null;
        String childf =null;
        String childS =null;
        Iterator<String> it = windows.iterator();
        while(it.hasNext()) {
            parent = (String) it.next();
            childOne = (String) it.next();
            childTwo = (String) it.next();
            childThree = (String) it.next();
            childf = (String) it.next();
            childS = (String) it.next();
        }
        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childOne)) {
                webDriver.switchTo().window(childOne);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childTwo)) {
                webDriver.switchTo().window(childTwo);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childThree)) {
                webDriver.switchTo().window(childThree);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childf)) {
                webDriver.switchTo().window(childf);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }

        for (String winHandle : webDriver.getWindowHandles()) {
            if (!winHandle.equals(childS)) {
                webDriver.switchTo().window(childS);
            }
        }
        try {
            webDriver.findElement(By.id(windowT)).click();
            logger.info("wot ono");
        }catch (Exception e) {
            e.printStackTrace();
            logger.info("mimo");
        }
    }

    public boolean compareWithDialogBox(String popupPass, String message) {
        try {
            Thread.sleep(1500);
            String dialogBox = webDriver.findElement(By.id(popupPass)).getText();
            System.out.println(dialogBox);
            if (dialogBox.equals(message)) {
                return true;
            }
            return false;
        }catch (Exception e) {
          //  Assert.fail("Offenses is not added");
            return false;
        }
    }


    public boolean compareChangedText(String locator, String enteredText) {
        try {
            Thread.sleep(1500);
            String changedText = webDriver.findElement(By.id(locator)).getAttribute("value");
//            System.out.println(changedText);
            if (changedText.equals(enteredText)) {
            }
            return true;
        }catch (Exception e){
            Assert.fail("Offence is not changed");
            return false;
        }
    }

//    public void chooseOffense(String locator, String status) {
//        WebElement offenses = webDriver.findElement(By.id(locator));
//        List<WebElement> columns = offenses.findElements(By.tagName("td"));
//        for (WebElement cell : columns)
//            if (cell.getText().equals(status)) {
//                Actions actions = new Actions(webDriver);
//                actions.doubleClick(cell).perform();
//                break;
//            }
//        logger.info("Offense was choosed");
//    }

    public boolean compareResultFiltr() {
        try {
            String variable = webDriver.findElement(By.id("control_38")).getAttribute("value");
            System.out.println(variable);
            for (int i = 1; i < 20; i++) {
                WebElement offenses = webDriver.findElement(By.id("tr_0_237"));
                List<WebElement> columns = offenses.findElements(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td/div/table/tbody[2]/tr[" + i + "]/td[2]"));
                for (WebElement cell : columns)
                    if (cell.getText().equals(variable)) {
                        return true;
                    }/*logger.info("Offense was choosed");*/
            }return true;
        }catch (Exception e) {
            Assert.fail("Filtr is not working");
            return false;
        }
    }

    public boolean compareResultFiltDate() {

        boolean bool=true;
        boolean result=true;
        int count=0;
        String var1="";

            for (int i=1;bool==true;i++) {
                try {
                    WebElement el = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[3]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[3]/td/div/table/tbody[2]/tr[" + i + "]/td[3]"));
                    if (el == null) break;
                    var1 = el.getText();
                } catch(Exception e) {
                    break;
                }
//        System.out.println(var1);
        String s = var1;
        s = s.substring(0, s.indexOf(" "));
//        System.out.println(i+"\t"+s);
        if (s.trim().length()<2) {
            if (count>5) break;
            count++;
            continue;
        }
        System.out.println(i+"\t"+s+" | "+s.length()+" | "+count);
        Date date1, date2, date3;
        String var2 = webDriver.findElement(By.id("control_40")).getAttribute("value");
        String var3 = webDriver.findElement(By.id("control_41")).getAttribute("value");
        try {
            date1 = new SimpleDateFormat("dd.MM.yyyy").parse(s);
            date2 = new SimpleDateFormat("dd.MM.yyyy").parse(var2);
            date3 = new SimpleDateFormat("dd.MM.yyyy").parse(var3);

            System.out.println(date1.toString()+"\t"+date2.toString()+" | "+date3.toString());

            if (date1.after(date2) && date1.before(date3))
                result=true;
            else result=false;
        }catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
            }return result;
    }

    public void selectValueInDD(WebElement element, String value) {
        try {
            Select select = new Select(element);
            System.out.println(select);
            select.selectByValue(value);
            logger.info(value + " was selected in DD");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public boolean comparisonTipeAction(){

        boolean result=true;
        boolean bool=true;
        String type="";
        String date="";
        String status = "Прийняття до провадження";
        String dateShort = "";

        DateFormat dateFormat2 = new SimpleDateFormat("dd.MM.yyyy");
        Date date2 = new Date();
        String today = dateFormat2.format(date2);
        System.out.println(today);

        for (int i=1;bool==true;i++) {
            try {
                WebElement el = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/td/div/table/tbody/tr[" + i + "]/td[2]"));
                if (el == null) break;
                type = el.getText();
                WebElement elDate = webDriver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[2]/td/div/form/table/tbody/tr/td/div/table/tbody/tr[3]/td/div/table/tbody/tr/td/div/div/div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/td/div/table/tbody/tr[" + i + "]/td[5]"));
                date = elDate.getText();
                dateShort = date.substring(0, date.indexOf(" "));
                if (type.equals(status) && dateShort.equals(today))
                    result = true;
                else result=false;
            } catch (Exception e) {
                break;
            }
        }return result;
    }

    public boolean checkTheOffender(String value) {
        boolean result=true;

        try {
            Thread.sleep(100);
            webDriver.findElement(By.id(value));
            logger.info("the offender is present");
        } catch (Exception e) {
            logger.info("the offender is not present");
//            Assert.fail("the offender is not present");
            result = false;
        }
        logger.info("The offender is present");
        return result ;
    }

    public boolean checkTheOffenderX (String value) {
        boolean result=true;

        try {
            Thread.sleep(100);
            webDriver.findElement(By.xpath(value));
            logger.info("the offender is present");
        } catch (Exception e) {
            logger.info("the offender is not present");
//            Assert.fail("the offender is not present");
            result = false;
        }
        logger.info("The offender is present");
        return result;
    }


    public void scrollJS() {
        try {
            Thread.sleep(1500);
            JavascriptExecutor jsx = (JavascriptExecutor)webDriver;
            jsx.executeScript("window.scrollBy(0,500)", "");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(String element) {
        boolean result = true;
        try {
            Thread.sleep(100);
            webDriver.findElement(By.id(element)).click();
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean isElementPresent (WebElement element) {
        boolean result = true;
        try {
            Thread.sleep(100);
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public boolean findElement (String element) {
        try {
            Thread.sleep(100);
            webDriver.findElement(By.id(element)).click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }

    public void popupmessage() {
        try {
            Thread.sleep(1000);
            webDriver.findElement(By.id("popup_ok")).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean chooseDesString(WebElement locator, String status) {
        try {
            Thread.sleep(3500);
            WebElement offenses = webDriver.findElement(By.xpath(String.valueOf(locator)));
            List<WebElement> columns = offenses.findElements(By.tagName("td"));
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
                    jsx.executeScript("window.scrollBy(0,10)", "");}

            if (!isElement) {
                logger.info("Offense is not exist");
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

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
                    jsx.executeScript("window.scrollBy(0,5)", "");
                }
            if (!isElement) {
                logger.info("Offense is not exist");
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean findLine(String locator, String status) {
        try {
            Thread.sleep(3500);
            WebElement offenses = webDriver.findElement(By.id(locator));
            List<WebElement> columns = offenses.findElements(By.tagName("td"));
            boolean isElement=false;
            for (WebElement cell : columns)
                if (cell.getText().equals(status)) {
                    Actions actions = new Actions(webDriver);
                    actions.moveToElement(cell).click(cell).perform();
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

    public boolean isNotLine(String locator, String status) {
        try {
            Thread.sleep(3500);
            WebElement offenses = webDriver.findElement(By.id(locator));
            List<WebElement> columns = offenses.findElements(By.tagName("td"));
            boolean isElement=false;
            for (WebElement cell : columns)
                if (cell.getText().equals(status)) {
                    Actions actions = new Actions(webDriver);
                    actions.moveToElement(cell).click(cell).perform();
                    isElement=true;
                    logger.info("Offense was choosed");
                    break;
                }
                else {JavascriptExecutor jsx = (JavascriptExecutor)webDriver;
                    jsx.executeScript("window.scrollBy(0,5)", "");}
            if (!isElement) {
                logger.info("Offense is not exist");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
        return false;
    }

    public String getData (String dataArea) {
        dataSM = webDriver.findElement(By.xpath(dataArea)).getAttribute("value");
        System.out.println(dataSM);
        return dataSM;
    }

    public boolean compareDates(String dataArea2)  {

        try {
            long n = 5270400000L;
            Thread.sleep(1500);
            String dataSMF = webDriver.findElement(By.id(dataArea2)).getAttribute("value");
//            System.out.println(dataSMF);
//            System.out.println(dataSM);
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date dateE = format.parse(dataSMF);
            Date dateS = format.parse(dataSM);
            System.out.println(dateE);
            System.out.println(dateS);
            long delt = dateE.getTime() - dateS.getTime();
//            System.out.println(delt);
//            Date d1 = new Date (delt);
//            Date d2 = new Date(delt*1000);
//            System.out.println(d1);
//            System.out.println(d2);
            if (delt == n) {
                return true;
            } else
                return false;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void doublClick(WebElement cell) {
        Actions actions = new Actions(webDriver);
        actions.doubleClick(cell).perform();
        logger.info("double click done");
    }


}
