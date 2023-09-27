package org.ait.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagePage extends BasePage {
    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }
  //  @FindBy(tagName="h3")
 //   WebElement brokenLinksImages;

  //  public BrokenImagePage selectBrokenImages() {
   //     click(brokenLinksImages);
 //       return this;
  //  }
//}
  @FindBy(tagName="img")
  List<WebElement> brokenLinksImages;
    public BrokenImagePage selectBrokenImages() {
        System.out.println("Total number of images on the page "+ brokenLinksImages.size());
        for (int i = 0;i< brokenLinksImages.size();i++) {
            WebElement image = brokenLinksImages.get(i);
            String imageUrl = image.getAttribute("src");
            System.out.println("URL of image " + (i + 1) + " is " + imageUrl);
            verifyLinks(imageUrl);

            try {

                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("****************");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("******************");
                }
            } catch (Exception ex) {
                System.out.println("ERROR OCCURRED");
            }
        }
        return this;
    }
}