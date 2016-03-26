package org.sm.dpc.behavioral.chainofresponsibility;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/behavioral/chainOfResponsibility.feature"
)
public class ChainOfResponsibilityTest {
	
}
