/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbercheck;

/**
 *
 * @author Антон
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 16;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " является простым числом: " + isPrime);
    }
}
