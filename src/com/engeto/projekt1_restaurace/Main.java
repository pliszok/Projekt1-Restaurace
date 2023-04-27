package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DishException{

        DishList menu = new DishList();

        menu.addAllFromFile(Settings.getFilename());

        Dish zebirka = new Dish("žebírka", BigDecimal.valueOf(189), 20, "zebirka-01", Category.OTHERS);
        menu.addDish(zebirka);

        System.out.println("===přidal jsem žebírka===");

        for (Dish dish:menu.getDishList()){
            System.out.println(dish);
        }
        menu.containsDish(zebirka);

        Order objednavka = new Order("zebirka", LocalTime.now(),"Tomáš",
                LocalTime.now().plus(Duration.ofMinutes(zebirka.getPreparationTime())), Table.TABLE1);
        System.out.println(objednavka);
    }
}
