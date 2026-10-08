/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcdassignment;

import static gcdassignment.GCDassignment.findGCD;
import java.util.Scanner;

/**
 *
 * @author nouran 220191336
 */
public class GCDassignment {

    /**
     * @param args the command line arguments
     */
        public static int findGCD(int a, int b) {
        
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (a != 0) {
            int remainder = b % a;   
            b = a;                    
            a = remainder;            
        }
        return b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Euclidean Algorithm");
        System.out.println();
       
        System.out.print("Enter num1 (a): ");
        int a = input.nextInt();

        System.out.print("Enter  num2 (b): ");
        int b = input.nextInt();
        
        int result = findGCD(a, b);

        System.out.println();
        System.out.println("GCD(" + a + ", " + b + ") = " + result);
        
        input.close();
    }
    
}


