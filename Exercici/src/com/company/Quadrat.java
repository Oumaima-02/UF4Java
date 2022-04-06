package com.company;

public class Quadrat {
    private int costat;
    public int getCostat(){
        return costat;
    }
    public void setCostat(int costat){
        this.costat=costat;
    }
    public Quadrat( int costat){
        this.setCostat(costat);
    }
}