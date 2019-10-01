/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dhruv
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of Bet method, of class Game.
     */
    @Test
    public void testBetGood() {
        System.out.println("BetGood");
        int cash = 15;
        boolean expResult = true;
        int result = Game.Bet(cash);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBetBad() {
        System.out.println("BetBad");
        int cash = 20;
        boolean expResult = false;
        int result = Game.Bet(cash);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBetBoundary() {
        System.out.println("BetBoundary");
        int cash = 15;
        boolean expResult = true;
        int result = Game.Bet(cash);
        assertEquals(expResult, result);
    }

    /**
     * Test of isHitorStand method, of class Game.
     */
    @Test
    public void testIsHitorStand() {
        System.out.println("isHitorStand");
        String hitter = "stand";
        boolean expResult = true;
        boolean result = Game.isHitorStand(hitter);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsHitorStandBad() {
        System.out.println("isHitorStandBad");
        String hitter = "HIT";
        boolean expResult = false;
        boolean result = Game.isHitorStand(hitter);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testIsHitorStandBoundary() {
        System.out.println("isHitorStandBoundary");
        String hitter = "hit";
        boolean expResult = true;
        boolean result = Game.isHitorStand(hitter);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkBust method, of class Game.
     */
    @Test
    public void testCheckBust() {
        System.out.println("checkBust");
        int handvalue = 11;
        boolean expResult = false;
        boolean result = Game.checkBust(handvalue);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testCheckBustBad() {
        System.out.println("checkBustBad");
        int handvalue = 22;
        boolean expResult = true;
        boolean result = Game.checkBust(handvalue);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testCheckBustBoundary() {
        System.out.println("checkBustBoundary");
        int handvalue = 20;
        boolean expResult = false;
        boolean result = Game.checkBust(handvalue);
        assertEquals(expResult, result);
    }

   
  
    /**
     * Test of hasBlackJack method, of class Game.
     */
    @Test
    public void testHasBlackJack() {
        System.out.println("hasBlackJack");
        int handValue = 21;
        boolean expResult = true;
        boolean result = Game.hasBlackJack(handValue);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testHasBlackJackBad() {
        System.out.println("hasBlackJackBad");
        int handValue = 20;
        boolean expResult = false;
        boolean result = Game.hasBlackJack(handValue);
        assertEquals(expResult, result);
    }

      @Test
    public void testHasBlackJackBoundary() {
        System.out.println("hasBlackJackBoundary");
        int handValue = 21;
        boolean expResult = true;
        boolean result = Game.hasBlackJack(handValue);
        assertEquals(expResult, result);
    }


    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }

        public void play() {
        }

        public void declareWinner() {
        }
    }
    
}
