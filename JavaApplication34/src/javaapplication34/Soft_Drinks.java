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
public class Soft_Drinks {
    
    public static int alfa;
    
    Scanner in=new Scanner(System.in);
    int choice;
    char Pepsi;
    char Sprite;
    char MountainDew;
    char Mirinda;
    char Fanta;
    char CocaCola;
    
    public void SoftDrink()
    {
        System.out.println("1.Pepsi");
        System.out.println("2.Sprite");
        System.out.println("3.MountainDew");
        System.out.println("4.Mirinda");
        System.out.println("5.Fanta");
        System.out.println("6.CocaCola");
        System.out.println("7.Exit");
    }
    
    public void Pepsi()
    {
        System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);
    }
    public void Sprite()
    {
        System.out.println("0.5 Liter    Rs.30");
        System.out.println("1 Liter      Rs.70");
        System.out.println("1.5 liter    Rs.100");
        
        System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);
    }
    public void MountainDew()
    {
        System.out.println("0.5 Liter    Rs.30");
        System.out.println("1 Liter      Rs.70");
        System.out.println("1.5 liter    Rs.100");
        
        System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);
    }
    public void Mirinda()
    {
        
        System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);
    }
    public void Fanta()
    {
        System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);
    }
    public void CocaCola()
    {
     System.out.println("1.0.5 Liter    Rs.30");
        System.out.println("2.1 Liter      Rs.70");
        System.out.println("3.1.5 liter    Rs.100");
        System.out.println("4.Exit");
        
        do
        {
            choice=in.nextInt();
            if(choice==1)
            {
                alfa=alfa+30;
            }
            else if(choice==2)
            {
                alfa=alfa+70;
            }
            else if(choice==3)
            {
                alfa=alfa+100;
            }
            else if(choice==4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
        }while(choice!=4);   
    }
}