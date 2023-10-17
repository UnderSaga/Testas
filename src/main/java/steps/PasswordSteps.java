package steps;

import io.qameta.allure.Step;

import static org.testng.Assert.assertTrue;

public class PasswordSteps {
    @Step("Проверка длинны пароля...")
    public void lengthTest(String password) {
        assertTrue(password.length() > 8);
    }

    @Step("Проверка на наличие чисел в пароле...")
    public void digitTest(String password) {
        assertTrue(password.chars().anyMatch(Character::isDigit));
    }

    @Step("Проверка на наличие специальных симолов в пароле...")
    public void specTest(String password) {
        assertTrue(password.matches(".*[!@#$%^&*()\\-+=<>?].*"));
    }
}
