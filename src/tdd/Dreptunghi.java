/*
 * Clasa Rectangle
 */
package tdd;

/**
 *
 * @author Mike
 */
public class Dreptunghi extends PatrulaterDreptunghic{
    
    public static final String DREPTUNGHI = "especially one with unequal adjacent sides, in contrast to a square" ;
    public static final String DREPTUNGHI_BEGIN = "Rectangle" ;
    @Override
    public String getDefinition() {
        
        String definiton = DREPTUNGHI_BEGIN + super.getDefinition()+ DREPTUNGHI;
        return definiton;
    }
          
}
