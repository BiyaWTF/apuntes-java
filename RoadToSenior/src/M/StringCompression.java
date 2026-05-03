/*Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

Note: The characters in the array beyond the returned length do not matter and should be ignored.*/
package M;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] caracteres = new char[0];
        
            System.out.println("Introduce carácteres o escriba 'exit' para salir");
            String entrada = sc.nextLine();
            
            //Si el usuario no escribe ningun caracter saca mensaje pero el programa continua
            while (entrada.isEmpty()) {
                System.out.println("No has introducido ningun caracter");
                System.out.println("Introduce carácteres o escriba 'exit' para salir");
                entrada = sc.nextLine();
            }
            caracteres = entrada.toCharArray();
            Arrays.sort(caracteres);
            
            for (int i = 0; i < caracteres.length; i++) {
                int j = 0;
                for (j = 0; j < caracteres.length; j++) {
                    if (caracteres[i] == caracteres[j]) {
                        
                    }
                }
                j++;
        }
            
    }
}
