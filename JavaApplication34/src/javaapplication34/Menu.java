/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author Ibrah
 */
public class Menu {

    public static int alfa;

    Scanner in = new Scanner(System.in);
    char Appetizers;
    int choice;
    char Pizza;
    char Burgers;
    char Wraps;
    char Sandwhiches;
    char SeaFood;
    char Desserts;
    char Drinks;


    public void Appetizers() {
        System.out.println("1.Mozzerala Sticks      Rs.450");
        System.out.println("2.Potato Skins          Rs.500");
        System.out.println("3.cheese Nachos         Rs.450");
        System.out.println("4.Cheese Fries          Rs.350");
        System.out.println("5.Chilli Cheese Fries   Rs.470");
        System.out.println("6.Buffalo Wings         Rs.500");
        System.out.println("7.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 450;
            } else if (choice == 2) {
                alfa = alfa + 500;
            } else if (choice == 3) {
                alfa = alfa + 450;
            } else if (choice == 4) {
                alfa = alfa + 350;
            } else if (choice == 5) {
                alfa = alfa + 370;
            } else if (choice == 6) {
                alfa = alfa + 500;
            } else if (choice != 7) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 7);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");
    }

    public void Pizza() {
        System.out.println("Margherita");
        System.out.println("Vegetarian");
        System.out.println("Pepparoni");
        System.out.println("Spinache");
        System.out.println("BarBQ");
        System.out.println("Chicken Fajita");
        System.out.println("Chicken Tikka");
    }

    public void Burgers() {
        System.out.println("1.Zinger Burger           Rs.750");
        System.out.println("2.Fillet O Fish           Rs.650");
        System.out.println("3.Classic Beef Burger     Rs.650");
        System.out.println("4.Double Zinger           Rs.870");
        System.out.println("5.Veggie Burger           Rs.500");
        System.out.println("6.Double Down Beef        Rs.950");
        System.out.println("7.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 750;
            } else if (choice == 2) {
                alfa = alfa + 650;
            } else if (choice == 3) {
                alfa = alfa + 650;
            } else if (choice == 4) {
                alfa = alfa + 870;
            } else if (choice == 5) {
                alfa = alfa + 500;
            } else if (choice == 6) {
                alfa = alfa + 950;
            } else if (choice == 7) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 7);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");
    }

    public void Wraps() {
        System.out.println("1.Chicken Roll Paratha       Rs.150");
        System.out.println("2.Beef Roll Paratha          Rs.200");
        System.out.println("3.Chicken Shawarma           Rs.150");
        System.out.println("4.Chicken Cheese Shawarma    Rs.220");
        System.out.println("5.Beef Shawarma              Rs.250");
        System.out.println("6.Zinger Twister             Rs.370");
        System.out.println("7.Chicken Tikka Wrap         Rs.320");
        System.out.println("8.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 150;
            } else if (choice == 2) {
                alfa = alfa + 200;
            } else if (choice == 3) {
                alfa = alfa + 150;
            } else if (choice == 4) {
                alfa = alfa + 220;
            } else if (choice == 5) {
                alfa = alfa + 250;
            } else if (choice == 6) {
                alfa = alfa + 370;
            } else if (choice == 7) {
                alfa = alfa + 320;
            } else if (choice == 8) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 8);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");
    }

    public void Sandwhiches() {
        System.out.println("1.Veggie Delight     Rs.420");
        System.out.println("2.Turkey Special     Rs.500");
        System.out.println("3.Hotdog             Rs.400");
        System.out.println("4.Chicken Tikka      Rs.550");
        System.out.println("5.Bar B Q            Rs.550");
        System.out.println("6.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 420;
            } else if (choice == 2) {
                alfa = alfa + 500;
            } else if (choice == 3) {
                alfa = alfa + 400;
            } else if (choice == 4) {
                alfa = alfa + 550;
            } else if (choice == 5) {
                alfa = alfa + 550;
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 6);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");
    }

    public void SeeFood() {
        System.out.println("1.Grilled Salmon       Rs.720");
        System.out.println("2.Fried Fish Steak     Rs.750");
        System.out.println("3.Fish n Ships         Rs.550");
        System.out.println("4.Fried Prawns         Rs.620");
        System.out.println("5.Fish Wrap            Rs.650");
        System.out.println("6.Finger Fish          Rs.550");
        System.out.println("7.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 720;
            } else if (choice == 2) {
                alfa = alfa + 750;
            } else if (choice == 3) {
                alfa = alfa + 550;
            } else if (choice == 4) {
                alfa = alfa + 620;
            } else if (choice == 5) {
                alfa = alfa + 650;
            } else if (choice == 6) {
                alfa = alfa + 550;
            } else if (choice == 7) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 7);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");
    }

    public void Desserts() {
        System.out.println(".Lemon Tart                  Rs.200");
        System.out.println("2.Doughnuts                  Rs.200");
        System.out.println("3.Red Velvet Cake            Rs.420");
        System.out.println("4.Brownie                    Rs.220");
        System.out.println("5.Chocolate Fudge Cake       Rs.420");
        System.out.println("6.Apple Pie                  Rs.370");
        System.out.println("7.Banana Bread               Rs.150");
        System.out.println("8.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 200;
            } else if (choice == 2) {
                alfa = alfa + 200;
            } else if (choice == 3) {
                alfa = alfa + 420;
            } else if (choice == 4) {
                alfa = alfa + 220;
            } else if (choice == 5) {
                alfa = alfa + 420;
            } else if (choice == 6) {
                alfa = alfa + 370;
            } else if (choice == 7) {
                alfa = alfa + 150;
            } else if (choice == 8) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
            
        }
        while (choice != 8);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");

    }
        public void Beverages()
    {
        System.out.println("1.Mineral Water          Rs.30");
        System.out.println("2.Soft Drink             Rs.50");
        System.out.println("3.Cocktails              Rs.250");
        System.out.println("4.Lemon Margarita        Rs.270");
        System.out.println("5.Mint Margarita         Rs.270");
        System.out.println("6.Fresh Juices           Rs.290");
        System.out.println("7.Milk Shakes            Rs.290");
        System.out.println("8.Exit");

        do {
            choice = in.nextInt();
            if (choice == 1) {
                alfa = alfa + 30;
            } else if (choice == 2) {
                alfa = alfa + 50;
            } else if (choice == 3) {
                alfa = alfa + 250;
            } else if (choice == 4) {
                alfa = alfa + 270;
            } else if (choice == 5) {
                alfa = alfa + 270;
            } else if (choice == 6) {
                alfa = alfa + 290;
            } else if (choice == 7) {
                alfa = alfa + 290;
            } else if (choice == 8) {
                break;
            } else {
                System.out.println("Invalid Option");
            }
        } while (choice != 8);
        System.out.println("Your total bill=" + alfa);
        System.out.println("Thank you");


    

    }


}
