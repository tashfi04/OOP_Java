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
public class Thread extends Main{
    String ThreadName = "";
    Operation a = new Operation();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            a.operation(2, ThreadName);
            System.out.println(a.num);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void setname(String name, op x) {
        ThreadName = name;
        a = x;

    }
}
