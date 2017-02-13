/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomkoukoulis.ranking.controller;

import com.tomkoukoulis.ranking.model.Journal;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author tomkoukoulis
 */
public class JournalSortedSet {
    TreeSet<Journal> journals;
            
    public JournalSortedSet() {
        journals = new TreeSet<>();
    }        

    public void add(Journal journal) {
        journals.add(journal);
    }
    
    public Iterator<Journal> iterator() {
        rank();
        
        return journals.iterator();
    }

    private void rank() {
        Iterator<Journal> journalIterator = journals.iterator();
        
        int rank = 0;
        float previousJournalScore = -1;
        
        while(journalIterator.hasNext()) {
            Journal journal = journalIterator.next();
            if (journal.isReviewJournal()) {
                journalIterator.remove();
                journal = journalIterator.next();
            }
            if ((previousJournalScore) != journal.getScore()) {
                rank++;
            }
            journal.setRank(rank);
            previousJournalScore = journal.getScore();
        }
    }
}
