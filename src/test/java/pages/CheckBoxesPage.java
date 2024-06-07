package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage {

    WebDriver driver;
    List<WebElement> checkBoxes;
    WebElement checkbox1;
    WebElement getCheckbox2;

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCheckBoxes() {
        return driver.findElements(By.cssSelector("input[type='checkbox']"));
    }

    public WebElement getCheckbox1() {
        return getCheckBoxes().get(0);
    }

    public WebElement getCheckbox2() {
        return getCheckBoxes().get(1);
    }
}
