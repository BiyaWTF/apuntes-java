/*LeetCode Array/String EJ6*/
package M;

public class ReverseWords {
    public static String reverseWords(String s) {
        //Limpiamos todos los primeros y últimos espacios
        s = s.trim();
        //Reemplazamos todos los espacios (\\s+) por un solo espacio (" ")
        s = s.replaceAll("\\s+", " ");
        //s.split es una funcion que devuelve un array separándolo según el parametro introducido, así que lo almacenamos en un array
        String[] palabras = s.split(" ");
        String reverse = "";
        //recorremos array a la inversa y escribimos
        for (int i = palabras.length - 1; i >= 0; i--) {
            reverse += palabras[i] + " ";
        }
        //Hacemos otro trim para quitar el espacio final añadido
        reverse = reverse.trim();
        return reverse;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseWords ("Hola     Mundo   "));
    }
}
