package com.engeto.projekt1_restaurace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Dish {

    //region attributes
    private static final String DEFAULT_IMAGE = "blank.url";

    private String title;
    private BigDecimal price;
    private int preparationTime;
    private List<String> imageURL;
    private String mainImage;
    private Category category;
    //endregion

    // region constructors
    public Dish(String title, BigDecimal price, int preparationTime, String mainImage, Category category){
        this.title=title;
        this.price=price;
        this.preparationTime=preparationTime;
        this.imageURL=new ArrayList<>();
        addImageURL(mainImage);
        this.category=category;
    }

    public Dish(String title, BigDecimal price, int preparationTime, Category category){
        this.title=title;
        this.price=price;
        this.preparationTime=preparationTime;
        this.imageURL=new ArrayList<>();
        setMainImage(DEFAULT_IMAGE);
        imageURL.add(mainImage);
        this.category=category;
    }
    //endregion

    @Override
    public String toString() {
        return title+";"+price+";"+preparationTime+";"+mainImage+";"+category;
    }


    public void addImageURL(String imageName){
        if(!imageURL.contains(imageName)){
            imageURL.add(imageName);
            if(imageURL.size()==1){
                mainImage = imageName;
            }
        }
    }

    public void removeImageURL(String imageName){
        if(imageURL.size()>1 && imageURL.contains(imageName)){
            imageURL.remove(imageName);
            if(imageName.equals(mainImage)){
                mainImage = imageURL.get(0);
            }
        }
        else {
            System.out.println("Jídlo musí mít alespoň jednu fotografii.");
        }
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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String imageName) {
        if(imageURL.contains(imageName)){
            mainImage = imageName;
        }
    }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }
    //endregion
}
