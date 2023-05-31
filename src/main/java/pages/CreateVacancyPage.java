package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class CreateVacancyPage {

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[1]/fieldset/input")
    WebElement professionInput;

    @FindBy(xpath = "/html/body/div[13]/ul/li[1]")
    WebElement professionSelectSuggested;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/label[31]/span")
    WebElement professionSelectProgrammer;

    @FindBy(xpath = "/html/body/div[13]/div/div[1]/div[4]/button")
    WebElement professionCloseSuggestions;

    @FindBy(xpath = "/html/body/div[13]/div/div[1]/div[2]/div[1]/div/div[1]")
    WebElement professionSuggestionSelectProgrammer;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[1]/button")
    WebElement professionSaveAndContinue;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/fieldset[1]/input")
    WebElement personalInfoSurnameInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/fieldset[2]/input")
    WebElement personalInfoNameInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[25]/div/div[1]/fieldset/input")
    WebElement personalInfoBirthDate;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[25]/div/div[2]/div/select")
    WebElement personalInfoBirthMonthSelector;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[25]/div/div[2]/div/select/option[12]")
    WebElement personalInfoBirthMonthSelectorNovember;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[25]/div/div[3]/fieldset/input")
    WebElement personalInfoBirthYearInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[30]/div/fieldset/input")
    WebElement personalInfoPhoneNumberInput;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/button")
    WebElement personalInfoSubmitButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div")
    WebElement createVacancyHeader;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[3]/label[1]")
    WebElement educationSelector;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/button")
    WebElement educationConfirm;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/button")
    WebElement jobNoExperienceButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div/div[3]/div/div[1]/button")
    WebElement skillsSqlButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div[1]/div[2]/div[3]/div/div[2]/button")
    WebElement skillsConfirmButton;

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div/div/div/div[2]/div[1]/div[1]/h2/span")
    WebElement successLabel;

    public WebDriver webDriver;

    public CreateVacancyPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }


}
