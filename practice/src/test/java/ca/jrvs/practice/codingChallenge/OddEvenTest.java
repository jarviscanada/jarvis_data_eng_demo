package ca.jrvs.practice.codingChallenge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OddEvenTest {

  @BeforeClass
  public static void classSetUp() throws Exception {
    System.out.println("--@BeforeClass static method runs once before class it instantiate");
  }

  @AfterClass
  public static void classTearDown() throws Exception {
    System.out.println("--@AfterClass static method runs once");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("--@Before method runs before each @Test method");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("--@After method runs after each @Test method");
  }

  @Test
  public void oddEvenMod() {
    System.out.println("Test case: test oddEvenMod method from the test class");
  }

  @Test
  public void oddEvenBit() {
    System.out.println("Test case: test oddEvenBit method from the test class");
  }
}