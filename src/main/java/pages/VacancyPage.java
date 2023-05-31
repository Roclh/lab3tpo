package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class VacancyPage {

    public WebDriver webDriver;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[1]/h1")
    WebElement nameElement;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[3]/div[3]/div/div[1]/a")
    WebElement respondButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div[1]/div[3]/div/div[1]/div[2]/div/div[2]")
    WebElement stayContactsPlane;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div[1]/div[3]/div/div[1]/div[2]/div/div[2]/div/form/div[1]/div[2]/fieldset/input")
    WebElement stayContactsInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div[1]/div[3]/div/div[1]/div[2]/div/div[2]/div/form/div[3]/button")
    WebElement stayContactsButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div/div[1]/div[3]/div/div[1]/div[2]/div/div[2]/div/form/div/h2/div")
    WebElement sentOnEmail;

    public VacancyPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
}
