package com.solvd.service;

import com.solvd.pages.common.LoginPageBase;
import com.solvd.pages.common.PageWithLeftMenuBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public class LoginService implements ICustomTypePageFactory {


    public PageWithLeftMenuBase successfulLogin() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.open();
        loginPage.logIn(R.TESTDATA.get("correct_user"), R.TESTDATA.get("correct_password"));

        return initPage(getDriver(), PageWithLeftMenuBase.class);
    }
}
