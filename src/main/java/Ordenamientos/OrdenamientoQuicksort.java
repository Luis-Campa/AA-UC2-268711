/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

import java.util.Arrays;

/**
 *
 * @author luisantoniocamparubio
 */
public class OrdenamientoQuicksort {
    
    public static void quicksort(int[] arr, int inicio, int fin){
        if (inicio < fin){
            
            int pivoteIndice = particion(arr, inicio, fin);
            
            System.out.println("El índice del pivote es: " + pivoteIndice + ". El arreglo actualmente es: " + Arrays.toString(arr));
            
            // Sub arreglo Izquierdo
            System.out.println("Izquierda");
            quicksort(arr, inicio, pivoteIndice - 1);
            
            // Sub arreglo Derecho
            System.out.println("Derecha");
            quicksort(arr, pivoteIndice + 1, fin);
        }
    }
    
    public static int particion(int[] arr, int inicio, int fin){
        int pivote = arr[fin];
        
        int i = inicio - 1;
        
        for (int j = inicio; j < fin; j++){
            if (arr[j] < pivote){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        
        return i + 1;
    }

    public static void main(String[] args) {
        //int[] numeros = {7, 2, 1, 6, 8, 5, 3, 4};
        //int[] numeros = {10, 80, 30, 90, 40, 50}; 
        int[] numeros = {4, 2 , 4, 3, 1, 4};
        
        System.out.println("Arreglo desordenado: " +  Arrays.toString(numeros));
        
        quicksort(numeros, 0, numeros.length -1);
        
        System.out.println("Arreglo Ordenado: " + Arrays.toString(numeros));
        
    }
}
