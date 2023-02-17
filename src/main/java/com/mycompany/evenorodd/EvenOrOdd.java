/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenorodd;

/**
 *
 * @author alexc
 */
import java.util.Scanner;

public class EvenOrOdd {
    
  public void isEven()
   {
      Scanner input= new Scanner(System.in);
      
      int values; 
      
      System.out.print("Enter a number between 1 - 999999 To See If An Even Or Odd (-1 to quit ): ");
       values = input.nextInt();
       
    while (values <= 999999 & values >= 0)
      {
       
      if(values%2 == 0)
      {
          System.out.println("True, The Number Is Even \n");
       
      }
      else 
      {
         System.out.printf("False, The Number is Not Even But Odd \n" );
      }
       System.out.print("Enter a number between 1 - 999999 To See If An Even Or Odd (-1 to quit ): ");
       values = input.nextInt();
       }
      
   }
}