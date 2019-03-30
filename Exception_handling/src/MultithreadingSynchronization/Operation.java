/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultithreadingSynchronization;

/**
 *
 * @author Tasfee
 */
public class Operation {
    int num = 0;

   synchronized  public void operation(int num, String ThreadName) {
        if (ThreadName.equalsIgnoreCase("One")) {
            this.num += num;
        } else {
            this.num -= num;
        }
    }
}
