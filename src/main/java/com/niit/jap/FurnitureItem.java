package com.niit.jap;

public class FurnitureItem {
    String furnitureCode;
    String furnitureType;
    String colour;
    String furnitureUsage;
    int gradeOfFurniture;
    int price;

    FurnitureItem() {
        furnitureUsage="";
        furnitureType="";
        furnitureCode="";
        gradeOfFurniture=0;
        price=0;

    }
    public double calculateDiscount(){
        double discountPrice = 0;
        if (furnitureType.equals("outdoor")){
            //price*discount/100
            discountPrice=(price*5)/100;
            return price-discountPrice;
        }
        return discountPrice;


    }


}
