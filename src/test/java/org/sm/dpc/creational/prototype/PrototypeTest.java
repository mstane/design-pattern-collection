package org.sm.dpc.creational.prototype;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "classpath:cucumber/creational/prototype.feature"
)
public class PrototypeTest {
}
