package com.engeto.projekt1_restaurace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
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

    public List<Dish> getDishList() {
        return new ArrayList<>(dishList);
    }

    public void addAllFromFile(String filename) throws DishException {
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
            throw new DishException("Špatně zadané číslo na řádku: " + lineNumber + ": \"" + items[1] + " nebo" + items[2] + " není číslo.");
        } catch (EnumConstantNotPresentException e) {
            throw new DishException("Špatný formát kategorie na řádku: " + lineNumber + "\n" + e.getLocalizedMessage());
        }
    }
}


