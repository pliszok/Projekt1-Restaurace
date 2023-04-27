package com.engeto.projekt1_restaurace;

public enum Category {
    CHICKEN("chicken"), FISH("fish"), PASTA("pasta"), SOUP("soup"), OTHERS("others");

    private String description;

    Category (String description){
        this.description=description;
    }
}
