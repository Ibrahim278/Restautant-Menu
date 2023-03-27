/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;
import static javaapplication34.Pizzas.alfa;

/**
 *
 * @author Ibrahim
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static int alfa;
    


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        Scanner ipn=new Scanner(System.in);
        Menu m=new Menu();
        Pizzas P=new Pizzas();
        Soft_Drinks S=new Soft_Drinks();
        CockTails C=new CockTails();
        FreshJuices F=new FreshJuices();
        MilkShakes M=new MilkShakes();
        int choice;
        
      
           do{  
            System.out.println("***********WELCOME TO JAVA CAFE***********");
            System.out.println("             ");
            System.out.println("Press 1 to see Appetizers");
            System.out.println("Press 2 to see Pizza");
            System.out.println("Press 3 to see Burgers");
            System.out.println("Press 4 to see Wraps");
            System.out.println("Press 5 to see Sandwhiches");
            System.out.println("Press 6 to see SeaFood");
            System.out.println("Press 7 to see Desserts");
            System.out.println("Press 8 to see Beverages");
            System.out.println("Press 9 to Exit");
            
           
            
            choice=in.nextInt();
            if(choice==1)
            {
                m.Appetizers();
                System.out.println("         ");
            }
            else if(choice==2)
            {
                m.Pizza();
                   int again;
                again=in.nextInt();
                if(again==1){
                    P.Margherita();
                }
                else if(again==2)
                {
                    P.Vegetarian();
                }
                else if(again==3)
                {
                    P.Pepparoni();
                }
                else if(again==4)
                {
                    P.Spinache();
                }
                else if(again==5)
                {
                    P.BarBQ();
                }
                else if(choice==6)
                {
                    P.ChickenFajita();
                }
                else if(choice==7)
                {
                    P.ChickenTikka();
                }
                else
                {
                    break;
                }
            }
            else if(choice==3)
            {
                m.Burgers();
                System.out.println("      ");
            }
            else if(choice==4)
            {
                m.Wraps();
                System.out.println("      ");
            }
            else if(choice==5)
            {
                m.Sandwhiches();
                System.out.println("      ");
            }
            else if(choice==6)
            {
                m.SeeFood();
                System.out.println("      ");
            }
            else if(choice==7)
            {
                m.Desserts();
                System.out.println("      ");
            }
            else if(choice==8)
            {
                m.Beverages();
                System.out.println("      ");
                int again;
                again=in.nextInt();       
                if(again==2)
                {
                    S.SoftDrink();
                    again=in.nextInt();
                    if(again==1)
                {
                    S.Pepsi();
                }
                else if(again==2)
                {
                    S.Sprite();
                }
                else if(again==3)
                {
                    S.MountainDew();
                }
                else if(again==4)
                {
                    S.Mirinda();
                }
                else if(again==5)
                {
                    S.Fanta();
                }
                else if(again==6)
                {
                    S.CocaCola();
                }
                else
                {
                    break;
                }      
                }
                again=in.nextInt();
                if(again==3)
                {
                    C.CockTail();
                }
                else
                {
                    break;
                }
                again=in.nextInt();
                if(again==6)
                {
                    F.FreshJuices();
                }
                else
                {
                    break;
            }
            }
            else if(choice==9)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option");
            }
    }while(choice!=9);
   
           System.out.println("Thank you");
    }
    
    
}
