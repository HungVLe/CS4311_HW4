/* Version History  :
 TestClass  : DoyuPlayerTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to test the effect and modifier cards features 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to test the the effect and modifier cards  
                           Janani, Karthick						  features
 --===========================================================================================================================

 --============================================================================================================================*/


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Card.DoyuCard;


public class DoyuCardTest {
    
    public DoyuCardTest() {
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
     * Test of setPlayerdeck method, of class DoyuCard.
     */
    @Test
    public void testSetPlayerdeck() {
        System.out.println("setPlayerdeck");
        String[][] playerdeck = null;
        DoyuCard instance = new DoyuCard();
        instance.setPlayerdeck(playerdeck);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpudeck method, of class DoyuCard.
     */
    @Test
    public void testGetCpudeck() {
        System.out.println("getCpudeck");
        DoyuCard instance = new DoyuCard();
        String[][] expResult = new String[30][2];
        String[][] result = instance.getCpudeck();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpudeck method, of class DoyuCard.
     */
    @Test
    public void testSetCpudeck() {
        System.out.println("setCpudeck");
        String[][] cpudeck = null;
        DoyuCard instance = new DoyuCard();
        instance.setCpudeck(cpudeck);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedchoice method, of class DoyuCard.
     */
    @Test
    public void testGetSelectedchoice() {
        System.out.println("getSelectedchoice");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getSelectedchoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCPUselectedchoice method, of class DoyuCard.
     */
    @Test
    public void testGetCPUselectedchoice() {
        System.out.println("getCPUselectedchoice");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCPUselectedchoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerhealth method, of class DoyuCard.
     */
    @Test
    public void testGetPlayerhealth() {
        System.out.println("getPlayerhealth");
        DoyuCard instance = new DoyuCard();
        int expResult = 100;
        int result = instance.getPlayerhealth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpuhealth method, of class DoyuCard.
     */
    @Test
    public void testGetCpuhealth() {
        System.out.println("getCpuhealth");
        DoyuCard instance = new DoyuCard();
        int expResult = 100;
        int result = instance.getCpuhealth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_attack_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_attack_pt() {
        System.out.println("getPlayer_attack_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_attack_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_defend_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_defend_pt() {
        System.out.println("getPlayer_defend_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_defend_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_regeneration_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_regeneration_pt() {
        System.out.println("getPlayer_regeneration_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_regeneration_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_karma_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_karma_pt() {
        System.out.println("getPlayer_karma_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_karma_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_counter_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_counter_pt() {
        System.out.println("getPlayer_counter_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_counter_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_SpecialAttack_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_SpecialAttack_pt() {
        System.out.println("getPlayer_SpecialAttack_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_SpecialAttack_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_SpecialDefend_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_SpecialDefend_pt() {
        System.out.println("getPlayer_SpecialDefend_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_SpecialDefend_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer_poison_pt method, of class DoyuCard.
     */
    @Test
    public void testGetPlayer_poison_pt() {
        System.out.println("getPlayer_poison_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getPlayer_poison_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_attack_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_attack_pt() {
        System.out.println("getCpu_attack_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_attack_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_defend_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_defend_pt() {
        System.out.println("getCpu_defend_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_defend_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_regeneration_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_regeneration_pt() {
        System.out.println("getCpu_regeneration_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_regeneration_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_karma_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_karma_pt() {
        System.out.println("getCpu_karma_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_karma_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_counter_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_counter_pt() {
        System.out.println("getCpu_counter_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_counter_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_SpecialAttack_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_SpecialAttack_pt() {
        System.out.println("getCpu_SpecialAttack_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_SpecialAttack_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_SpecialDefend_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_SpecialDefend_pt() {
        System.out.println("getCpu_SpecialDefend_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_SpecialDefend_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpu_poison_pt method, of class DoyuCard.
     */
    @Test
    public void testGetCpu_poison_pt() {
        System.out.println("getCpu_poison_pt");
        DoyuCard instance = new DoyuCard();
        int expResult = 0;
        int result = instance.getCpu_poison_pt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedchoice method, of class DoyuCard.
     */
    @Test
    public void testSetSelectedchoice() {
        System.out.println("setSelectedchoice");
        int selectedchoice = 0;
        DoyuCard instance = new DoyuCard();
        instance.setSelectedchoice(selectedchoice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCPUselectedchoice method, of class DoyuCard.
     */
    @Test
    public void testSetCPUselectedchoice() {
        System.out.println("setCPUselectedchoice");
        int cPUselectedchoice = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCPUselectedchoice(cPUselectedchoice);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerhealth method, of class DoyuCard.
     */
    @Test
    public void testSetPlayerhealth() {
        System.out.println("setPlayerhealth");
        int playerhealth = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayerhealth(playerhealth);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpuhealth method, of class DoyuCard.
     */
    @Test
    public void testSetCpuhealth() {
        System.out.println("setCpuhealth");
        int cpuhealth = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpuhealth(cpuhealth);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_attack_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_attack_pt() {
        System.out.println("setPlayer_attack_pt");
        int player_attack_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_attack_pt(player_attack_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_defend_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_defend_pt() {
        System.out.println("setPlayer_defend_pt");
        int player_defend_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_defend_pt(player_defend_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_regeneration_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_regeneration_pt() {
        System.out.println("setPlayer_regeneration_pt");
        int player_regeneration_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_regeneration_pt(player_regeneration_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_karma_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_karma_pt() {
        System.out.println("setPlayer_karma_pt");
        int player_karma_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_karma_pt(player_karma_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_counter_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_counter_pt() {
        System.out.println("setPlayer_counter_pt");
        int player_counter_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_counter_pt(player_counter_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_SpecialAttack_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_SpecialAttack_pt() {
        System.out.println("setPlayer_SpecialAttack_pt");
        int player_SpecialAttack_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_SpecialAttack_pt(player_SpecialAttack_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_SpecialDefend_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_SpecialDefend_pt() {
        System.out.println("setPlayer_SpecialDefend_pt");
        int player_SpecialDefend_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_SpecialDefend_pt(player_SpecialDefend_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer_poison_pt method, of class DoyuCard.
     */
    @Test
    public void testSetPlayer_poison_pt() {
        System.out.println("setPlayer_poison_pt");
        int player_poison_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setPlayer_poison_pt(player_poison_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_attack_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_attack_pt() {
        System.out.println("setCpu_attack_pt");
        int cpu_attack_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_attack_pt(cpu_attack_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_defend_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_defend_pt() {
        System.out.println("setCpu_defend_pt");
        int cpu_defend_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_defend_pt(cpu_defend_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_regeneration_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_regeneration_pt() {
        System.out.println("setCpu_regeneration_pt");
        int cpu_regeneration_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_regeneration_pt(cpu_regeneration_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_karma_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_karma_pt() {
        System.out.println("setCpu_karma_pt");
        int cpu_karma_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_karma_pt(cpu_karma_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_counter_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_counter_pt() {
        System.out.println("setCpu_counter_pt");
        int cpu_counter_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_counter_pt(cpu_counter_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_SpecialAttack_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_SpecialAttack_pt() {
        System.out.println("setCpu_SpecialAttack_pt");
        int cpu_SpecialAttack_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_SpecialAttack_pt(cpu_SpecialAttack_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_SpecialDefend_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_SpecialDefend_pt() {
        System.out.println("setCpu_SpecialDefend_pt");
        int cpu_SpecialDefend_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_SpecialDefend_pt(cpu_SpecialDefend_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpu_poison_pt method, of class DoyuCard.
     */
    @Test
    public void testSetCpu_poison_pt() {
        System.out.println("setCpu_poison_pt");
        int cpu_poison_pt = 0;
        DoyuCard instance = new DoyuCard();
        instance.setCpu_poison_pt(cpu_poison_pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
