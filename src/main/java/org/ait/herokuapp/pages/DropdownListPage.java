package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListPage extends BasePage {

    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;
    public DropdownListPage selectDropdownList(String option) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
        System.out.println(select.getFirstSelectedOption().getText() + " is first");
        System.out.println("**********************************************************");
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

        return this;
    }
}
