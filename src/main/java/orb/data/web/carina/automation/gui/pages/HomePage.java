package orb.data.web.carina.automation.gui.pages;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @FindBy(xpath = "(//button[contains(text(),'✕')])[1]")
    private ExtendedWebElement closeLoginPopup;

    @FindBy(xpath = "//img[@title=\"Flipkart\"]")
    private ExtendedWebElement pageTitle;
    @FindBy(xpath = "(//div[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/a)[3]")
    private ExtendedWebElement banner;

    @FindBy(xpath = "//span[contains(text(),'Electronics')]")
    private ExtendedWebElement electronicsDropDown;

    @FindBy(xpath = "(//a[contains(text(),'Mi')])[1]/..")
    private ExtendedWebElement ListOfMobilePhone;

    @FindBy(xpath = "(//a[contains(text(),'Mi')])[1]/../a")
    private List<ExtendedWebElement> mobilePhone;


    @FindBy(xpath = "(//a[contains(text(),'Mobile Cases')])[1]/..")
    private ExtendedWebElement ListOfMobileAccessories;

    @FindBy(xpath = "(//a[contains(text(),'Mobile Cases')])[1]/../a")
    private List<ExtendedWebElement> mobilePhoneAccessories;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void closeLoginPopup()
    {
       // waitUntil(ExpectedConditions.visibilityOf(closeLoginPopup.getElement()), 40);
        closeLoginPopup.click();
    }

    public void clickOnBanner()
    {
            pageTitle.hover();
            waitUntil(ExpectedConditions.visibilityOf(banner.getElement()), 40);
            banner.getElement().click();

    }

    public void hoverOnElectronicsDropDown()
    {
        electronicsDropDown.hover();
    }

    public String getAllMobileList()
    {
        return ListOfMobilePhone.getText();
    }

    public int getAllMobileListSize()
    {
        System.out.println("Size of the MobileList is--> "+mobilePhone.size());
        return mobilePhone.size();
    }

    public String getAllMobileAccessoriesList()
    {
        return ListOfMobileAccessories.getText();
    }

    public int getAllMobileAccessoriesListSize()
    {
        System.out.println("Size of the Mobile Accessories List is--> "+mobilePhoneAccessories.size());
        return mobilePhoneAccessories.size();
    }


}
