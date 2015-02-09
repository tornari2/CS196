/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerproblems3;

/**
 * EULER PROBLEM #6 !!!
 * @author mtornar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,squaredSums,sum, sumSquared, difference;
        squaredSums = 0;
        sum = 0;
        
        for(a = 1; a <= 100; a++) {
           squaredSums += (a*a); 
        }
        
        for(a = 1; a <= 100; a++) {
            sum += a;
        }
        
        sumSquared = sum*sum;
        difference = sumSquared - squaredSums;
        
        System.out.print("The square of sums minus the sum of squares equals " + difference);
    }
    
}
