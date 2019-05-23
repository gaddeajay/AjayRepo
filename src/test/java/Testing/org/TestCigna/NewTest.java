package Testing.org.TestCigna;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TestMethod() {
	  System.out.println("In Calss  NewTest Method TestMethod");
	  try
	  {
		  
		  //System.out.println("TestName Parameter From Jenkins = "+ System.getenv("TestName"));
		  System.out.println("In Test Method");
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
