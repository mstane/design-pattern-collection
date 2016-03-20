package org.sm.dpc.behavioral.chainofresponsibility;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "org.sm.dpc.behavioral.chainofresponsibility.steps",
        features = "classpath:cucumber/chainOfResponsibility.feature"
)
public class ChainOfResponsibilityTest {
	
}
