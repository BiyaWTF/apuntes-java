
package apuntescurso;

public class ClaseMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        System.out.println(Math.pow(4, 2));
        
        System.out.println(Math.random());
        int numeroRandom = (int) (Math.random()*101);   //esto genera un número aleatorio entre 0 y 100 inclusive
        int numeroRandom1 = (int) (Math.random()*100) + 1;   //esto genera un número aleatorio entre 1 y 100 
        System.out.println(numeroRandom);
        
        System.out.println((int) (Math.sqrt(64)));
        
        System.out.println(Math.max(7, 9));
        System.out.println(Math.min(7, 9));
        
        System.out.println(Math.round(5.7));    //redondea
        
        double moneda = (double) Math.round(3.4289 * 100d) / 100; 
         
    }
}
