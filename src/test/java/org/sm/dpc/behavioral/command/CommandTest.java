package org.sm.dpc.behavioral.command;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "classpath:cucumber/behavioral/command.feature"
)
public class CommandTest {
}


