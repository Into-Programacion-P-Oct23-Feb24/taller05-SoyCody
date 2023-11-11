package problema2;
import java.util.Scanner;
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double primerHijo;
        double segundoHijo;
        double tercerHijo;
        double total;
        System.out.println("Ingrese el valor de gasto del primer hijo");
        primerHijo = entrada.nextDouble();
        System.out.println("Ingrese el valor de gasto del segundo hijo");
        segundoHijo = entrada.nextDouble();
        System.out.println("Ingrese el valor de gasto del tercer hijo");
        tercerHijo = entrada.nextDouble();
        total = primerHijo + segundoHijo + tercerHijo;
        System.out.println("Total de gastos: " + total);
        
    }
    
}
