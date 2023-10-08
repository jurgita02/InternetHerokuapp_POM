package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.DropdownListPage;
import org.ait.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownListTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownList();
    }

    @Test
    public void dropDownListTest(){
        new DropdownListPage(driver).selectDropdownList ("Option 1");
    }
}
