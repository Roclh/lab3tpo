package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    @FindBy(xpath = "/html/body/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/h2")
    WebElement myEventsHeader;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[1]/div/div/div/div[6]/a")
    WebElement createVacancy;

    public WebDriver webDriver;

    public ProfilePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public WebElement getMyEventsHeader() {
        return myEventsHeader;
    }

    public WebElement getCreateVacancy() {
        return createVacancy;
    }
}
