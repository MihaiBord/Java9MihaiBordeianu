/*
 *TEST 
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author Mike
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi ();
        Cerc c = new Cerc ();
        Patrat p = new Patrat ();
        
        Triunghi t1 = new Triunghi();
        Triunghi t2 = new Triunghi ();
        
        // cream o colectie de date si incarcam i ea obiectele
        
        LinkedList<FiguraGeometrica> listaDeFiguri = new LinkedList();
        listaDeFiguri.add(d1);
        listaDeFiguri.add(d2);
        listaDeFiguri.add (p);       
        listaDeFiguri.add(c);
        listaDeFiguri.add(t1);
        listaDeFiguri.add(t2);
        
        //parcurgem lista de figuri
        
        listaDeFiguri.forEach((t) -> {
            System.out.println(t.getDefinition());
        });
        
        
    }
    
}
