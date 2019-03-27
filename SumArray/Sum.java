/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sum;

/**
 *
 * @author AkhlaqurRahman
 */
public class Sum extends Thread {
    int arr1[] = new int[3];
    int arr2[] = new int[3];
    int arr_sum[] = new int[3];
    
    public Sum(int arr1[], int arr2[]) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
//    for(int i=0; i<3; i++)
//        System.out.println(arr1[i] "<>" arr2[i]);
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //System.out.println(arr1[i] + "<>" + arr2[i]);
            arr_sum[i] = arr1[i] + arr2[i];
        } try {
            Thread.sleep(100);
        } catch(InterruptedException ex) {
            
        }
    }
}
