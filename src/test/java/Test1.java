import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.PasswordSteps;

@Epic("Первая группа")
public class Test1 {

    PasswordSteps step = new PasswordSteps();

    String password;

    @BeforeTest
    public void beforeTest() {
        System.out.println("Генерируем пароль...");
        password = Main.generateRandomPassword(10);
    }

    @Test(description = "Первый тест")
    @Description("Проверка валидности пароля")
    public void testDesc() {
        step.lengthTest(password);
        step.digitTest(password);
        step.specTest(password);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Делаем что-то после тестов");
    }

}
