package com.engeto.projekt1_restaurace;

public enum Table {
    TABLE1("stůl 1"), TABLE2("stůl 2"), TABLE3("stůl 3"), TABLE4("stůl 4");

    private String description;

    Table(String description){
        this.description=description;
    }

    @Override
    public String toString() {
        return description;
    }
}
