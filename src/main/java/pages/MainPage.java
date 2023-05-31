package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPage {

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/ul[1]/li[1]/a")
    WebElement inButton;

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[1]/div/div/div[2]/div/form/div/div[1]/fieldset/input")
    WebElement searchInput;

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[1]/div/div/div[2]/div/form/div/div[2]/button")
    WebElement searchButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div/div[5]/a")
    WebElement loginButton;

    public WebDriver webDriver;

    public MainPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
}
