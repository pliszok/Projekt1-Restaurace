package com.engeto.projekt1_restaurace;

import java.util.Comparator;

public class OrderTimeComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2){
        return o1.getOrderTime().compareTo(o2.getOrderTime());
    }
}
