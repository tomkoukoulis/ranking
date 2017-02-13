/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomkoukoulis.ranking.model;

/**
 *
 * @author tomkoukoulis
 */
public class Journal implements Comparable<Journal> {
    protected String name;
    protected float score;
    protected int year;
    protected int rank;
    protected boolean isReviewJournal;

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }

    public int getYear() {
        return year;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public boolean isReviewJournal() {
        return isReviewJournal;
    }
    
    public void setReviewJournal(boolean isReviewJournal) {
        this.isReviewJournal = isReviewJournal;
    }
    
    public Journal(String name, float score, int year) throws ObjectConstructionException {
        if (score < 0) throw new ObjectConstructionException("Score is lower than zero");
        this.name = name;
        this.score = score;
        this.year = year;     
    }

    public int compareTo(Journal journal) {   
        int descendingOrder = Float.compare(journal.score, this.score);
        //int ascendingOrder = Float.compare(this.score, journal.score);
        int compare = descendingOrder;
        
        if (compare == 0) {
            compare = name.compareTo(journal.name);
        }

        return compare;
    }
}
