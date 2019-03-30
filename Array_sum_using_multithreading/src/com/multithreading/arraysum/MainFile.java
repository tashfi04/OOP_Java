/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading.arraysum;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tasfee
 */
public class MainFile {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        int arr3[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 100};
        int arr4[] = {-1, -2 ,-3, -4, -5, -6, -7, -8, -9, -10};

        ArraySum t1 = new ArraySum(arr1, arr2);
        ArraySum t2 = new ArraySum(arr3, arr4);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Array sum:");
        for (int i = 0; i < 10; i++) {
            System.out.println(t1.arr_sum[i] + t2.arr_sum[i]);
        }
    }
}
