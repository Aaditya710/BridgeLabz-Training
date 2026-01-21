package com.generic.aidrivenresumescreening;
import java.util.*;

public class ResumeScreeningSystem {
	public static void main(String [] args) {
		Resume <SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer("Aaditya"));
		Resume <DataScientist> r2 = new Resume<>(new DataScientist("Aviral"));
		Resume <ProductManager> r3 = new Resume<>(new ProductManager("Ayush"));
		
		ResumeEvaluator.screenResume(r1);
		ResumeEvaluator.screenResume(r2);
		ResumeEvaluator.screenResume(r3);
		
		System.out.println("\n AI Screening pipeline-");
		
		List<JobRole> allCandidates = Arrays.asList(
				new SoftwareEngineer("Aaditya"),
				new DataScientist("Aviral"),
			
				new ProductManager("Ayush")
		);
		ScreeningPipeline.processAll(allCandidates);
		
	}

}
