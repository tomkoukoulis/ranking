/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomkoukoulis.ranking.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomkoukoulis
 */
public class JournalTest {
    
    public JournalTest() {
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
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToHigherScore() {
        System.out.println("compareTo");
        Journal journalA = new Journal("Journal A", 5.6f, 2015);
        Journal journalB = new Journal("Journal B", 3.1f, 2015);
        int expResult = -1;
        int result = journalB.compareTo(journalA);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToLowerScore() {
        System.out.println("compareTo");
        Journal journalA = new Journal("Journal B", 3.1f, 2015);
        Journal journalB = new Journal("Journal A", 5.6f, 2015);
        int expResult = 1;
        int result = journalB.compareTo(journalA);
        assertEquals(expResult, result);
    }    
     
    /**
     * Test of compareTo method, of class Journal.
     */
    @Test
    public void testCompareToSameScoreSameName() {
        System.out.println("compareTo");
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
    public void testCompareToSameScoreHigherName() {
        System.out.println("compareTo");
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
    public void testCompareToSameScoreLowerName() {
        System.out.println("compareTo");
        Journal journalC = new Journal("Journal C", 6.2f, 2014);
        Journal journalB = new Journal("Journal B", 6.2f, 2014);
        int expResult = -1;
        int result = journalB.compareTo(journalC);
        assertEquals(expResult, result);
    }
}
