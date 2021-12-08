package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	
	
  @Test
  public void testcase1() {
	  
	  System.out.println("Testcase1");
	  
  }
  
  @Test
  public void testcase2() {
	  
	  System.out.println("Inside Testcase2");
	  
  }
  
  @Test
  public void testcase3() {
	  
	  System.out.println("Inside Testcase3");
	  
  }
  
  @Test
  public void testcase4() {
	  
	  System.out.println("Inside Testcase4");
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	System.out.println("Before Test");  
	  
  }

  @AfterTest
  public void afterTest() 
  
  {
	  System.out.println("After Test");  
  }

}
