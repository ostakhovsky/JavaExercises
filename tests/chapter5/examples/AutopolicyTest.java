package chapter5.examples;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class AutopolicyTest {

  @Test
  public void testIsNoFaultState() throws Exception {
    Autopolicy policy1 = new Autopolicy(111111, "ToyotaCamry", "NJ");
    Autopolicy policy2 = new Autopolicy(222222, "FordFusion", "ME");
    assertTrue(policy1.isNoFaultState() == true);
    assertTrue(policy2.isNoFaultState() == false);
  }
}