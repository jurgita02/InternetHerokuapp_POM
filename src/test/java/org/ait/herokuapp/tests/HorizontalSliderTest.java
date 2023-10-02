package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHorizontalSlider();
    }
@Test
    public void sliderTest(){
        new HorizontalSliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderRange("5");
}

}
