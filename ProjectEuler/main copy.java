/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerproblems2;

/**
 * EULER PROBLEM #5 !!!
 * @author mtornar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0;
        while(a >= 0) {
            a++;
            if(a%1 == 0 && a%2 == 0 && a%3 == 0 && a%4 == 0 && a%5 == 0
                    && a%6 == 0 && a%7 == 0 && a%8 == 0 && a%8 == 0 && a%10 == 0
                    && a%11 == 0 && a%12 == 0 && a%13 == 0 && a%14 == 0 && a%15 == 0 &&
                    a%16 == 0 && a%17 == 0 && a%18 == 0 && a%19 == 0 && a%20 == 0) {
                System.out.print("The smallest multiple is " + a);
                break;
            }
        }
        //int smallestMultiple = 0;
        //int a = 0;
        //int counter = 0;
        //do {    
            //smallestMultiple++;
            //for(a = 1; a <= 20; a++) {
               // if(smallestMultiple % a == 0) {
                //    counter++;
                //}
            //}
        //} while(counter != 20);
        //System.out.print(smallestMultiple);
    }
    
}
