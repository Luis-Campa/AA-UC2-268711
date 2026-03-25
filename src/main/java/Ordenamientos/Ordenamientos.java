/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author luisantoniocamparubio
 */
class Ordenamientos {
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

    // 🔹 QUICK SORT
    public static void quicksort(int[] arr, int inicio, int fin){
        if (inicio < fin){
            
            int pivoteIndice = particion(arr, inicio, fin);
            
            quicksort(arr, inicio, pivoteIndice - 1);
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
}
