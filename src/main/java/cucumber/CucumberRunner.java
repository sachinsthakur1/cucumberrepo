package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //Run the Cucumber Runner as a part of cucumber class
@CucumberOptions(
		format ={"pretty","json:target/"},//I want to generate a json report in target directory of pretty style (provide us with some reporting mechanism - )
		features = {"src/cucumber"}//Where are the feature files
		)//Other options for cucumber
public class CucumberRunner {

}
