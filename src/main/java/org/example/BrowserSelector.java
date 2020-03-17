package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
    public void openBrowser() {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");
        System.out.println(browser);

        {
            // user select chrome browser
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/Resourses/BrowserDriver/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().fullscreen();
                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
                driver.get("https://demo.nopcommerce.com/");

               // driver.get("https://opensource-demo.orangehrmlive.com/");
                // user select firefox browser
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/Resourses/BrowserDriver/geckodriver.exe");

                driver = new FirefoxDriver();
                driver.manage().window().fullscreen();
                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
                 driver.get("https://demo.nopcommerce.com/");
               // driver.get("https://opensource-demo.orangehrmlive.com/");
                // user select Microsoft Edge browser
            }
            else {
                System.out.println("Browser is not correct" + browser);
            }
        }
    }

    public void closeBrowser () {
        driver.quit();
    }

}


