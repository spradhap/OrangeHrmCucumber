package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pradhap\\eclipse-workspace\\OrangeHrm\\src\\test\\resources\\Feature",glue="org.step1"
,monochrome = true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin = {"html:target\\HTML.html","junit:target\\xmlReport.xml",
		"json:target\\Report\\jsonReport.json"})

public class OrangeHrm {
	
	@AfterClass
	public static void sample() {
		
		ReportingClass.genertereport("target\\Report\\jsonReport.json");
		

	}
	

}

