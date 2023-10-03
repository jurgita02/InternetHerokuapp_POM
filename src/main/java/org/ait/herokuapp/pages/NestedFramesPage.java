package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "frame")
    List<WebElement> frames;
   @FindBy(css ="frame:nth-child(1)")
   WebElement frameTop;
    @FindBy(css ="frame:nth-child(2)")
    WebElement frameBottom;
    public NestedFramesPage handleNestedIframes() {
        //return number of frames from main page
        System.out.println("The total numbers of FRAMES in the main page: " + frames.size());
        //switch to frameTop
        driver.switchTo().frame(frameTop);
        System.out.println("The total numbers of Iframes in the Top frame: " + frames.size());
        //switch to frameBottom
        driver.switchTo().frame(frameBottom);
        System.out.println("The total numbers of Iframes in the Bottom frame: " + frames.size());

        driver.switchTo().defaultContent();

        return this;
    }
}
