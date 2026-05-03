/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
  starting with word1. If a string is longer than the other, append the additional letters onto the end 
  of the merged string.

  Return the merged string.

Example 1:
  Input: word1 = "abc", word2 = "pqr"
  Output: "apbqcr"
  Explanation: The merged string will be merged as so:
  word1:  a   b   c
  word2:    p   q   r
  merged: a p b q c r
*/
package E;

import java.util.Scanner;
import java.util.Arrays;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("word1 = ");
        String word1 = sc.next();
        System.out.print("word2 = ");
        String word2 = sc.next();
        
        System.out.println(mergeAlternately(word1, word2));
    }
    
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder resultado = new StringBuilder();
        // Calculamos la longitud máxima entre las dos palabras para saber cuántas veces debemos iterar como máximo
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            // Si aún quedan caracteres en word1, se añade el carácter en la posición i
            if (i < word1.length()) {
                resultado.append(word1.charAt(i));
            }
            // Si aún quedan caracteres en word2, se añade el carácter en la posición i
            if (i < word2.length()) {
                resultado.append(word2.charAt(i));
            }
        }
        // Convertimos el resultado a String y lo devolvemos
        return resultado.toString();
    }
    
    
    
    //SIN USAR STRINGBUILDER
    /*public static String mergeAlternately(String word1, String word2) {
    String resultado = "";

    int maxLength = Math.max(word1.length(), word2.length());

    for (int i = 0; i < maxLength; i++) {
        if (i < word1.length()) {
            resultado += word1.charAt(i);
        }
        if (i < word2.length()) {
            resultado += word2.charAt(i);
        }
    }

    return resultado;
    }*/
    
    
}


