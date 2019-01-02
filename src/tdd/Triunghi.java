/*
 * Class Triunghi
 */
package tdd;

/**
 *
 * @author Mike
 */
public class Triunghi extends Plana{
    
    public static final String TRIANGLE_BEGIN = "TRIANGLE:";
    public static final String TRIANGLE = " with three straight sides and three angles.";
    
    /**
     *
     * @return
     */
    public String getDefiniton() {
        String definition = TRIANGLE_BEGIN + super.getDefinition() + TRIANGLE;
        return definition;
    }
}
