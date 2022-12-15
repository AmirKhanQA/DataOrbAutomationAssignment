package orb.data.web.carina.automation.testUtils;


import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import com.qaprosoft.carina.core.foundation.webdriver.core.capability.impl.desktop.ChromeCapabilities;
import com.qaprosoft.carina.core.foundation.webdriver.core.capability.impl.desktop.FirefoxCapabilities;
import orb.data.web.carina.automation.gui.pages.HomePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * @author Amir Khan
 */
public class TestSetup extends AbstractTest {
    public static WebDriver driver;
    @BeforeMethod
    public WebDriver beforeMethod()
    {
             driver = getDriver(DEFAULT);
            driver.get("https://www.flipkart.com/");
            return  driver;
    }



}
