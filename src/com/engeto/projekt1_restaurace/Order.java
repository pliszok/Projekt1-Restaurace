package com.engeto.projekt1_restaurace;

import java.time.LocalTime;

public class Order {

    //region atributes
    private String dish;
    private LocalTime orderTime;
    private String waiter;
    private LocalTime fulfilmentTime;
    private Table table;
    private String notes;
    //endregion atributes

    //region get set

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

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

    public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, Table table, String notes) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        this.table = table;
        this.notes = notes;
    }

    public Order(String dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, Table table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        this.table = table;
    }

    @Override
    public String toString() {
        return "Objednávka: "+dish+", musí být hotova v "+getFulfilmentTime()+", je pro "+getTable()+", obsluhuje "+getWaiter();
    }
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:SS", Locale.US);
//    formatter.format(LocalTime.getOrderTime);
}
