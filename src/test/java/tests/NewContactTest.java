package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewContactTest extends BaseTest{

    @Test
    public void input() {
        driver.get("https://ap27.lightning.force.com/lightning/page/home");
        driver.findElement(By.className("slds-truncate")).click();
        driver.findElement(By.className("forceActionLink")).click();
        driver.findElement(By.id("input-142")).sendKeys("test");
        driver.findElement(By.id("input-143")).sendKeys("test");
        driver.findElement(By.id("input-132")).sendKeys("3456786");
        driver.findElement(By.id("input-145")).sendKeys("+375259065567");
        driver.findElement(By.id("input-150")).sendKeys("TMS-test@test.com");
        driver.findElement(By.id("input-154")).sendKeys("test");
        driver.findElement(By.id("input-154")).sendKeys("test");

    }
}
