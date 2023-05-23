package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DishException {

        DishList repertoar = new DishList();

        System.out.println("\n===Načtu repertoár a vypíšu===");
        repertoar.addAllFromRepertoar(Settings.getRepertoar());

        System.out.println("\n====Vytvořím objednávku a vypíšu===");
        Order objednavka = new Order(repertoar.getDishList().get(0),LocalTime.now(),"Pepa", Table.TABLE3,"bez poznámek");
        System.out.println(objednavka);

        Order objednavka2 = new Order(repertoar.getDishList().get(5),LocalTime.now(),"Pepa", Table.TABLE3,"bez poznámek");
        System.out.println(objednavka2);

        Order objednavka3 = new Order(repertoar.getDishList().get(3),LocalTime.now(),"Pepa", Table.TABLE3,"bez poznámek");
        System.out.println(objednavka3);

        OrderList orders = new OrderList();

        orders.addToOrders(objednavka);
        orders.addToOrders(objednavka2);
        orders.addToOrders(objednavka3);

        orders.ordersToFinish();

        orders.sumOfOrdersToFinish();

    }
}


        /*
        Dish zebirka = new Dish("žebírka", BigDecimal.valueOf(189), 20, "zebirka-01", Category.OTHERS);
        repertoar.addDish(zebirka);

        System.out.println("\n===přidal jsem žebírka a vypíšu===");
        for (Dish dish:repertoar.getDishList()){
            System.out.println(dish);
        }

        System.out.println("\n===zjistím, jestli jsou žebírka v repertoáru===");

        if(repertoar.containsDish(repertoar.getDishList(), zebirka)==true){
            System.out.println("ano");
        }

        System.out.println("\n===teď seřadím podle kategorií a vypíšu===");
        repertoar.sortByCategory();
        for (Dish dish:repertoar.getDishList()){
            System.out.println(dish);
        }

        System.out.println("\n===vytvořím a vypíšu objednávku===");
        Dish zkusebni = repertoar.getDishFromIndex(repertoar.getDishList(),5);
        Order objednavka = new Order(zkusebni,LocalTime.now(),"Pepa", Table.TABLE3,"bez poznámek");
        System.out.println(objednavka);

        System.out.println("\n===vymažu jedno jídlo a uložím seřazený seznam jídel do repertoáru===");
        repertoar.removeDish(repertoar.getDishFromIndex(repertoar.getDishList(),4));

//        repertoar.saveToRepertoar(Settings.getRepertoar());

        repertoar.saveToMenu(Settings.getMenu());
    }
}
*/