package SecondLecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launcher {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = initChromeDriver();
        scriptA();
        driver = initChromeDriver();
        scriptB();
    }
    public static WebDriver initChromeDriver()
    {

        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver.exe");
        return new ChromeDriver();
    }
    public static void scriptA()
    {
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();
        driver.close();
    }
    public static void scriptB()
    {
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.name("submitLogin")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }

        //Раздел Dasdboard

        driver.findElement(By.id("tab-AdminDashboard")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String dashboardExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(dashboardExp);
        driver.navigate().refresh();
        String dashboardAct = driver.findElement(By.tagName("h2")).getText();
        if(dashboardExp.equals(dashboardAct))
        {
            System.out.println("dashboard was passed");
        }
        else
        {
            System.out.println("dashboard was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел заказы

        driver.findElement(By.id("subtab-AdminParentOrders")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String zakazyExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(zakazyExp);
        driver.navigate().refresh();
        String zakazyAct = driver.findElement(By.tagName("h2")).getText();
        if(zakazyExp.equals(zakazyAct))
        {
            System.out.println("zakazy was passed");
        }
        else
        {
            System.out.println("zakazy was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел каталог

        driver.findElement(By.id("subtab-AdminCatalog")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String catalogExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(catalogExp);
        driver.navigate().refresh();
        String catalogAct = driver.findElement(By.tagName("h2")).getText();
        if(catalogExp.equals(catalogAct))
        {
            System.out.println("catalog was passed");
        }
        else
        {
            System.out.println("catalog was failed");
        }
        driver.findElement(By.cssSelector("a.logo.pull-left")).click();

        //Раздел клиенты

        driver.findElement(By.id("subtab-AdminParentCustomer")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String clientsExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(clientsExp);
        driver.navigate().refresh();
        String clientsAct = driver.findElement(By.tagName("h2")).getText();
        if(clientsExp.equals(clientsAct))
        {
            System.out.println("clients was passed");
        }
        else
        {
            System.out.println("clients was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел служба поддержки

        driver.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String supportExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(supportExp);
        driver.navigate().refresh();
        String supportAct = driver.findElement(By.tagName("h2")).getText();
        if(supportExp.equals(supportAct))
        {
            System.out.println("support was passed");
        }
        else
        {
            System.out.println("support was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел статистика

        driver.findElement(By.id("subtab-AdminStats")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String statExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(statExp);
        driver.navigate().refresh();
        String statAct = driver.findElement(By.tagName("h2")).getText();
        if(statExp.equals(statAct))
        {
            System.out.println("stat was passed");
        }
        else
        {
            System.out.println("stat was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел modules

        driver.findElement(By.id("subtab-AdminParentModulesSf")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String modulesExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(modulesExp);
        driver.navigate().refresh();
        String modulesAct = driver.findElement(By.tagName("h2")).getText();
        if(modulesExp.equals(modulesAct))
        {
            System.out.println("modules was passed");
        }
        else
        {
            System.out.println("modules was failed");
        }
        driver.findElement(By.cssSelector("a.logo.pull-left")).click();

        //Раздел Design

        driver.findElement(By.id("subtab-AdminParentThemes")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String designExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(designExp);
        driver.navigate().refresh();
        String designAct = driver.findElement(By.tagName("h2")).getText();
        if(designExp.equals(designAct))
        {
            System.out.println("design was passed");
        }
        else
        {
            System.out.println("design was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел Доставка

        driver.findElement(By.id("subtab-AdminParentShipping")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String deliveryExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(deliveryExp);
        driver.navigate().refresh();
        String deliveryAct = driver.findElement(By.tagName("h2")).getText();
        if(deliveryExp.equals(deliveryAct))
        {
            System.out.println("delivery was passed");
        }
        else
        {
            System.out.println("delivery was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел Способ оплаты

        driver.findElement(By.id("subtab-AdminParentPayment")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String paymentExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(paymentExp);
        driver.navigate().refresh();
        String paymentAct = driver.findElement(By.tagName("h2")).getText();
        if(paymentExp.equals(paymentAct))
        {
            System.out.println("payment was passed");
        }
        else
        {
            System.out.println("payment was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел International

        driver.findElement(By.id("subtab-AdminInternational")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String internationalExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(internationalExp);
        driver.navigate().refresh();
        String internationalAct = driver.findElement(By.tagName("h2")).getText();
        if(internationalExp.equals(internationalAct))
        {
            System.out.println("international was passed");
        }
        else
        {
            System.out.println("international was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел Shop Parametrs

        driver.findElement(By.id("subtab-ShopParameters")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String shopParExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(shopParExp);
        driver.navigate().refresh();
        String shopParAct = driver.findElement(By.tagName("h2")).getText();
        if(shopParExp.equals(shopParAct))
        {
            System.out.println("shop parametrs was passed");
        }
        else
        {
            System.out.println("shop parametrs was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        //Раздел Конфигурация

        driver.findElement(By.id("subtab-AdminAdvancedParameters")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
        String confExp = driver.findElement(By.tagName("h2")).getText();
        System.out.println(confExp);
        driver.navigate().refresh();
        String confAct = driver.findElement(By.tagName("h2")).getText();
        if(confExp.equals(confAct))
        {
            System.out.println("configuration was passed");
        }
        else
        {
            System.out.println("configuration was failed");
        }
        driver.findElement(By.id("header_logo")).click();

        driver.quit();
    }
}
