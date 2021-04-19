/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Maduka
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scan = new Scanner( System.in );
    int data=0, slot=0 ;
    int[] value = new int[10];

    try
    { 
      System.out.print("Enter the data: ");
      data = scan.nextInt();
      System.out.print("Enter the array index: ");
      slot = scan.nextInt();
      value[slot] = data;
    }

    catch (InputMismatchException ex )
    {  
      System.out.println("This is your problem: " +  ex.getMessage()   
          + "\nHere is where it happened:\n");
       ex.printStackTrace();  
    } 

    catch (IndexOutOfBoundsException ex )
    {  
       System.out.println("This is your problem: " +  ex.getMessage()   
          + "\nHere is where it happened:\n");
       ex.printStackTrace(); 
     } 

    System.out.println("Good-by" );
  }
}
    
    

