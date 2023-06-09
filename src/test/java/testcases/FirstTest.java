package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {
@Test

    public void openBrowser() {

    System.setProperty("webdriver.chrome.driver", "/Users/sashawork/IdeaProjects/TestAutomation/src/test/resources/chromedriver");
    ChromeOptions options = new ChromeOptions();
    //driver.manage().window().maximize();
    //driver.close();
    options.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://desktop.github.com/");

}
}
