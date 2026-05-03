
package apuntescurso;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(sumar("Fernando Martínez", 7, 8, 3, 123));
        System.out.println(sumar(3.4, 34.56, 2.31));
    }
                      //Si nosotros queremos también que la función reciba otro tipo de parámetros que no sean variable argumentos, se deberá de poner siempre al principio, y los que utilizan '...' al final.
    static int sumar (String nombre, int... numeros) { //El operador ... permite que la función acepte un número variable de argumentos del mismo tipo (en este caso, int). Internamente, los argumentos se tratan como un array de enteros.
        System.out.println("La suma de " + nombre + ":");
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
    
    static double sumar (double... numeros) { 
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }
    
    /*La sobre carga de funciones es útil para proveer múltiples formas de un método. Esto se decide en tiempo de compilación*/
    
}
