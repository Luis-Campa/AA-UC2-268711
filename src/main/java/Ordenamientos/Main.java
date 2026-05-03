/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] original = {8, 2, 1, 4, 8, 9, 2, 3, 4};

        System.out.println("Arreglo original: " + Arrays.toString(original));

        // Copias
        int[] arrQuick = Arrays.copyOf(original, original.length);
        int[] arrInsertion = Arrays.copyOf(original, original.length);
        int[] arrMerge = Arrays.copyOf(original, original.length);

        //  QuickSort
        Ordenamientos.quicksort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrQuick));

        //  InsertionSort
        Ordenamientos.insertionSort(arrInsertion);
        System.out.println("InsertionSort: " + Arrays.toString(arrInsertion));

       //  MergeSort
       MergeSort.mergeSort(arrMerge, 0, arrMerge.length - 1);
       System.out.println("MergeSort: " + Arrays.toString(arrMerge));
    }
}