import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class GithubEnterprisePageTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void githubEnterprisePageTest() {
        Selenide.open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("The AI-powered")).shouldBe(visible);
    }
}
