package sef.final_task.activity_1;

import sef.final_task.activity_2.CustomException;
import sef.final_task.bonus_activity.Humanity;

public class Person implements Humanity {

	//Attributes
	private String firstName;
	private	String lastName;
	private int age;

	public Person() {

	}

	public Person(String firstName, String lastName, int age) throws CustomException {
		if (!firstName.matches(".*\\d.*") && !lastName.matches(".*\\d.*")) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		else {
			throw new CustomException();
		}
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setFirstName(String firstName) throws CustomException {
		if (!firstName.matches(".*\\d.*")) {
			this.firstName = firstName;
		}
		else {
			throw new CustomException();
		}
	}

	public void setLastName(String lastName) throws CustomException {
		if (!lastName.matches(".*\\d.*")) {
			this.lastName = lastName;
		}
		else {
			throw new CustomException();
		}
	}

	public int getAge() {
		return this.age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String introduce() {
		return "My name is " + this.firstName + " " + this.lastName + " and I am " + this.age + " years old.";
	}

}

