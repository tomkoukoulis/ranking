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
    
    public Journal(String name, float score, int year) {
        this.name = name;
        this.score = score;
        this.year = year;     
    }

    public int compareTo(Journal journal) {   
        int compare = Float.compare(this.score, journal.score);
        
        if (compare == 0) {
            compare = name.compareTo(journal.name);
        }

        return compare;
    }
}
