package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver (){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        String browser = ConfigurationReader.getProperty("browser");

        if (driver == null) {
            switch (browser) {
                case "chrome":
                case "CHROME":
                case "Chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                case "Firefox":
                case "FIREFOX":
                    driver = new FirefoxDriver();
                    break;

                default:
                    throw new RuntimeException("Wrong browser name!");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


}
