package com.generic.aidrivenresumescreening;

public class DataScientist extends JobRole {
	public DataScientist(String name) {
		super(name);
	}
	
	@Override
	public void evaluate() {
		System.out.println(getCandidateName() + " evaluated for Data Scientist (ML + Statistics)");
	}

}
