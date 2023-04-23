package com.engeto.projekt1_restaurace;

import java.util.Comparator;

public class DishCategoryComparator implements Comparator<Dish> {
    @Override
    public int compare(Dish o1, Dish o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}
