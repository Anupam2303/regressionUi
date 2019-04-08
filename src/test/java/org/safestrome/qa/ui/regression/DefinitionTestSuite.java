package org.safestrome.qa.ui.regression;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/",
                    tags = "@LookUpPear")
public class DefinitionTestSuite {}
