/*
 * Clasa Circle
 */
package tdd;

/**
 *
 * @author Mike
 */
public class Cerc extends Plana {
    public static final String CIRCLE_BEGIN = "CIRCLE: ";
    public static final String CIRCLE =" whose boundary (the circumference) consists of\n" +
"points equidistant from a fixed point (the centre).";
    
 
    /**
     *
     * @return
     */
    @Override
    public String getDefinition () {
    String definition  = CIRCLE_BEGIN + super.getDefinition() + CIRCLE;
        
       return definition;
        
    }
    
    
}
