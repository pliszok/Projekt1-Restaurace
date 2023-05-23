package com.engeto.projekt1_restaurace;

import java.util.Comparator;

public class WaiterComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2){
        return o1.getWaiter().compareTo(o2.getWaiter());
    }
}
