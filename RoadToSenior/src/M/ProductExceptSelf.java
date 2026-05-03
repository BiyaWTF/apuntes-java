/*LeetCode Array/String EJ7*/
//ME AYUDA CHATGPT
package M;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //Creamos un array con la misma longitud del introducido por parámetro
        int[] products = new int[nums.length];

        //Guardamos prefijos directamente en products
        products[0] = 1;    // antes del primer elemento no hay nada
        for (int i = 1; i < nums.length; i++) {
            products[i] = products[i - 1] * nums[i - 1];
        }

        //Recorremos de derecha a izquierda para multiplicar sufijos
        int sufijo = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= sufijo;   // multiplicamos por el producto de los elementos a la derecha
            sufijo *= nums[i];       // actualizamos el sufijo
        }

        return products; 
    }
}
