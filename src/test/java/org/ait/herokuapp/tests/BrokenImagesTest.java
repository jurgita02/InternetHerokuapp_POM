package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.BrokenImagePage;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest  extends TestBase{
   //click on  Broken Images
   @BeforeMethod
   public void precondition(){
       new HomePage(driver).getBrokenImages();
   }

    @Test
    public void checkBrokenImages(){
        new BrokenImagePage(driver).selectBrokenImages();


    }
}
