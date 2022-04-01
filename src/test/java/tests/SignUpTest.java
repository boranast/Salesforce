package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void dataInput() {
        driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
        driver.findElement(By.name("UserFirstName")).sendKeys("Anastasiya");
        driver.findElement(By.name("UserLastName")).sendKeys("Borisova");
        driver.findElement(By.name("UserTitle")).sendKeys("student");
        driver.findElement(By.name("UserEmail")).sendKeys("borisova10t@gmail.com");
        driver.findElement(By.name("UserPhone")).sendKeys("+375259065568");
        driver.findElement(By.className("checkbox-ui")).click();
        driver.findElement(By.name("start my free trial")).click();
    }

}
