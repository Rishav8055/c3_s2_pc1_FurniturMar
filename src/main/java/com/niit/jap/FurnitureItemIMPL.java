package com.niit.jap;

import java.util.Scanner;

public class FurnitureItemIMPL {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        FurnitureItem furnitureItem2 = new FurnitureItem();
        System.out.println("enter furniture colour");
        furnitureItem2.colour= scanner.nextLine();
        System.out.println("what type of furniture you want indoor or outdoor ");
        furnitureItem2.furnitureType=scanner.nextLine();
        System.out.println("we have 3 grade enter your grade");
        furnitureItem2.gradeOfFurniture=scanner.nextInt();
        System.out.println("enter code if you know");
        furnitureItem2.furnitureCode=scanner.nextLine();
        System.out.println("enter your usage");
        furnitureItem2.furnitureUsage=scanner.nextLine();
        System.out.println("enter your budget price");
        furnitureItem2.price=scanner.nextInt();

        System.out.println("your discount price   =  "+furnitureItem2.calculateDiscount());


    }
}