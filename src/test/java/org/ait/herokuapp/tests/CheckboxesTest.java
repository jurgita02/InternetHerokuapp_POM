package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.CheckboxesPage;
import org.ait.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getCheckboxes();
    }

    @Test
    public void checkboxesTest(){
        String[] checkboxes = {"checkbox 1", "checkbox 2"};
        new CheckboxesPage(driver).selectCheckboxes(checkboxes);
    }
}
