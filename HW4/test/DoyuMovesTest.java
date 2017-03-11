/* Version History  :
 TestClass  : DoyuMovesTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to validate the generation of cpu and player decks
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to validate the generation of cpu and  
                           Janani, Karthick						  player decks 
 --===========================================================================================================================

 --============================================================================================================================*/


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Card.Card;
import Card.DoyuCard;
import Move.DoyuMoves;

public class DoyuMovesTest {
    
    public DoyuMovesTest() {
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
     * Test of generateCPUDeck method, of class DoyuMoves.
     */
    @Test
    public void testGenerateCPUDeck() {
        System.out.println("generateCPUDeck");
        Card dc = new DoyuCard();
        DoyuMoves instance = new DoyuMoves();
        instance.generateCPUDeck(dc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generatePlayerDeck method, of class DoyuMoves.
     */
    @Test
    public void testGeneratePlayerDeck() {
        System.out.println("generatePlayerDeck");
        Card dc = new DoyuCard();
        DoyuMoves instance = new DoyuMoves();
        instance.generatePlayerDeck(dc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
