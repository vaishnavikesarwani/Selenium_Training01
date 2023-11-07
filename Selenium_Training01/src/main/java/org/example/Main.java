package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        String title=driver.getTitle();
        System.out.println(title);
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
        Actions actions = new Actions(driver);
        WebElement register=driver.findElement(By.xpath("//a[contains(text(),'register')]"));
        register.click();
        WebElement personalAccount=driver.findElement( By.xpath("//label[contains(text(),'Personal account')]"));
        personalAccount.click();
        WebElement firstName=driver.findElement(By.xpath("//input[@id='firstname']"));
        firstName.sendKeys("Vaishnavi");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='lastname']"));
        lastName.sendKeys("Kesarwani");
        WebElement Email= driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("vaishnavi.kes@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Ebay22210@");
        WebElement button=driver.findElement( By.xpath("//*[@type='submit' and @id='EMAIL_REG_FORM_SUBMIT']"));
        button.click();
        WebElement product=driver.findElement(By.xpath("//input[@aria-expanded='false' and @aria-label='Search for anything']"));
        product.sendKeys("Mobile");
        driver.findElement(By.xpath(" //input[@type='submit' and @value='Search']")).click();

        //handle drop box:
        Select select=new Select(driver.findElement(By.xpath("//input[@id='product']")));
        select.selectByVisibleText("Headphones");
        driver.quit();
    }
}