/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysorting;

/**
 *
 * @author Антон
 */
import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        // Сортировка массива по возрастанию
        Arrays.sort(array);

        System.out.println("Массив, отсортированный по возрастанию:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Сортировка массива по убыванию
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println("\nМассив, отсортированный по убыванию:");
        for (int num : boxedArray) {
            System.out.print(num + " ");
        }
    }
}
