package org.sm.dpc.behavioral.visitor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/behavioral/visitor.feature"
)
public class VisitorTest {
}
