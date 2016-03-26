package org.sm.dpc.creational.builder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/creational/builder.feature"
)
public class BuilderTest {
	
}
