/*
 * Clasa Lanseaza threaduri 
 */
package multithreading;

/**
 *
 * @author Mike
 */
public class Uiteasa {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
 Thread t = new HelloAllThread();
       System.out.println("Prioritatea threadului este:" + t.getPriority()) ;
  Thread thw = new HelloWorldThread();
 thw.setPriority(Thread.MAX_PRIORITY);
 t.setPriority(Thread.MIN_PRIORITY);
  t.start();
  thw.start(); 
         System.out.println ("Prioritatea threadului este:" + thw.getPriority());
   }
    
}
