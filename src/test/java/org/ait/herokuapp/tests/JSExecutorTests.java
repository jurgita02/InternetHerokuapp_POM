package org.ait.herokuapp.tests;

import org.ait.herokuapp.data.UserData;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.JSExecutor;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase{

    @Test
    public void jsExecutorTest(){
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver)
                .enterDataWithJSE(UserData.USER_NAME,UserData.USER_PASSWORD)
        .clickOnLoginButtonWithJSE()
                .checkUrlWithJSE();
    }
}
