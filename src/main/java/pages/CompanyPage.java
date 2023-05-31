package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class CompanyPage {

    @FindBy(xpath = "/html/body/div[5]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div[1]/h1/span[1]")
    WebElement companyName;

    public WebDriver webDriver;

    public CompanyPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
}
