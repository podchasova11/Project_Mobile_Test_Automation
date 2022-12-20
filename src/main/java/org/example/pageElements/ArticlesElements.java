package org.example.pageElements;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.abstractClasses.AbstractPageObject;

public class ArticlesElements extends AbstractPageObject {


    @AndroidFindBy(xpath = "//")
    private MobileElement exit;

    @AndroidFindBy(accessibility = "Articles\n" + "Tab 2 of 4")
    private MobileElement articles;

    @AndroidFindBy(xpath = "")
    private MobileElement shibaInuPrice;

    @AndroidFindBy
}
