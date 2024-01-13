package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Exam\\eclipse-workspace\\SeleniumWorkspace\\CucumberPracticeProject\\src\\test\\java\\features\\login.feature", glue = {
		"steps" }, plugin = { "html:target/Cucumberreport_Login.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" })



public class TestRunnerLogin {

}