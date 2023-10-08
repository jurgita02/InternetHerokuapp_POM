package org.ait.herokuapp.tests;

import org.ait.herokuapp.pages.FileUploadPage;
import org.ait.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUpload();
    }

    @Test
    public void fileUploadTest (){
        String photoPath= "C:/Tools/20190705_020107.jpg";
        new FileUploadPage(driver).uploadFile(photoPath)
                .submit();
    }
}
