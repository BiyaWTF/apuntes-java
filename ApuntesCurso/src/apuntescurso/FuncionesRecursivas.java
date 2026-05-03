
package apuntescurso;


public class FuncionesRecursivas {
    
    static void cuentaRegresiva (int num) {
        if (num > 0) {
            System.out.println(num);
            num--;
            cuentaRegresiva(num);
        } else {
            System.out.println("llego a 0");
        }
    }
    
    static int factorial (int numero) {
        if (numero > 1) {
            numero = numero * factorial(numero - 1);
        }
        return numero;
    }
    
    public static void main(String[] args) {
        cuentaRegresiva(16);
        System.out.println(factorial(5));
    }
}
