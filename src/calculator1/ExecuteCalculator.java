/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class ExecuteCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Calculator aCalculator = new Calculator();
      
    Scanner numbers = new Scanner(System.in);
   
    System.out.println("Please introduce your first number: ");
    float a = numbers.nextFloat();
        
    Scanner operator = new Scanner(System.in);
        
    System.out.println("Please introduce an operator (+,-,*,/): ");
    String oper = operator.nextLine();
    
    System.out.println("Please introduce your second number: ");
    float b =numbers.nextFloat();
    
    
    System.out.print("Please introduce \"=\": ");
    String equal=operator.nextLine();
    if(equal.equals("=")) {
        
        switch(oper){
            case("+"):
                float resultofSume = aCalculator.sum(a,b);
                System.out.println("The sum is: "+a+" + "+b+" = "+resultofSume );
                break;
            case("-"):
                float resultofSubstract = aCalculator.substract(a,b);
                System.out.println("The substract is: "+a+" - "+b+" = "+resultofSubstract );
                break;
            case("/"):
                float resultofDevide = aCalculator.devide(a,b);
                System.out.println("The devide is: "+a+" / "+b+" = "+resultofDevide );
                break;
            case("*"):
                float resultofMultiply = aCalculator.multiply(a,b);
                System.out.println("The multiply is: "+a+" * "+b+" = "+resultofMultiply );
                break;    
                default:
                throw new IllegalArgumentException("Invalind operat: " + oper+"Please introduce an operator (+,-,*,/)");
        }
        
    }
    else{
        System.out.println("Illigal operator!. Sorry, you introduces wrong data. I quit\":)\" ");
        System.exit(0);
        
           
    }
    
       numbers.close();
       operator.close();
            
            
            
            
            
            
        }
    }
    
            
           
        
    
    
