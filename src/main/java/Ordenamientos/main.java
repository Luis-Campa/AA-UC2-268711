/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

import static Ordenamientos.OrdenaminetoPorInsercion.insertionSort;
import java.util.Arrays;

/**
 *
 * @author luisantoniocamparubio
 */
public class main {
   public static void main(String[] args) {

        int[] original = {4, 2, 4, 3, 1, 4};

        System.out.println("Arreglo original: " + Arrays.toString(original));

        // Copias
        int[] arrQuick = Arrays.copyOf(original, original.length);
        int[] arrInsertion = Arrays.copyOf(original, original.length);

        // 🔹 QuickSort
        Ordenamientos.quicksort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrQuick));

        // 🔹 InsertionSort
        Ordenamientos.insertionSort(arrInsertion);
        System.out.println("InsertionSort: " + Arrays.toString(arrInsertion));
    }
    
}
