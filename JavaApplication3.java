/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Maduka
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int data =100/0;
        }catch(ArithmeticException e)
        {
            System.out.println(e);
      
        }
        System.out.println("rest of the code");
    }
    
    
}
