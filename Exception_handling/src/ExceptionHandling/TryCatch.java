/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Tasfee
 */
public class TryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;
        
        //c = a/b;
        
        try {
            c = a/b;
        } catch(ArithmeticException ex) {
            System.out.println("Can't divide a number by zero!");
        }
    }
}
