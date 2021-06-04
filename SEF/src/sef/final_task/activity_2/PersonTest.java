package sef.final_task.activity_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sef.final_task.activity_1.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PersonTest {

	Person person = new Person();

	@Before
	public void setUp() throws Exception {
		person.setFirstName("John");
		person.setLastName("Krause");
		person.setAge(25);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testFirstName() {
		assertEquals("John", person.getFirstName());
	}

	@Test
	public void testLastName() {
		assertEquals("Krause", person.getLastName());
	}

	@Test
	public void testAge() {
		assertEquals(25, person.getAge());
	}

	@Test
	public void introductionTest() {
		assertEquals("My name is John Krause and I am 25 years old.", person.introduce());
	}
}
