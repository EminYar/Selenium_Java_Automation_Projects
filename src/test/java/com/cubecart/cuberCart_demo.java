package com.cubecart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class cuberCart_demo {
    WebDriver driver;

    @BeforeClass
    public void testSetup() {

        //set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/memetiminabliz/webdriver/chromedriver");

//define a chrome driver instance
        driver = new ChromeDriver();

        //implicit wait

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//Navigate to ​https://www.credify.tech/phone/nonDMFunnel

        driver.navigate().to("http://eminyarkant.cubecart.online/admin_rbLqN5.php");

    }

    @Test(priority = 0)

    //Login

    public void Login() {

        //Login

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

        driver.findElement(By.id("password")).sendKeys("Kg1xJmm2");
        driver.findElement(By.name("login")).click();


        WebElement dashboard = driver.findElement(By.xpath("//ul[@class='location']//a[contains(text(),'Dashboard')]"));

        Assert.assertEquals("Dashboard", dashboard.getText());

    }

    @Test(priority = 1)

    // Add a product

    public void AddProduct() throws InterruptedException {

        //Let's get started with some basic information
        driver.findElement(By.id("nav_products")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Add Product')]")).click();

        driver.findElement(By.id("name")).sendKeys("Table");


        driver.findElement(By.id("condition")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("condition")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("product_code")).sendKeys("CA12345");

        driver.findElement(By.className("checkbox")).click();

        driver.findElement(By.id("product_weight")).sendKeys("20kg");

        Select oSelect = new Select(driver.findElement(By.xpath("//select[@id='dimension_unit']")));
        oSelect.selectByVisibleText("Centimeters (cm)");


        driver.findElement(By.xpath("//input[@id='product_width']")).sendKeys("40");

        driver.findElement(By.id("product_height")).sendKeys("60");

        driver.findElement(By.id("product_depth")).sendKeys("30");
        driver.findElement(By.xpath("//div[12]//span[1]//img[1]")).click();
        driver.findElement(By.xpath("//div[13]//span[1]//img[1]")).click();
        driver.findElement(By.xpath("//div[14]//span[1]//img[1]")).click();

        driver.findElement(By.xpath("//fieldset[2]//div[1]//span[1]//img[1]")).click();

        driver.findElement(By.xpath("//input[@id='stock_level']")).sendKeys("level");

        driver.findElement(By.id("stock_warning")).sendKeys("Yes");

        driver.findElement(By.id("upc")).sendKeys("21200");

        driver.findElement(By.id("ean")).sendKeys("23000");

        driver.findElement(By.id("jan")).sendKeys("24000");

        driver.findElement(By.id("isbn")).sendKeys("25000");

        driver.findElement(By.id("gtin")).sendKeys("24050");

        driver.findElement(By.id("mpn")).sendKeys("26000");


     driver.findElement(By.xpath("//a[@class='chosen-single']/span")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='chosen-results']"));


        for (int i = 0; i < elements.size(); i++) {

            if(elements.get(i).getText().contains("Animals & Pet Supplies"))

            {
           // System.out.println(elements.get(i).getText());
            elements.get(i).click();
            break;
           }
        }

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement seleniumlink;
        seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']//input[3]")));
        seleniumlink.click();

        }

        @Test(priority = 2)
//Add customer
        public void AddCustomer () {

            driver.findElement(By.xpath("//a[contains(text(),'Customer List')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();

            driver.findElement(By.xpath("//img[@class='checkbox']")).click();

            driver.findElement(By.id("cust-title")).sendKeys("New Customer");
            driver.findElement(By.xpath("//input[@id='cust-firstname']")).sendKeys("Emin");

            driver.findElement(By.id("cust-lastname")).sendKeys("yarkant");

            WebElement dropd = driver.findElement(By.id("cust-type"));

            Select select1 = new Select(dropd);

            select1.selectByVisibleText("Unregistered Customer");

            driver.findElement(By.id("cust-email")).sendKeys("emin.yarkant@gmail.com");

            driver.findElement(By.id("cust-mobile")).sendKeys("6477076421");
            driver.findElement(By.id("subscription_status")).sendKeys(Keys.ARROW_DOWN);

            driver.findElement(By.id("subscription_status")).sendKeys(Keys.ENTER);

            driver.findElement(By.id("cust-password")).sendKeys("A20061020bcdf");
            driver.findElement(By.id("cust-passconf")).sendKeys("A20061020bcdf");

            driver.findElement(By.xpath("//input[@name='save']")).click();

        }

// Sign out from the web page

        @Test(priority = 3)

        public void Signout () {

           driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();

        }

        @AfterClass
        public void afterClass () {
            driver.quit();
        }

    }
