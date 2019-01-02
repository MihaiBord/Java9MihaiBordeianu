/*
 * Obiectul partajat de cele doua threaduri 
 */
package multithreading;

/**
 *
 * @author Mike
 */
public class Contor {
    
    private volatile int valoare = 0;
    
    /**
     * Metoda incrementeaza voalrea
     */
    public synchronized void incrementeaza () {
        valoare++;
                
    }
/**
 * Metoda decrementeaza  valoarea
 * 
 *
 */

public synchronized void decrementeaza() {
    valoare--;
    
}
    
    /**
     * 
     * @return 
     */
    
public synchronized int getValoare(){
            
            return valoare ;
}
    }
    
