/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author luisantoniocamparubio
 */
public class  MergeSort {
    public static void main(String[] args) {
        //int[] arreglo = {20, 10, 40, 90, 80, 70, 30};
        int[] arreglo = {8, 2, 1, 4, 8, 9, 2, 3, 4};
        
        System.out.println("El arreglo antes de ordenar:");
        imprimirArreglo(arreglo);
        
        mergeSort(arreglo, 0, arreglo.length - 1);
        
        System.out.println("El arreglo después de ordenar:");
        imprimirArreglo(arreglo);
    }
    
    public static void imprimirArreglo(int[] arreglo){
        for (int num : arreglo){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    
    public static void mergeSort(int[] arreglo, int izquierda, int derecha){
        // Caso base
        if (izquierda < derecha){
            //int medio = (izquierda + derecha) / 2;
            int medio = izquierda + (derecha - izquierda) / 2;
            
            // Llamada recursiva de la izquierda
            mergeSort(arreglo, izquierda, medio);
            
            // Llamada recursiva de la derecha
            mergeSort(arreglo, medio + 1, derecha);
            
            merge(arreglo, izquierda, medio, derecha);
        }
        
    }
    
    // MERGE(A, inicio, medio, fin)
    
    public static void merge(int[] arreglo, int izquierda, int medio, int derecha){
        
        // Calcular el tamaño de los dos sub-arreglos temporales
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;
        
        // Crear los arreglos temporales
        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];
        
        // Copiar los datos del arreglo original a los sub arreglos temporales
        for (int i = 0; i < n1; i++){ // Arreglo Izquierda
            izquierdaArr[i] = arreglo[izquierda + i];
        }
        for (int j = 0; j < n2; j++){ // Arreglo Derecho
            derechaArr[j] = arreglo[medio + 1 + j];
        }
        
        int i = 0; // Indice del sub-arreglo izquierdo
        int j = 0; // Indice del sub-arreglo derecho
        int k = izquierda; // Indice inicial donde vamos a escribir en el arreglo Original
        
        // Mientras ambos sub-arreglos tengan elmentos voy a ...
        while (i < n1 && j < n2){
            // Si el de la izquierda es menor o es igual, va primero
            if (izquierdaArr[i] <= derechaArr[j]){ // El igual, hace estable mi algoritmo
                arreglo[k] = izquierdaArr[i];
                i++;
            } else {
                // Si el de la derecha es menor, va primero
                arreglo[k] = derechaArr[j];
                j++;
            }
            k++;
        }
        
        // En ocasiones una lista termina antes que las otras, entonces, copiamos, lo que sobre
        while (i < n1){
            arreglo[k] = izquierdaArr[i];
            i++;
            k++;
        }
        
        while (j < n2){
            arreglo[k] = derechaArr[j];
            j++;
            k++;
        }
        
        
    }
    
}
