/*
 * Just a thred 
 */
package multithreading;
    
    public class HelloAllThread extends Thread {
 @Override
 public void run() {
 System.out.println("Hello all!");
 }
 public static void main(String args[]) {
 Thread t = new HelloAllThread();
t.start();
 }
}

