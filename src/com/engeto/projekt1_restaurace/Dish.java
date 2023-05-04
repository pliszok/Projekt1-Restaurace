package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;

public class Dish {

    //region attributes
    private String title;
    private BigDecimal price;
    private int preparationTime;
    private String imageURL;
    private Category category;
    //endregion

    // region constructors
    public Dish(String title, BigDecimal price, int preparationTime, String imageURL, Category category){
        this.title=title;
        this.price=price;
        this.preparationTime=preparationTime;
        this.imageURL=imageURL;
        this.category=category;
    }

    public Dish(String title, BigDecimal price, int preparationTime, Category category){
        this.title=title;
        this.price=price;
        this.preparationTime=preparationTime;
        setImageURL("blank");
        this.category=category;
    }
    //endregion

    @Override
    public String toString() {
        return category+" - název: "+title+", cena: "+price+" Kč.";
    }


    //region get set

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }
    //endregion
}
