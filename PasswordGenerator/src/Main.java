
public class Main {

    public static void main(String[] args) {
        System.out.println(generaContrasena());
    }
    
    static String generaContrasena(){
        //Se crean tres arrays de caracteres (máyusc, minus, nums)
        char[] mayuscula = {'A','B','C','D','E','F','G','H','I'};
        char[] minuscula = {'a','b','c','d','e','f','g','h','i'};
        char[] numeros = {'1','2','3','4','5','6','7','8'};
        
        //Se crea un StringBuilder llamado caracteres, que sirve para construir texto dinámicamente.
        StringBuilder caracteres = new StringBuilder();
        //append() agrega los carácteres de cada array al StringBuilder
        //Después de estas líneas, caracteres contiene todos los carácteres posibles para la contraseña:
        //ABCDEFGHIabcdefghi12345678
        caracteres.append(mayuscula);
        caracteres.append(minuscula);
        caracteres.append(numeros);
        
        //Se crea otro StrBu que almacenará la contraseña que vamos a generar
        StringBuilder contrasena = new StringBuilder();
        
        for (int i = 0; i <= 15; i++) {
            int cantidadCaracteres = caracteres.length();
            //Al multiplicar por cantidadCaracteres y convertirlo a int, obtenemos un índice aleatorio entre 0 y 25
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            //Le añade a la contraseña el caracter de la posición random
            contrasena.append((caracteres.toString()).charAt(numeroRandom));
        }
        return contrasena.toString();
    }
}
