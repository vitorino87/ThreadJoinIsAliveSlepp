/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadjoinisaliveslepp;

/**
 *
 * @author tiago.lucas
 */
public class A implements Runnable {

    String name;
    Thread t;

    A(String tname) {
        name = tname;
        t=new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i=1;i<=5;i++){
                System.out.println(name + " = "+i);
                Thread.sleep(300);
            }
            System.out.println("END OF = "+name);
        }
        catch(Exception e){
            
        }
    }

}
