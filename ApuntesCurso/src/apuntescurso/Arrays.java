
package apuntescurso;

public class Arrays {
    public static void main(String[] args) {
        
        String nombres [];  //aquí no defines cuantos datos quieres almacenar pero si defines que será un array
        
        nombres = new String [3];   //que queremos almacenar hasta 3 nombres y generará 3 espacios de tipo String
        
        nombres[0] = "Fernando";
        nombres[1] = "Martínez";
        nombres[2] = "Molina";
        //nombres[3] = "adfasdf";     error porque solo almacena hasta 3 datos
        
        System.out.println(nombres[2]);
        
        nombres[2] = "Villaescusa";
        
        System.out.println(nombres[2]);
        
        System.out.println(nombres);     //esto simplemente mostrará el espacio de la memoria en la que está almacenándose nombres
        System.out.println(nombres.length);
        
        int[] array1 = {1,2,3,4,5};
        System.out.println(array1[0]);
        array1[0] = 100;
        System.out.println(array1[0]);
        
        int[] array2 = new int[5];  //otra forma de definirlo
        
    }
}
