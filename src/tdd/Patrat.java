/*
 * Clasa Rectangle
 */
package tdd;

/**
 *
 * @author Mike
 */
public class Patrat extends PatrulaterDreptunghic{
    
    public static final String PATRAT = "equal" ;
    public static final String PATRAT_BEGIN = "SQUARE:" ;
    @Override
    public String getDefinition() {
        
        String definiton = PATRAT_BEGIN+super.getDefinition().substring(0,24) + PATRAT+super.getDefinition().substring(24);
        return definiton;
    }
          
}
