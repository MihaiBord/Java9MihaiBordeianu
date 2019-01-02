/*
 * Creat a pattern for identifying CNP
 */
package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
/**
 *
 * @author Mihai
 */
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Input the pattern: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        String regex = "^[1-2]((0[1-9]|1[012])(0[1-9]|1\\d|2[0-8])|(0[13578]|1[02])(29|3[01]))(19\\d\\d|20\\d\\d)\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        
        if(matcher.find()){
            System.out.println("That's a valid CNP");
        }
        else{
            System.out.println("That's not a valid CNP");
        }
        
        
    }
    
}