package org.safestrome.qa.ui.regression.driver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverWithExtension implements DriverSource {
    static final String extensionPath = System.getProperty("user.dir")+"/src/test/resources/STORM_v1.1.27.crx";
    @Override
    public WebDriver newDriver() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addExtensions(new File(extensionPath));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            return new ChromeDriver(options);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}