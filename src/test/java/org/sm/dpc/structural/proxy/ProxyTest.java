package org.sm.dpc.structural.proxy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "org.sm.dpc.structural.proxy.steps",
        features = "classpath:cucumber/structural/proxy.feature"
)
public class ProxyTest {
	
}
