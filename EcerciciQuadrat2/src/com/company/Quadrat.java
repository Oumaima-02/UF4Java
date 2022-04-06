package com.company;

public class Quadrat {
    private int costat;
    public int getCostat(){
        return this.costat;
    }
    public void setCostat(int costat){
        this.costat=costat;
    }
    public Quadrat( int costat){
        this.setCostat(costat);
    }
    public void calcArea(){
        System.out.println("Area :"+this.getCostat()*this.getCostat());

    }
}