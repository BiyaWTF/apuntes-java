package Apuntes;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListApuntes {

    public static void main(String[] args) {
        // ¿Qué es una List?
        // Es una estructura que almacena elementos ordenados y con acceso por índice.

        // Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        // Añadir elementos
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Lista después de añadir elementos: " + numeros); // [10, 20, 30]

        // Acceder a un elemento
        int segundoNumero = numeros.get(1); // índice 1 = segundo elemento
        System.out.println("Elemento en la posición 1: " + segundoNumero); // 20

        // Modificar un elemento
        numeros.set(0, 100); // Cambia el primer elemento
        System.out.println("Lista después de modificar: " + numeros); // [100, 20, 30]

        // Eliminar un elemento por índice
        numeros.remove(2); // Elimina el tercer elemento (índice 2)
        System.out.println("Lista después de eliminar: " + numeros); // [100, 20]

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + numeros.size()); // 2

        // Recorrer con for tradicional
        System.out.println("Recorrido con for:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento en índice " + i + ": " + numeros.get(i));
        }

        // Recorrer con for-each
        System.out.println("Recorrido con for-each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Lista de booleanos (true/false)
        List<Boolean> resultados = new ArrayList<>();
        resultados.add(true);
        resultados.add(false);
        resultados.add(5 > 2); // true
        System.out.println("Lista de booleanos: " + resultados); // [true, false, true]

        // Ejemplo: valores mayores que 50
        List<Integer> notas = Arrays.asList(45, 60, 30, 80, 55);
        List<Boolean> aprobado = new ArrayList<>();

        for (int nota : notas) {
            aprobado.add(nota >= 50);
        }

        System.out.println("Notas: " + notas);
        System.out.println("¿Aprobado?: " + aprobado); // [false, true, false, true, true]
    }
}
