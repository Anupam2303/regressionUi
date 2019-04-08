package org.safestrome.qa.ui.regression.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("chrome-extension://ifhcldeokoccialpalbicfbdfbokdaao/index.html")
public class ChromeExtensionPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div[1]")
    private WebElementFacade screenCapture;

    public String textScreenCapture(){
        return  screenCapture.getText();
    }

}
