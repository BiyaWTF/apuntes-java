
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        OUTER:
        while(true) {
            System.out.println("JUEGO ADIVINA EL NÚMERO \n");
            System.out.println("1- Nivel Facil\n"
                    + "2 - Nivel Intermedio\n"
                    + "3 - Nivel Dificil\n"
                    + "4 - Salir");
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("INGRESE UNA OPCION: ");
            int opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4:
                    System.out.println("SALIENDO... ... ... ...");
                    break OUTER;
                default:
                    System.out.println("PARAMETRO INCORRECTO");
            }
        }
    }
    
    static void jugar (int vidas) {
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner entrada = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom) {
            System.out.println("Ingrese un numero entre 1 y 100: ");
            numeroElegido = entrada.nextInt();
            
            if(numeroRandom < numeroElegido) {
                System.out.println("------------------------------------------");
                System.out.println("|        El numero es mas pequeño        |");
                System.out.println("------------------------------------------");
                vidas--;
            } else if (numeroRandom > numeroElegido) {
                System.out.println("------------------------------------------");
                System.out.println("|       El numero es mas grande           |");
                System.out.println("------------------------------------------");
                vidas--;
            }
            
            if(vidas == 0) {
                System.out.println("--------------------");
                System.out.println("|    GAME OVER    |");
                System.out.println("--------------------");
                break;
            }
            System.out.println("----------------------------------------------");
            System.out.println("|             Te quedan " + vidas + " vidas              |");
            System.out.println("----------------------------------------------");
        }
        
        if (numeroElegido == numeroRandom) {
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
            System.out.println("FELICIDADES GANASTE");
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
        }
    }
    
}
