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
public class ThreadJoinIsAliveSlepp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A nt1 = new A("Thread1");
        System.out.println("Thread1 is alive:: "+nt1.t.isAlive());
        
        A nt2 = new A("Thread2");
        System.out.println("Thread2 is alive:: "+nt2.t.isAlive());
        
        A nt3 = new A("Thread3");
        System.out.println("Thread3 is alive:: "+nt3.t.isAlive());
        
        try{
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }
        catch(Exception e){
            
        }
        System.out.println("Thread1 is alive = "+nt1.t.isAlive());
        System.out.println("Thread2 is alive = "+nt2.t.isAlive());
        System.out.println("Thread3 is alive = "+nt3.t.isAlive());
        
        System.out.println("End of main");
    }
    
}
