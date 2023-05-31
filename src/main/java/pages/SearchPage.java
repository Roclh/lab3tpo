package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SearchPage {

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div[1]/h1")
    WebElement searchResultHeader;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/div[2]/div[2]  ")
    WebElement cvButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div[2]/div[2]/div[2]/main/div[1]/div[2]/div/div[1]/div/div[3]/h3/span/a")
    WebElement firstVacancyHeader;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[1]")
    WebElement cvHeader;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[2]/div/div[1]/main/div[1]/div[2]/div[1]/div[1]/div[1]/span/a")
    WebElement firstCVHeader;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/div[2]/div[3]")
    WebElement companyButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/div[2]/form/div[1]/div[1]/fieldset/input")
    WebElement companyInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/div[2]/form/div[1]/div[2]/button")
    WebElement companySearchButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/div[4]/span[1]")
    WebElement companySearchResultNumber;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/div[4]/span[2]/span")
    WebElement companySearchResultCompany;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/div[4]/span[3]/span")
    WebElement companySearchResultFound;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div/table/tbody/tr/td/div[1]/a")
    WebElement firstCompanyHeader;

    public WebDriver webDriver;

    public SearchPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
}
