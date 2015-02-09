/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerproblems5;

/**
 * EULER PROBLEM 3 !!!
 * @author mtornar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        long bigNum = 600851475143L;
        for(num = 2; num <= bigNum; num++) {
            if(isPrime(num) == true && bigNum % num == 0) {
                System.out.println(num);
            }
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
