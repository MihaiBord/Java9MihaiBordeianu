package access.packageone;

/* Calss Beta extends Alpha
package access.packageone;

/**
 *
 * @author Mike
 */
public class Beta extends Alpha{
    
    private final int privateAlphaVarible = 10;
    protected int protectedAlpahVariablle = 20 ;
    int packageAlphaVariable = 30;
    public int publicAlphaVariable = 40 ;
    private String protectedAlphaVariable;
   
    public void visibilityInClass(String packedAlphaVariable) {
        String privateAlphaVariable = null;
    
    System.out.println("Private member visibility:" +  privateAlphaVariable);
    System.out.println("Protected member visibility:" +  protectedAlphaVariable);
    System.out.println("Packed member visibility:" +  packedAlphaVariable);
    System.out.println("Public member visibility:" +  publicAlphaVariable);
}
    
}

