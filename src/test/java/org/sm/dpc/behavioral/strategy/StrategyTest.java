package org.sm.dpc.behavioral.strategy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "org.sm.dpc.behavioral.strategy.steps",
        features = "classpath:cucumber/strategy.feature"
)
public class StrategyTest {
	
}
