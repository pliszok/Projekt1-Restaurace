package com.engeto.projekt1_restaurace;

import java.time.LocalTime;

public class Order {

    //region atributes
    private Dish dish;
    private LocalTime orderTime;
    private String waiter;
    private LocalTime fulfilmentTime;
    private Table table;
    private String notes;
    //endregion atributes

    //region get set
    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
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

    public String getNotes() { return notes; }

    public void setNotes (String notes) { this.notes=notes; }
//endregion

    public Order(Dish dish, LocalTime orderTime, String waiter, Table table, String notes) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        fulfilmentTime = LocalTime.now().plusMinutes(dish.getPreparationTime());
        this.table = table;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Objednávka: "+dish.getTitle()+", musí být hotova v "+getFulfilmentTime().getHour()+":"+getFulfilmentTime().getMinute()+", je pro "+getTable()+", obsluhuje "+getWaiter();
    }
}
