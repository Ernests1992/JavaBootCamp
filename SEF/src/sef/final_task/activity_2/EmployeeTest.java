package sef.final_task.activity_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sef.final_task.activity_1.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee = new Employee();

    @Before
    public void setUp() throws Exception {
        employee.setFirstName("John");
        employee.setLastName("Krause");
        employee.setAge(25);
        employee.setSalary(1100.00);
        employee.setJobTitle("junior developer");
        employee.setCompanyName("Company A");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFirstName() {
        assertEquals("John", employee.getFirstName());
    }

    @Test
    public void testLastName() {
        assertEquals("Krause", employee.getLastName());
    }

    @Test
    public void testAge() {
        assertEquals(25, employee.getAge());
    }

    @Test
    public void testSalary() {
        assertEquals(1100.0, employee.getSalary(),0);
    }

    @Test
    public void testJobTitle() {
        assertEquals("junior developer", employee.getJobTitle());
    }

    @Test
    public void testCompanyName() {
        assertEquals("Company A", employee.getCompanyName());
    }

    @Test
    public void introductionTest() {
        assertEquals("My name is John Krause and I am 25 years old. I work as junior developer in Company A.", employee.introduce());
    }

}

