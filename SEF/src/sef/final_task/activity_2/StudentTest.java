package sef.final_task.activity_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sef.final_task.activity_1.Student;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    Student student = new Student();

    @Before
    public void setUp() throws Exception {
        student.setFirstName("Juris");
        student.setLastName("Tomsons");
        //student.set
        student.setAge(20);
        student.setSchoolName("RTU");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFirstName() {
        assertEquals("Juris", student.getFirstName());
    }

    @Test
    public void testLastName() {
        assertEquals("Tomsons", student.getLastName());
    }

    @Test
    public void testAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    public void testSchoolName() {
        assertEquals("RTU", student.getSchoolName());
    }

    @Test
    public void introductionTest() {
        assertEquals("My name is Juris Tomsons and I am 20 years old. I study in university RTU.", student.introduce());
    }

}

