/*Greatest Common Divisor of Strings*/
/*For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t 
  (i.e., t is concatenated with itself one or more times).

  Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.*/
package E;

import java.util.Scanner;

public class gcdOfStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2)); // Resultado esperado: "AB"
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Si concatenar en diferentes órdenes da el mismo resultado, puede haber divisor común
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // No hay cadena común que divida a ambas
        }

        // Calculamos el máximo común divisor (GCD) de las longitudes
        int gcdLength = gcd(str1.length(), str2.length());

        // Devolvemos el prefijo de str1 con longitud igual al GCD
        return str1.substring(0, gcdLength);
    }

    // Función para calcular el Máximo Común Divisor (usando algoritmo de Euclides)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    
}
