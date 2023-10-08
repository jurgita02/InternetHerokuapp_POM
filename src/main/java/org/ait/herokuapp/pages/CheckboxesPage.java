package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    WebElement checkbox1;

    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    WebElement checkbox2;

    public CheckboxesPage selectCheckboxes(String[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].equals("checkbox 1")){
                if (!checkbox1.isSelected()) {
                    click(checkbox1);
                }
            }
            pause(500);
            if (boxes[i].equals("checkbox 2")){
                if (!checkbox2.isSelected()) {
                    click(checkbox2);
                }
            }
        }
        return this;
    }

}
