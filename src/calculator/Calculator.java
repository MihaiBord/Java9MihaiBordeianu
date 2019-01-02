/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Mike
 */
public class Calculator {
    float result=0;     
    
    public float sum(float a, float b){
        result=a+b;
        return result;
    } 
    public float substract(float a, float b){
        result=a-b;
        return result;
    }
        public float multiply (float a, float b){
        result=a*b;
        return result;
    }
            public float devide(float a, float b){
        result=a/b;
        return result;
    }
    
                 
    
}
