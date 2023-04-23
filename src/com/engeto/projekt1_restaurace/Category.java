package com.engeto.projekt1_restaurace;

public enum Category {
    CHICKEN("chicken"), FISH("fish"), PASTA("pasta"), SOUP("soup");

    private String description;

    Category (String description){
        this.description=description;
    }
}
