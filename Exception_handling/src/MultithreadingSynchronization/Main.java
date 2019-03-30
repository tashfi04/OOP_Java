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
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SubThread obj1 = new SubThread();
        Operation a = new Operation();
        obj1.setname("one", a);
        SubThread obj2 = new SubThread();
        obj2.setname("two", a);

        obj1.start();
        obj2.start();
        obj1.join();
        obj2.join();

        System.out.println(a.num);
    }
}
