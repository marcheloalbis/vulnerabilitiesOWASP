package testcases;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject.LoginPage;
import pageObject.MainPage;
import session.Sesion;

public class TodoistTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void before(){
        Sesion.getInstance().getDriver().get("https://todoist.com/");
    }


    @DisplayName("Verificar la ejecucion del Login https://todoist.com/")
    @Description("Este test es para verificar Login https://todoist.com/ ....")
    @Link("jira.com/10102")
    @Issue("Bug001")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void verifyProjectIsLogged(){
        mainPage.loginButtonTodoist.click();
        loginPage.emailTextBox.setValue("asdasd@asdasdasd.com");
        loginPage.passwordTextBox.setValue("1232434");
        loginPage.loginButton.click();

        // verificaciones


    }
    @AfterEach
    public void after(){
        Sesion.getInstance().closeSesion();
    }

}
