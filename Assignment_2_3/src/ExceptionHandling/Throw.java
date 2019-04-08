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
public class Throw {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c;
        
        try {
            c = a/b;
            throw new ArithmeticException("Arithmatic exception!");
        } catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
