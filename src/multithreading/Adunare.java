/*
 * Threadul paralel
 */
package multithreading;

/**
 *
 * @author Mike
 */
public class Adunare extends Thread {
    
    
    private Contor contor;
    
    public Adunare(Contor ContorulComun) {
    
        contor = ContorulComun;
        
    }
        
    @Override
    public void run () {
        contor.incrementeaza();
        for (int i =0; i<5000; i++);
    }
    
}


