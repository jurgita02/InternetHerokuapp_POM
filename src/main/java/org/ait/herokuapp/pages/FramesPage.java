package org.ait.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//a[.='iFrame']")
    WebElement iFrame;

    public FramesPage selectFrames() {
        click(iFrame);
        return this;
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public FramesPage returnListOfrFrames() {
        //1. using iframe tag / alternative of 2 choice
        System.out.println("The total numbers of iframes: " + iframes.size());
        //2. using javascript / alternative of 1 choice
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIframes = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("The total numbers of iframes: " + numberOfIframes);
        return this;
    }

    @FindBy(id = "tinymce")
    WebElement tinymce;

    public FramesPage switchToIframeByIndex(int index) {
        //switch to iframe by index
        driver.switchTo().frame(index);
        System.out.println("Text of the iframe: " + tinymce.getText());
        return this;
    }

    @FindBy(id = "mce_0_ifr")
    WebElement mce_0_ifr;
    @FindBy(xpath = "//h3[contains(text(), 'An iFrame containing the TinyMCE WYSIWYG Editor')]")
    WebElement iFrameElement;


    public FramesPage switchToIframeByID() {
        //switch to iframe by id
        driver.switchTo().frame(mce_0_ifr);
        System.out.println("Text of the iframe: " + tinymce.getText());
        driver.switchTo().defaultContent();
        System.out.println("Text of the iframe: " + iFrameElement.getText());
        return this;
    }

    @FindBy(xpath = "//a[.='Nested Frames']")
    WebElement nestedFrames;

    public NestedFramesPage selectNestedFrames() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }
}
