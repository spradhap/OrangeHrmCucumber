package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void genertereport(String sonn) {
		
		File file = new File("C:\\Users\\pradhap\\eclipse-workspace\\OrangeHrm");
		
		Configuration con = new Configuration(file, "Orangehrm  webpage ");
	   
		con.addClassifications("user id ", "1000");
		con.addClassifications("user story", "2000");
		con.addClassifications("platform", "Eclispe - photon");
        con.addClassifications("Demo webside", "Organe Hrm");
        
        List<String> li = new LinkedList<String>();
        
        li.add(sonn);
        
        ReportBuilder report = new ReportBuilder(li, con);
        
        report.generateReports();
        
        
        
        
        
	}

}
