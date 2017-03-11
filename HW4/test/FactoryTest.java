/* Version History  :
 TestClass  : FactoryTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to test whether the Factory pattern returns a valid object upon call 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to test whether the Factory pattern returns    
                           Janani, Karthick						  a valid object upon call
 --===========================================================================================================================

 --============================================================================================================================*/


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Player.Factory;
import Strategy.StrategyInterface;

public class FactoryTest {
    
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of creatStrategy method, of class Factory.
     */
    @Test
    public void testCreatStrategy() {
        System.out.println("creatStrategy");
        String type = "";
        StrategyInterface expResult = null;
        StrategyInterface result = Factory.creatStrategy(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
