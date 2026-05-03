/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
  Example 1: 
  Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
package E;

import java.util.Scanner;
import java.util.Arrays;

public class twoSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Integer[] nums = new Integer[0];
        Integer target;
        int contador = 1;
        
        //Mientras que el numero sea distinto de -1 que siga el array creciendo
        System.out.print("Introduce el numero " + contador + ": ");
        Integer number = sc.nextInt();
        while (number != -1) {            
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[nums.length - 1] = number;
            contador++;
            System.out.print("Introduce el numero " + contador + ": ");
            number = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println(Arrays.deepToString(nums));
        System.out.println("");
        
        //Ahora pedimos el target, que es el numero que tenemos que sacar con la suma de dos números del array
        System.out.print("Target: ");
        target = sc.nextInt();
        System.out.println("");
        
        //Recorremos el array con un doble for
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    return; //Salimos porque como dice el enunciado solo hay una solucion
                }
            }
        }
    }
}


/*SOLUCIÓN LEETCODE*/
/*
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return null;
        }
    }
*/