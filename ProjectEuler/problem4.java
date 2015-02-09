/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerproblems4;

/**
 * EULER PROBLEM #7 
 * @author mtornar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 2;
        int primeCount = 0;
        while(primeCount < 10001) {
                if(isPrime(num) == true) {
                    primeCount++;
                }
                if(primeCount == 10001) {
                    System.out.print("The 10,001st prime is " + num);
                }
                num++;
            }
        }
     private static boolean isPrime(int num) {
        for(int a = 2; a < num; a++) {
            if(num % a == 0) {
                return false;
            }
        }
        return true;
    }
    }
