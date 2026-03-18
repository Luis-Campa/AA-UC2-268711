/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

import static Ordenamientos.OrdenaminetoPorInsercion.insertionSort;

/**
 *
 * @author luisantoniocamparubio
 */
public class main {
 public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Arreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
