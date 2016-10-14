/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_erik_isaac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class Ex9_Erik_Isaac {
   
            
    
    public static void main(String[] args) {
        int number = 0;
        number = inputPossitiveNumber();
        
        //System.out.println(number);
        
    }
    
    
    
    
    
    
    
    public static int inputPossitiveNumber() {
        int number = 0; 
        boolean correct = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                System.out.print("Insert number:");
                number = Integer.parseInt(reader.readLine());
                if(number > 0) {
                    correct = true;
                } else {
                    System.out.println("Wrong value, expected possitive number.");
                }
            } catch (IOException e) {
                System.out.println("Unexpected error.");
            } catch (NumberFormatException e) {
                System.out.println("Wrong value, expected a number.");
            }
        } while(!correct);
        return number;
    }
    
}
