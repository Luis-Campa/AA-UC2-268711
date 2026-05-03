/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author luisantoniocamparubio
 */
public class Main_BST {
    public static void main(String[] args) {

        // Se crea el árbol
        BST tree = new BST();

        // Arreglo de valores a insertar
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        // Se insertan los valores uno por uno
        for (int v : values) {
            tree.insert(v);
        }

        // Mostrar recorrido inorden antes de eliminar
        // (debe salir ordenado)
        System.out.println("orden antes de eliminar:");
        tree.inorder();

        // Se elimina el nodo con valor 50
        // Este nodo tiene dos hijos, por lo que:
        // - Se usa el sucesor (60)
        // - Se reemplaza el 50 por 60
        // - Luego se elimina el 60 original
        tree.delete(50);

        // Mostrar recorrido después de eliminar
        System.out.println("orden después de eliminar:");
        tree.inorder();

        // Valores a buscar
        int[] searchValues = {30, 50, 60};

        // Se realizan las búsquedas
        for (int v : searchValues) {
            if (tree.search(v)) {
                System.out.println(v + " encontrado");
            } else {
                System.out.println(v + " no encontrado");
            }
        }
    }
    
}
