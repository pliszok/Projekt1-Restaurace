package com.engeto.projekt1_restaurace;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> menu = new ArrayList();

    public void addDishToMenu(Dish dish){
        if(!menu.contains(dish)){
            menu.add(dish);
        }
        else{
            System.out.println("Jídlo již na menu je.");
        }
    }

    public void removeDishFromMenu(Dish dish){
        menu.remove(dish);
    }

    public void clearMenu(){
        menu.clear();
    }

    public boolean isDishInMenu (Dish dish){
        return menu.contains(dish);
    }

    public void showMenu(){
        for (Dish dish : menu){
            System.out.println(dish);
        }
    }



}
