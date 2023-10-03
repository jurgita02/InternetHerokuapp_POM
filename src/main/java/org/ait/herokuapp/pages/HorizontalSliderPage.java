package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static org.openqa.selenium.devtools.v85.debugger.Debugger.pause;


public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@type='range']")
    WebElement slider;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        pause(500);
        new Actions(driver).dragAndDropBy(slider,64,0).perform();
        return this;
    }


    @FindBy(id="range")
    WebElement range;
    public HorizontalSliderPage assertSliderRange(String expectedNumber) {
       // Assert.assertEquals(getValueAttribute(range, "range"),String.valueOf(number));
        String actualNumber = range.getAttribute("innerText");
        Assert.assertEquals(actualNumber, expectedNumber);
        return this;
    }

    public String getValueAttribute(WebElement element, String name) {
return element.getAttribute(name);


    }
}
