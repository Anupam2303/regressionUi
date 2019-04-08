package org.safestrome.qa.ui.regression.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.safestrome.qa.ui.regression.pages.ChromeExtensionPage;

public class teststep {

    ChromeExtensionPage chromeExtensionPage;

    @Given("^open uri for extension$")
    public void openUriForExtension() {
        chromeExtensionPage.open();
    }

    @When("^get text of it$")
    public void getTextOfIt() {
        System.out.println(chromeExtensionPage.textScreenCapture());
    }

}
