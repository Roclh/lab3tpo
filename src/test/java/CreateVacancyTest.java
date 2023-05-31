import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AuthPage;
import pages.CreateVacancyPage;
import pages.MainPage;
import pages.ProfilePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateVacancyTest {

    public static AuthPage authpage;
    public static WebDriver chromeDriver;
    private static MainPage mainPage;
    private static ProfilePage profilePage;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.get(ConfProperties.getProperty("mainpage"));
        mainPage = new MainPage(chromeDriver);
    }

    @AfterAll
    public static void close(){
       chromeDriver.close();
    }

    @BeforeEach
    public void setAuthPage(){
        chromeDriver.get(ConfProperties.getProperty("mainpage"));
        mainPage.getLoginButton().click();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        authpage = new AuthPage(chromeDriver);
        authpage.getLoginWithPasswordButton().click();
        authpage.getLoginFieldWithPassword().sendKeys(ConfProperties.getProperty("auth_email"));
        authpage.getPasswdField().sendKeys(ConfProperties.getProperty("auth_passwd"));
        authpage.getPasswdButton().click();
    }

    @DisplayName("Test create Vacancy")
    @Test
    public void testCreateVacancy(){
        authpage.getInButton().click();
        profilePage = new ProfilePage(chromeDriver);
        profilePage.getCreateVacancy().click();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expected = "Кем вы хотите работать?";
        CreateVacancyPage createVacancyPage = new CreateVacancyPage(chromeDriver);
        assertEquals(expected, createVacancyPage.getCreateVacancyHeader().getText());
    }

    @DisplayName("Test create Vacancy fill fields")
    @Test
    public void testCreateVacancyFillFields(){
        authpage.getInButton().click();
        profilePage = new ProfilePage(chromeDriver);
        profilePage.getCreateVacancy().click();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CreateVacancyPage createVacancyPage = new CreateVacancyPage(chromeDriver);
        createVacancyPage.getProfessionInput().sendKeys("Программист");
        createVacancyPage.getProfessionSelectSuggested().click();
        createVacancyPage.getProfessionSaveAndContinue().click();
        (new Actions(chromeDriver))
                .pause(Duration.ofSeconds(3))
                .perform();
        createVacancyPage.getPersonalInfoBirthDate().sendKeys("20");
        createVacancyPage.getPersonalInfoBirthMonthSelector().click();
        createVacancyPage.getPersonalInfoBirthMonthSelectorNovember().click();
        createVacancyPage.getPersonalInfoBirthYearInput().sendKeys("2001");
        createVacancyPage.getPersonalInfoPhoneNumberInput().sendKeys("9215852822");
        createVacancyPage.getPersonalInfoSubmitButton().click();
        (new Actions(chromeDriver))
                .pause(Duration.ofSeconds(3))
                .perform();
        createVacancyPage.getEducationSelector().click();
        (new Actions(chromeDriver))
                .pause(Duration.ofSeconds(3))
                .perform();
        createVacancyPage.getJobNoExperienceButton().click();
        (new Actions(chromeDriver))
                .pause(Duration.ofSeconds(3))
                .perform();
        createVacancyPage.getSkillsSqlButton().click();
        createVacancyPage.getSkillsConfirmButton().click();
        (new Actions(chromeDriver))
                .pause(Duration.ofSeconds(3))
                .perform();
        String expected = "Резюме успешно опубликовано. Модератор проверит ваше резюме в ближайшее время";
        assertEquals(expected, createVacancyPage.getSuccessLabel().getText());
    }
}
