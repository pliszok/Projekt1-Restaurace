package com.engeto.projekt1_restaurace;

public class Waiter {

    private String name;
    private int ID;

    public Waiter(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
}
