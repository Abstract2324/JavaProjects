/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fizzbuzz;

/**
 *
 * @author Антон
 */
import javax.swing.JOptionPane;
public class FizzBuzz {
    
    
    public static void main(String[] args) {
        int end=50;
        for(int begin=1;begin<=end;begin++){
            if (begin%15==0){
                System.out.println("FizzBuzz");
            }
            else if(begin%5==0){
            System.out.println("Fizz");
        }
            else if (begin%3==0){
            System.out.println("Buzz");
        }
            else {
            System.out.println(begin);
                    }
        }
    }
}
