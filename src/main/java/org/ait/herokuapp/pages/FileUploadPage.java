package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;

    public FileUploadPage uploadFile(String photoPath) {
        fileUpload.sendKeys(photoPath);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement upload;

    public FileUploadPage submit() {
        click(upload);
        return this;
    }
}
