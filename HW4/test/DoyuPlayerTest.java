/* Version History  :
 TestClass  : DoyuPlayerTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to test the return values of player and cpu turn functions 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to test the return values of player and  
                           Janani, Karthick						  cpu turn functions.
 -- 2.0    10-Mar-2017     Hung Lee, Heli,                     1. Modified test cases to test the return values of player and  
                           Janani, Karthick			  cpu turn functions along with campaign checka
                               
 --===========================================================================================================================

 --============================================================================================================================*/



import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Card.DoyuCard;
import Player.DoyuPlayer;

public class DoyuPlayerTest {
    
    public DoyuPlayerTest() {
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
     * Test of playerTurn method, of class DoyuPlayer.
     */
    @Test
    public void testPlayerTurn() {
        System.out.println("playerTurn");
        DoyuCard dc = new DoyuCard();
        ByteArrayInputStream choice=new ByteArrayInputStream("1".getBytes());
        System.setIn(choice);
        int i = 3;
        int hand = 5;
        DoyuPlayer instance = new DoyuPlayer(1);
        int expResult = 0;
        int result = instance.playerTurn(dc, i, hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cpuTurn method, of class DoyuPlayer.
     */
    @Test
    public void testCpuTurn() {
        System.out.println("cpuTurn");
        DoyuCard dc = new DoyuCard();
        ByteArrayInputStream choice=new ByteArrayInputStream("1".getBytes());
        System.setIn(choice);
        int i = 3;
        DoyuPlayer instance = new DoyuPlayer(1);
        int expResult = 0;
        int result = instance.cpuTurn(dc, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
