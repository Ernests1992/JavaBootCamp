package sef.module8.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test()
	{
		//1 - Type assert 5 % 2 and 6 %2  in separate statements
		
		assert 5 % 2 == 3;
		assert 6 % 2 == 1;

	}
	public static void main(String args[]){
		AssertSample.test();
	}
}
