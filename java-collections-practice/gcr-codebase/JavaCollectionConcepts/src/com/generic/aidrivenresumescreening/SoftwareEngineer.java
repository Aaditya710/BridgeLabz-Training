package com.generic.aidrivenresumescreening;

public class SoftwareEngineer extends JobRole {
	public SoftwareEngineer(String name) {
		super(name);
	}
	
	@Override
	public void evaluate() {
		System.out.println(getCandidateName() + " evaluate for Software Engineer (DSA + System Design)");
	}

}
