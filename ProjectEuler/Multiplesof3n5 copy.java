/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerproblems;

/**
 * EULER PROBLEM #1 !!!
 * @author mtornar
 */
public class Multiplesof3n5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int threesHolder = 0;
        int fivesHolder = 0;
        int intersectionHolder = 0;
        
        for(int a = 0; a < 1000; a++) {
            if (a%3 == 0) {
                threesHolder += a;
            }
            if (a%5 == 0) {  
                fivesHolder += a;
            }
            if ((a%3 == 0) && (a%5 == 0)) { 
                intersectionHolder -= a;
            }
        }
        System.out.print(threesHolder + fivesHolder + intersectionHolder);
    }
}

