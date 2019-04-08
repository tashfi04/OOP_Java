/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multithreading.arraysum;

/**
 *
 * @author Tasfee
 */
public class ArraySum extends Thread {
    int arr1[] = new int[10];
    int arr2[] = new int[10];
    int arr_sum[] = new int[10];
    
    public ArraySum (int arr1[], int arr2[]) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    
//    int[] sum() {
//        for (int i = 0; i < 10; i++) {
//            arr_sum[i] = arr1[i] + arr2[i];
//        }
//        return arr_sum;
//    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            arr_sum[i] = arr1[i] + arr2[i];
            //System.out.println(">>--" + arr_sum[i]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}