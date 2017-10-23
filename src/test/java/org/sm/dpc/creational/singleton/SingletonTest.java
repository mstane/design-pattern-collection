package org.sm.dpc.creational.singleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        features = "classpath:cucumber/creational/singleton.feature"
)
public class SingletonTest {
}
