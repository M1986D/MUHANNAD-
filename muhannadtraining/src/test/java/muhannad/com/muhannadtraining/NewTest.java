package muhannad.com.muhannadtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is teatannotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	   System.out.println("this is befoer1 test annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after1 test annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is befor2 test annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after2 test annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is befor3 test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after3 test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is befor4 test annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after4 test annotation");
  }
  @Test

  public void testseconmd() {
	  System.out.println("this is second test annotaion");
  }
@Test

public void testthird() {
	 System.out.println("this is third test annotaion");
	 
	 
	
}
}
