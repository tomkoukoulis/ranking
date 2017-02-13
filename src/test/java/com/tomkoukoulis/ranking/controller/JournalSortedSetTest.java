/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomkoukoulis.ranking.controller;

import com.tomkoukoulis.ranking.model.Journal;
import com.tomkoukoulis.ranking.model.ObjectConstructionException;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomkoukoulis
 */
public class JournalSortedSetTest {
    
    public JournalSortedSetTest() {
    }

    /**
     * Test of add method, of class JournalSortedSet.
     */
    @Test
    public void testAdd() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 2.2f, 2014);
        Journal journalB = new Journal("Journal B", 6.2f, 2014);
        Journal journalC = new Journal("Journal C", 6.2f, 2014);
        JournalSortedSet instance = new JournalSortedSet();
        instance.add(journalA);
        instance.add(journalB);
        instance.add(journalC);

        Iterator journalIterator = instance.iterator();

    }

    /**
     * Test of iterator method, of class JournalSortedSet.
     */
    @Test
    public void testRankJournals() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 5.6f, 2015);
        Journal journalB = new Journal("Journal B", 2.4f, 2015);
        Journal journalC = new Journal("Journal C", 3.1f, 2015);
        JournalSortedSet instance = new JournalSortedSet();
        instance.add(journalA);
        instance.add(journalB);
        instance.add(journalC);

        Iterator journalIterator = instance.iterator();
        
        Journal expectedJournalA = (Journal) journalIterator.next();
        assertEquals(expectedJournalA.getRank(), 1);
        assertEquals(expectedJournalA, journalA);
        
        Journal expectedJournalC = (Journal) journalIterator.next();
        assertEquals(expectedJournalC.getRank(), 2);
        assertEquals(expectedJournalC, journalC);
        
        Journal expectedJournalB = (Journal) journalIterator.next();
        assertEquals(expectedJournalB.getRank(), 3);
        assertEquals(expectedJournalB, journalB);
    }
    
    /**
     * Test of iterator method, of class JournalSortedSet.
     */
    @Test
    public void testRankJournalsWithSameRank() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 2.2f, 2014);
        Journal journalB = new Journal("Journal B", 6.2f, 2014);
        Journal journalC = new Journal("Journal C", 6.2f, 2014);
        JournalSortedSet instance = new JournalSortedSet();
        instance.add(journalA);
        instance.add(journalB);
        instance.add(journalC);

        Iterator journalIterator = instance.iterator();
        
        Journal expectedJournalB = (Journal) journalIterator.next();
        assertEquals(expectedJournalB.getRank(), 1);
        assertEquals(expectedJournalB, journalB);
        
        Journal expectedJournalC = (Journal) journalIterator.next();
        assertEquals(expectedJournalC.getRank(), 1);
        assertEquals(expectedJournalC, journalC);
        
        Journal expectedJournalA = (Journal) journalIterator.next();
        assertEquals(expectedJournalA.getRank(), 2);
        assertEquals(expectedJournalA, journalA);
    }
    
    /**
     * Test of iterator method, of class JournalSortedSet.
     */
    @Test
    public void testRankJournalsBarReviewJournals() throws ObjectConstructionException {
        Journal journalA = new Journal("Journal A", 5.6f, 2013);
        journalA.setReviewJournal(true);
        Journal journalB = new Journal("Journal B", 2.4f, 2013);
        Journal journalC = new Journal("Journal C", 3.1f, 2013);
        JournalSortedSet instance = new JournalSortedSet();
        instance.add(journalA);
        instance.add(journalB);
        instance.add(journalC);

        Iterator journalIterator = instance.iterator();
        
        Journal expectedJournalC = (Journal) journalIterator.next();
        assertEquals(expectedJournalC.getRank(), 1);
        assertEquals(expectedJournalC, journalC);

        Journal expectedJournalB = (Journal) journalIterator.next();
        assertEquals(expectedJournalB.getRank(), 2);
        assertEquals(expectedJournalB, journalB);
    }
}
