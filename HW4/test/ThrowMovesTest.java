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
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to test Card animation's player and cpu    
                           Janani, Karthick						  deck generation functions
 --===========================================================================================================================

 --============================================================================================================================*/


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Card.Card;
import Card.DoyuCard;
import Move.ThrowMoves;


public class ThrowMovesTest {
    
    public ThrowMovesTest() {
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
     * Test of generateCPUDeck method, of class ThrowMoves.
     */
    @Test
    public void testGenerateCPUDeck() {
        System.out.println("generateCPUDeck");
        Card tc = new DoyuCard();
        ThrowMoves instance = new ThrowMoves();
        instance.generateCPUDeck(tc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generatePlayerDeck method, of class ThrowMoves.
     */
    @Test
    public void testGeneratePlayerDeck() {
        System.out.println("generatePlayerDeck");
        Card tc = new DoyuCard();
        ThrowMoves instance = new ThrowMoves();
        instance.generatePlayerDeck(tc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
