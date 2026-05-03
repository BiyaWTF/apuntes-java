/*You have a long flowerbed in which some of the plots are planted, and some are not. 
  However, flowers cannot be planted in adjacent plots.

  Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
  and an integer n, return true if n new flowers can be planted in the flowerbed without violating 
  the no-adjacent-flowers rule and false otherwise.*/
package E;

public class CanPlaceFlowers {

    // Método que resuelve el ejercicio
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;

                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        return count >= n;
    }

    // Método main para probar el funcionamiento
    public static void main(String[] args) {
        CanPlaceFlowers sol = new CanPlaceFlowers();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("¿Se pueden plantar " + n1 + " flores? " + sol.canPlaceFlowers(flowerbed1, n1)); // true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("¿Se pueden plantar " + n2 + " flores? " + sol.canPlaceFlowers(flowerbed2, n2)); // false

        int[] flowerbed3 = {0, 0, 0, 0, 0};
        int n3 = 3;
        System.out.println("¿Se pueden plantar " + n3 + " flores? " + sol.canPlaceFlowers(flowerbed3, n3)); // true
    }
}