package com.engeto.projekt1_restaurace;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //region atributes
    private List<String> items;
    private LocalDateTime orderedTime;
    private Waiter waiter;
    private LocalDateTime fulfilmentTime;
    //endregion atributes

    public Order(List<String> items, Waiter waiter){
        items = new ArrayList<>(items);
        this.waiter = waiter;
        this.orderedTime = LocalDateTime.now();
    }

    public void fulfilOrder(){
        this.fulfilmentTime = LocalDateTime.now();
    }
    //region getters
    public List<String> getItems(){
        return items;
    }

    public LocalDateTime getOrderedTime(){
        return orderedTime;
    }

    public Waiter getWaiter(){
        return waiter;
    }

    public LocalDateTime getFulfilmentTime(){
        return fulfilmentTime;
    }
    //endregion

    public void addItems(List<String> additionalItems){
        items.addAll(additionalItems);
    }

    @Override
    public String toString() {
        return "Objednávka zadána: "+ orderedTime+"\nčíšník: "+waiter.getName()+"\nObsahuje položky: "+items+
                "\nByla vyřízena: "+(fulfilmentTime !=null ? fulfilmentTime : "nevyřízena");
    }
}
