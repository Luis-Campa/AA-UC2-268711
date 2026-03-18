/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author luisantoniocamparubio
 */
public class OrdenaminetoPorInsercion {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    
}
