package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.FramesPage;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.NestedFramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFrames();
    }

    @Test
    public void iframesTest(){
        new FramesPage(driver).selectFrames()
                .returnListOfrFrames().switchToIframeByIndex(0);
    }

    @Test
    public void switchToIframeByIDTest(){
        new FramesPage(driver).selectFrames();
        new FramesPage(driver).switchToIframeByID();
    }
@Test
public void handleNestedIframeTest(){
    new FramesPage(driver).selectNestedFrames();
    new NestedFramesPage(driver).handleNestedIframes();
}

}
