package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DishException{

//        Dish kureciRizek = new Dish("Kuřecí řízek", BigDecimal.valueOf(159), 15,
//                "kureci-rizek-01", Category.CHICKEN);
//
//        System.out.println(kureciRizek);

        DishList menu = new DishList();

        menu.addAllFromFile(Settings.getFilename());

    }
}
