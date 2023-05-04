package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DishException{

        DishList menu = new DishList();

        System.out.println("\n===Načtu do menu jídla z repertoáru a vypíšu===");
        menu.addAllFromFile(Settings.getFilename());

        Dish zebirka = new Dish("žebírka", BigDecimal.valueOf(189), 20, "zebirka-01", Category.OTHERS);
        menu.addDish(zebirka);

        System.out.println("\n===přidal jsem žebírka a vypíšu===");
        for (Dish dish:menu.getDishList()){
            System.out.println(dish);
        }

        System.out.println("\n===zjistím, jestli jsou žebírka v menu===");
        menu.containsDish(zebirka);

        System.out.println("\n===vytvořím a vypíšu objednávku===");
        Order objednavka = new Order("zebirka", LocalTime.now(),"Tomáš",
                LocalTime.now().plus(Duration.ofMinutes(zebirka.getPreparationTime())), Table.TABLE1);
        System.out.println(objednavka);

        System.out.println("\n===teď seřadím podle kategorií a vyúíšu===");
        menu.sortByCategory();
        for (Dish dish:menu.getDishList()){
            System.out.println(dish);
        }

        System.out.println("\n===vymažu jedno jídlo a uložím seřazený seznam jídel do menu===");
        menu.removeDish(menu.getDishFromIndex(menu.getDishList(),4));

        menu.saveToFile(Settings.getMenu());
    }
}
