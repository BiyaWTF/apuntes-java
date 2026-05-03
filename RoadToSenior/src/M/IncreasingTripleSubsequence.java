/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
  such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

  Example 1:
  Input: nums = [1,2,3,4,5]
  Output: true
  Explanation: Any triplet where i < j < k is valid.

  Example 2:
  Input: nums = [5,4,3,2,1]
  Output: false
  Explanation: No triplet exists.

  Example 3:
  Input: nums = [2,1,5,0,4,6]
  Output: true
  Explanation: One of the valid triplet is (3, 4, 5), because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.*/

package M;

public class IncreasingTripleSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        //recorremos el array menos las dos últimas posiciones ya que si no se saldría del index al hacer la comprobación en la sentencia if
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j+1; k < nums.length; k++) {
                        if (nums[j] < nums[k]) {
                            return true;    //ENCONTRAMOS EL TRIPLETE!!!
                        }
                    }
                }
            }
        }     
    return false;
    }
    
    
    //COMO LO PIDE LEETCODE, tiene que que ser 0(n) y 0(1). NO SE PUEDEN HACER TRIPLES BUCLES
    public static boolean increasingTripletOn(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;            // actualizamos el mínimo
            } else if (num <= second) {
                second = num;           // actualizamos el segundo mínimo
            } else {
                // encontramos num > second > first → triplete creciente
                return true;
            }
        }
        return false; // no se encontró ningún triplete
    }
    
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5};
        int[] enteros1 = {5,4,3,2,1};
        int[] enteros2 = {2,1,5,0,4,6};
        
        System.out.println(increasingTriplet(enteros));
        System.out.println(increasingTriplet(enteros1));
        System.out.println(increasingTriplet(enteros2));   
    }   
}
