/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomkoukoulis.ranking.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomkoukoulis
 */
public class JournalTest {
    
    public JournalTest() {
    }

    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToHigherScore() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 5.6f, 2015);
        Journal journalB = new Journal("Journal B", 3.1f, 2015);
        int expResult = 1;
        int result = journalB.compareTo(journalA);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToLowerScore() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal B", 3.1f, 2015);
        Journal journalB = new Journal("Journal A", 5.6f, 2015);
        int expResult = -1;
        int result = journalB.compareTo(journalA);
        assertEquals(expResult, result);
    }    
     
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToSameScoreSameName() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 3.1f, 2015);
        Journal journalB = new Journal("Journal A", 3.1f, 2015);
        int expResult = 0;
        int result = journalB.compareTo(journalA);
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToSameScoreHigherName() throws ObjectConstructionException {
        Journal journalB = new Journal("Journal B", 6.2f, 2014);
        Journal journalC = new Journal("Journal C", 6.2f, 2014);
        int expResult = 1;
        int result = journalC.compareTo(journalB);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToSameScoreLowerName() throws ObjectConstructionException {
        Journal journalC = new Journal("Journal C", 6.2f, 2014);
        Journal journalB = new Journal("Journal B", 6.2f, 2014);
        int expResult = -1;
        int result = journalB.compareTo(journalC);
        assertEquals(expResult, result);
    }
}
