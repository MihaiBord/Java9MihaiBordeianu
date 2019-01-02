/*
 * Patrulater Dreptunghic;
 */
package tdd;

/**
 *
 * @author Mike
 */
public class PatrulaterDreptunghic  extends Patrulater{
    
    public static final String DREPTUNGHIC= "and four right angles";
    private String definition;
    
    /**
     *
     * @return
     */
    public String getDefiniton(){
    
    String definiiton = super.getDefinition() + DREPTUNGHIC;
    
    return definition;
    
   } 
}
