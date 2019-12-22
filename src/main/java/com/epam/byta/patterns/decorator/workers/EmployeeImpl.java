package com.epam.byta.patterns.decorator.workers;

public class EmployeeImpl implements Employee {

	private String name = null;	
	
	public EmployeeImpl(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void join(String joinDate) {
		System.out.println(this.getName() + " joined on " + joinDate);
	}

	public void terminate(String terminateDate) {
		System.out.println(this.getName() + " terminate on " + terminateDate);
	}
}
