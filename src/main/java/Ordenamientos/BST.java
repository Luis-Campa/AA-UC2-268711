/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenamientos;

/**
 *
 * @author luisantoniocamparubio
 */
public class BST {
    
        // Clase interna que representa un nodo del árbol
    class Node {
        int value;      // Valor del nodo
        Node left;      // Referencia al hijo izquierdo
        Node right;     // Referencia al hijo derecho

        // Constructor del nodo
        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root; // Raíz del árbol

    // Método público para insertar un valor
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Método recursivo que inserta un valor en la posición correcta
    private Node insertRec(Node root, int value) {
        // Si el árbol está vacío, se crea un nuevo nodo
        if (root == null) {
            return new Node(value);
        }

        // Si el valor es menor, se inserta en el subárbol izquierdo
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        }
        // Si el valor es mayor, se inserta en el subárbol derecho
        else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Se retorna el nodo actual
        return root;
    }

    // Método público para buscar un valor en el árbol
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Método recursivo de búsqueda
    private boolean searchRec(Node root, int value) {
        // Si el nodo es null, el valor no existe
        if (root == null) return false;

        // Si se encuentra el valor, retorna true
        if (root.value == value) return true;

        // Si el valor es menor, buscar en el lado izquierdo
        if (value < root.value)
            return searchRec(root.left, value);
        // Si es mayor, buscar en el lado derecho
        else
            return searchRec(root.right, value);
    }

    // Método público para eliminar un valor del árbol
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    // Método recursivo para eliminar un nodo
    private Node deleteRec(Node root, int value) {

        // Si el árbol está vacío, no hay nada que eliminar
        if (root == null) return root;

        // Buscar el nodo a eliminar
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Nodo encontrado

            // Caso 1: nodo sin hijos (hoja)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Caso 2: nodo con un solo hijo
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Caso 3: nodo con dos hijos
            // Se utiliza el sucesor inorden (el menor del subárbol derecho)
            root.value = minValue(root.right);

            // Se elimina el nodo sucesor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    // Método para encontrar el valor mínimo en un subárbol
    // (se usa para obtener el sucesor)
    private int minValue(Node root) {
        int min = root.value;

        // Se recorre hacia la izquierda hasta encontrar el menor
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }

        return min;
    }

    // Método público para recorrer el árbol en inorden
    public void inorder() {
        inorderRec(root);
        System.out.println(); // Salto de línea
    }

    // Método recursivo para recorrido inorden
    // (izquierda → raíz → derecha)
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);             // Vista izquierda
            System.out.print(root.value + " "); // Imprime valor
            inorderRec(root.right);            // Vista derecha
        }
    }
}