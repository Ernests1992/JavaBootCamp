package sef.module9.activity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListActivityTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	List namesList = new ArrayList();
	ListActivity listActivity = new ListActivity();

	@Before
	public void setUp() throws Exception {

		namesList.add("John");
		namesList.add("Mike");
		namesList.add("Shanti");
		namesList.add("Stacie");
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(originalOut);
	}

	@Test
	public void testMain() {
		//fail("Not yet implemented");
		assertEquals("John", namesList.get(0));
		assertEquals("Mike", namesList.get(1));
		assertEquals("Shanti", namesList.get(2));
		assertEquals("Stacie", namesList.get(3));
	}

	@Test
	public void testPrint() {
		//fail("Not yet implemented");
		listActivity.print(namesList);
		assertEquals("John"   + (char) 0x0D + (char) 0x0A +
							 "Mike"   + (char) 0x0D + (char) 0x0A +
							 "Shanti" + (char) 0x0D + (char) 0x0A +
							 "Stacie" + (char) 0x0D + (char) 0x0A, outContent.toString());
	}

}
