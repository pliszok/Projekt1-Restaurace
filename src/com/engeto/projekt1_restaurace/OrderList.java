package com.engeto.projekt1_restaurace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderList {
    private List<Order> orderList = new ArrayList<>();

    public void addToOrders(Order order) {
        orderList.add(order);
    }

    public void sortByOrderTime() {
        Collections.sort(orderList, new OrderTimeComparator());
    }
}
