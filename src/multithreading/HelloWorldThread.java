/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Mike
 */

public class HelloWorldThread extends Thread {
 @Override
 public void run() {
 System.out.println("Salut lume!");
 }
 public static void main(String args[]) {
 Thread t = new HelloWorldThread();
t.start();
 }
}
