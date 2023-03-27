/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import static java.lang.System.in;

/**
 *
 * @author Ibrah
 */
import java.util.Scanner;
import static javaapplication34.Menu.alfa;

public class Pizzas {
    
    public static int alfa;
    
    Scanner in=new Scanner(System.in);
    int choice;
    char Margherita;
    char Vegetarian;
    char Pepparoni;
    char Spinache;
    char BarBQ;
    char ChickenFajita;
    char ChickenTikka;
    
    public void Margherita()
    {
        System.out.println("1.Regular   Rs.500");
        System.out.println("2.Medium    Rs.900");
        System.out.println("3.Large     Rs.1200");
        System.out.println("4.XL        Rs.1600");
        System.out.println("5.Exit");
        
        do{
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+500;
            }
            else if(choice==2)
            {
                alfa=alfa+900;
            }
            else if(choice==3)
            {
                alfa=alfa+1200;
            }
            else if(choice==4)
            {
                alfa=alfa+1600;
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
          }while(choice!=5);
           System.out.println("Your total bill="+alfa);
           System.out.println("Thank you");
    }
    public void Vegetarian()
    {
        System.out.println("1.Regular   Rs.500");
        System.out.println("2.Medium    Rs.900");
        System.out.println("3.Large     Rs.1200");
        System.out.println("4.XL        Rs.1600");
        System.out.println("5.Exit");
        
        do{
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+500;
            }
            else if(choice==2)
            {
                alfa=alfa+900;
            }
            else if(choice==3)
            {
                alfa=alfa+1200;
            }
            else if(choice==4)
            {
                alfa=alfa+1600;
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
          }while(choice!=5);
           System.out.println("Your total bill="+alfa);
           System.out.println("Thank you");
    }
    public void Pepparoni()
    {
       System.out.println("1.Regular   Rs.500");
        System.out.println("2.Medium    Rs.900");
        System.out.println("3.Large     Rs.1200");
        System.out.println("4.XL        Rs.1600");
        System.out.println("5.Exit");
        
        do{
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+500;
            }
            else if(choice==2)
            {
                alfa=alfa+900;
            }
            else if(choice==3)
            {
                alfa=alfa+1200;
            }
            else if(choice==4)
            {
                alfa=alfa+1600;
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
          }while(choice!=5);
           System.out.println("Your total bill="+alfa);
           System.out.println("Thank you");
    }
    public void Spinache()
    {
        System.out.println("1.Regular   Rs.500");
        System.out.println("2.Medium    Rs.900");
        System.out.println("3.Large     Rs.1200");
        System.out.println("4.XL        Rs.1600");
        System.out.println("5.Exit");
        
        do{
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+500;
            }
            else if(choice==2)
            {
                alfa=alfa+900;
            }
            else if(choice==3)
            {
                alfa=alfa+1200;
            }
            else if(choice==4)
            {
                alfa=alfa+1600;
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
          }while(choice!=5);
           System.out.println("Your total bill="+alfa);
           System.out.println("Thank you");
    }
    public void ChickenFajita()
    {
        System.out.println("1.Regular   Rs.500");
        System.out.println("2.Medium    Rs.900");
        System.out.println("3.Large     Rs.1200");
        System.out.println("4.XL        Rs.1600");
        System.out.println("5.Exit");
        
        do{
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+500;
            }
            else if(choice==2)
            {
                alfa=alfa+900;
            }
            else if(choice==3)
            {
                alfa=alfa+1200;
            }
            else if(choice==4)
            {
                alfa=alfa+1600;
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
          }while(choice!=5);
           System.out.println("Your total bill="+alfa);
           System.out.println("Thank you");    }
	public void BarBQ() {
		// TODO Auto-generated method stub
		
	}
	public void ChickenTikka() {
		// TODO Auto-generated method stub
		
	}
    
}
