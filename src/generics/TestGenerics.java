/*
 * Java Program to test generics 
 */
package generics;

/**
 *
 * @author Mike
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a box for Integers
        GenericBox<Integer> boxForInteger = new GenericBox<> ();
        Integer value = 5;
        boxForInteger.setContent(value);
        
        System.out.println("Box of Integer contains: " + boxForInteger.getContent().toString());
                
        
        // create a box for String
        GenericBox<String> boxforString = new GenericBox<> ();
        String message = "Hello Java 9 collegues";
        boxforString.setContent(message);
        System.out.println("Box of String contains: " + boxforString.getContent());
        
        
        // create a box for Viezure
        GenericBox<Viezure> boxforViezure = new GenericBox<> ();
        Viezure viezurePrim = new Viezure() ;
        boxforViezure.setContent(viezurePrim);
                System.out.println("Box of Viezure contains: " + boxforViezure.getContent().getNumarPicioareViezure());
        
        
       
        
        
    }
    
}
