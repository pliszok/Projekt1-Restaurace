package com.engeto.projekt1_restaurace;

import java.time.LocalTime;

public class Order {

    //region atributes
    private String dish;
    private LocalTime orderTime;
    private String waiter;
    private LocalTime fulfilmentTime;
    private String table;

    //endregion atributes

    //region get set
    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public LocalTime getFulfilmentTime() {
        return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }

//endregion


    public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, String table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        table = "table1";
    }
}

       /* public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, String table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        table="table2";
    }

    public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, String table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        table="table3";
    }

    public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, String table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        table="table4";

    }
}*/
