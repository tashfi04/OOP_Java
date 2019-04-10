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
public class SubThread extends Thread {
    String ThreadName = "";
    Operation a;

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

    public void setname(String name, Operation x) {
        ThreadName = name;
        a = x;

    }
}
