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

    //Udělat objednávku s objektem Dish, fulfilment time bude order time + dish.getPreparationTime

    public Order(Dish dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, Table table, String notes) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime.plusMinutes(dish.getPreparationTime());
        this.table = table;
        this.notes = notes;
    }

    public Order(Dish dish, LocalTime orderTime, String waiter, LocalTime fulfilmentTime, Table table) {
        this.dish = dish;
        this.orderTime = orderTime;
        this.waiter = waiter;
        this.fulfilmentTime = fulfilmentTime;
        this.table = table;
    }

//    public boolean isFinished(Order order){
//        if(order.getOrderTime()+order.getOrderTime())
//    }

    @Override
    public String toString() {
        return "Objednávka: "+dish+", musí být hotova v "+getFulfilmentTime()+", je pro "+getTable()+", obsluhuje "+getWaiter();
    }
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:SS", Locale.US);
//    formatter.format(LocalTime.getOrderTime);
}
