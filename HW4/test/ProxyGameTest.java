/* Version History  :
 TestClass  : ThrowMovesTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to test Card animation's player and cpu deck generation functions 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Test to check proxy pattern  by passing values
                           Karthick, Janani
 --===========================================================================================================================

 --============================================================================================================================*/


import Game.Game;
import Game.ProxyGame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProxyGameTest {
    
    public ProxyGameTest() {
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
     * Test of option method, of class ProxyGame.
     */
    @Test
    public void testOption() {
        System.out.println("option");
        ProxyGame instance = new ProxyGame(new Game() {

            @Override
            public int option() {
                return 0;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        int expResult = 0;
        
        int result = instance.option();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
