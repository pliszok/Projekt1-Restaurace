package com.engeto.projekt1_restaurace;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DishList {

    private List<Dish> dishList = new ArrayList<>();

    public void addDish(Dish dish) {
        dishList.add(dish);
    }

    public void removeDish(Dish dish) {
        dishList.remove(dish);
    }

    public boolean containsDish(List<Dish> dishList, Dish dish){
        if (dishList.contains(dish)){
            return true;
        }
        return false;
    }

    public Dish getDishFromIndex(List<Dish> dishList, int index)throws IndexOutOfBoundsException{
        if(index<0 && index>dishList.size()){
            throw new IndexOutOfBoundsException("Musíte zadat index od \"0\" do "+"\""+dishList.size()+"\". Zadal jsi "+index);
        }
        return dishList.get(index);
    }

    public void sortByCategory(){
        Collections.sort(dishList, new DishCategoryComparator());
    }

    public List<Dish> getDishList() {
        return new ArrayList<>(dishList);
    }

    public void addAllFromRepertoar(String filename) throws DishException {
        int lineNumber = 0;
        String[] items = new String[4];
        try
                (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                lineNumber++;
                String line = scanner.nextLine();
                items = line.split(";");
                Dish dish = new Dish(items[0], new BigDecimal(items[1]), Integer.parseInt(items[2]), items[3], Category.valueOf(items[4]));
                dishList.add(dish);
                System.out.println(dish);
            }
        } catch (FileNotFoundException e) {
            throw new DishException("Soubor nenalezen. Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            throw new DishException("Špatně zadané číslo na řádku "+lineNumber+" - \""+items[1]+"\""+" nebo \""+items[2]+"\" není číslo."
                    +"\n"+e.getLocalizedMessage());
        } catch (EnumConstantNotPresentException e) {
            throw new DishException("Špatný formát kategorie na řádku: " + lineNumber + "\n" + e.getLocalizedMessage());
        }
    }


    public void saveToRepertoar(String filename) throws DishException {
        try (PrintWriter outputWriter = new PrintWriter(new FileWriter(filename))) {
            for (Dish dish : dishList) {
                outputWriter.println(dish);
            }
        } catch (IOException e) {
            throw new DishException("Došlo k chybě při zápisu do souboru "+filename+": "+e.getLocalizedMessage());
        }
    }

    public void saveToMenu(String filename) throws DishException {
        try (PrintWriter outputWriter = new PrintWriter(new FileWriter(filename))) {
            for (Dish dish : dishList) {
                outputWriter.println(dish.getTitle()+": "+dish.getPrice()+" Kč.");
            }
        } catch (IOException e) {
            throw new DishException("Došlo k chybě při zápisu do souboru "+filename+": "+e.getLocalizedMessage());
        }
    }
}


