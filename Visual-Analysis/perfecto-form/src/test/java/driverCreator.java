import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class driverCreator {

    static String PERFECTO_USER = "daniela@perfectomobile.com";//"MY_USER";
    static String PERFECTO_PASS = "Shelby1967";//"MY_PASS";
    static String PERFECTO_HOST = "qatestlab.perfectomobile.com";//"MY_HOST.perfectomobile.com";

    public static RemoteWebDriver init_driver(String platformName, String platformVersion, String browserName, String browserVersion, String screenResolution) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
        capabilities.setCapability("user", PERFECTO_USER);
        capabilities.setCapability("password", PERFECTO_PASS);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("browserVersion", browserVersion);
        capabilities.setCapability("resolution", screenResolution);

        return new RemoteWebDriver(new URL("https://" + PERFECTO_HOST + "/nexperience/perfectomobile/wd/hub"), capabilities);
    }

}
