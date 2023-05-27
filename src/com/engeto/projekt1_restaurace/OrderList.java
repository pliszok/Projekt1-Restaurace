package com.engeto.projekt1_restaurace;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderList {
    private List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() {
        return new ArrayList<>(orderList);
    }

    public void addToOrders(Order order) {
        orderList.add(order);
    }

    public void sortByOrderTime() {
        Collections.sort(orderList, new OrderTimeComparator());
    }

    public void ordersToFinish(){
        System.out.println("Nedokokončené objednávky:");
        for(Order order:orderList){
            if(order.getFulfilmentTime().isAfter(LocalTime.now())){
                System.out.println(order);
            }
        }
    }

    public void sumOfOrdersToFinish(){
        int sum = 0;
        for(Order order:orderList){
            if(order.getFulfilmentTime().isAfter(LocalTime.now())) {
                sum++;
            }
        }
        System.out.println("Počet nedokončených objednávek je: "+sum);
    }

    public void sortByWaiter() {
        Collections.sort(orderList, new WaiterComparator());
    }

    public void priceByWaiter(String waiter){
        BigDecimal x;
        BigDecimal y = BigDecimal.valueOf(0);
        for(Order order:orderList){
            if(order.getWaiter()==waiter) {
                x = order.getDish().getPrice();
                y = y.add(x);
            }
            System.out.println("Číšník "+order.getWaiter()+" má celkem objednávky za: "+y+" Kč.");
        }
    }

    public void averageOrderFulfilmentTime(LocalTime timeStart, LocalTime timeEnd){
        int totalPreparationTime = 0;
        int count = 0;
        int averagePreparatioinTime;
        for(Order order:orderList) {
            LocalTime orderTime = order.getOrderTime();
            if (orderTime.isAfter(timeStart) && orderTime.isBefore(timeEnd)) {
                totalPreparationTime += order.getDish().getPreparationTime();
                count++;
            }
        }
        averagePreparatioinTime = totalPreparationTime / count;
        System.out.println("Průměrná doba zpracování objednávek v čase "+timeStart+" - "+timeEnd+" je "+averagePreparatioinTime+" minut.");
    }


    public void saveToFile(String filename) throws DishException {
        try (PrintWriter outputWriter = new PrintWriter(new FileWriter(filename))) {
            for (Order order : orderList) {
                outputWriter.println(order);
            }
        } catch (IOException e) {
            throw new DishException("Došlo k chybě při zápisu do souboru "+filename+": "+e.getLocalizedMessage());
        }
    }
}
