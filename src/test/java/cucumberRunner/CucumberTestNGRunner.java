package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features",glue="cucumberPackage")
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests{

}
