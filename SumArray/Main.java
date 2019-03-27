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
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int arr1[] = {1, 2, 3};
        int arr2[] = {10, 20, 30};
        int arr3[] = {-1, -2, -3};
        int arr4[] = {-100, -200, -300};
        Sum t1 = new Sum(arr1, arr2);
        Sum t2 = new Sum(arr3, arr4);
        
        t1.start();
        t2.start();
        
        //Sum t3 = new Sum(t1.arr_sum, t2.arr_sum);
        
        //t3.start();
        t1.join();
        t2.join();
        for (int i = 0; i < 3; i++) {
            System.out.println(t1.arr_sum[i] + t2.arr_sum[i]);
            //System.out.println(t3.arr_sum[i]);
        }
    }
}
