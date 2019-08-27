package comm.TestDrivenDevelopment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase {

	
	@Test
	public void testAddMethod()
	{  int x=10,y=10;
		assertEquals(20,new Calculator(x,y).addMethod());
	}
	@Test
	public void testIsGreater()
	{
	    int x=1,y=6;
		System.out.println("isGreater "+new Calculator(x,y).isGreater());
		assertEquals(false,new Calculator(x,y).isGreater());
	}
	
   
	public static TestSuite creatTestSuit()
	{ 
		TestSuite testSuiteObj = new TestSuite("AllTest");
		testSuiteObj.addTest(new TestCalculator());
		testSuiteObj.addTest(new TestCase3("testNull"));
		
		
		return testSuiteObj;
		
		
	}
	public static void main(String[] args)
	{   
		TestRunner.run(TestCalculator.creatTestSuit());
//		TestRunner.runAndWait(TestCalculator.creatTestSuit());
//		TestRunner.run(TestCalculator.class);
	}
	
}
