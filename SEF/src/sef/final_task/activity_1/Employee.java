package sef.final_task.activity_1;

import sef.final_task.activity_2.CustomException;
import sef.final_task.bonus_activity.Humanity;

public class Employee extends Person implements Humanity {

	private double salary;
	private String jobTitle;
	private String companyName;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int age, double salary, String jobTitle, String companyName) throws CustomException {
		super(firstName, lastName, age);
		this.salary = salary;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String introduce() {
		return  super.introduce() + " I work as " + this.jobTitle + " in " + this.companyName + ".";
	}
}
