        
package E;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of children: ");
        int longitud = sc.nextInt();
        Integer[] candies = new Integer[longitud];
        boolean[] result = new boolean[longitud];
        
        for (int i = 0; i < candies.length; i++) {
            System.out.print("Kid " + (i+1) + " -->");
            candies [i] = sc.nextInt();
        }
        
        System.out.print("extraCandies --> ");
        int extraCandies = sc.nextInt();
        
        System.out.println(Arrays.toString(candies) + ", extraCandies = " + extraCandies);
        
        //SACAMOS EL MÁXIMO SIN LAS extraCandies
        int max = candies[0];   //Suponemos que el primer número es el más grande
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);    //usar Math.max para comparar
        }
        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result[i] = true;
            }
        }
        
        System.out.println(Arrays.toString(result));
        
        for (int i = 0; i < candies.length; i++) {
            if (result[i] == true) {
                System.out.println("- Kid " + (i + 1) + ", they will have " + candies[i] + " + " + extraCandies + " = " + (extraCandies + candies[i]) + " candies, which is the greatest among the kids.");
            } else {
                System.out.println("- Kid " + (i + 1) + ", they will have " + candies[i] + " + " + extraCandies + " = " + (extraCandies + candies[i]) + " candies, which is NOT the greatest among the kids.");
            }
        }
    }
    
                   /////
              /////////////
          ///////////////////
        //SOLUCIÓN LEETCODE//
         ///////////////////
            /////////////
                /////
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Paso 1: encontrar el máximo de caramelos
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Paso 2: verificar si cada niño puede tener al menos tantos caramelos como el máximo
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}




