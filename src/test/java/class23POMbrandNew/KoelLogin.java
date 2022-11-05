package class23POMbrandNew;

import class23POMbrandNew.pages.LoginPageSimple;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {

    @Test
    public void login(){
        LoginPageSimple loginPage = new LoginPageSimple();

        loginPage.fillEmail();
        loginPage.fillPass();
        loginPage.clickSubmit();

        Assert.assertTrue(loginPage.isAvatarDisplaying());

    }
}
