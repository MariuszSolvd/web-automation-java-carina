package com.solvd.pages.common.admin;

import com.solvd.pages.desktop.admin.AbstractAdminPage;
import org.openqa.selenium.WebDriver;

public abstract class AdminPageBase extends AbstractAdminPage {

    public AdminPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickJobButton();

    public abstract void clickJobTitleButton();

    public abstract JobListPageBase getJobListPage();
}
