
package apuntescurso;

public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Fernando";
        System.out.println(nombre.charAt(5));   //Almacena la cadena como un array y muestra el carácter que quieras siendo 0 el primero.
        
        System.out.println(nombre.length());    //Devuelve un entero con la cantidad de carácteres
        
        for(int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
        
        System.out.println(nombre.substring(0, 4)); //Te saca carácteres hasta donde indiques
        
        System.out.println(nombre.toLowerCase());   //convierte en minúscula
        System.out.println(nombre.toUpperCase());   //convierte en Mayúscula
        
        nombre = "F e r n a n d o";
        System.out.println(nombre.replace(" ", "-"));   //reemplaza los espacios por guiones o lo que le introduzcamos
        
        System.out.println("Hola" == "Hola");
        System.out.println("Hola".equals("hola"));
        
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        nuevo.append("Hola ");          //con el método append puedo asignar cadenas de caracteres y se van almacenando
        nuevo.append("Mundo");          
        
        System.out.println(nuevo);
        System.out.println(nuevo.toString());
        
    }
}
