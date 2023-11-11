package problema3;
import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double costo;
        int minutos;
        double planilla;
        System.out.println("Ingrese el costo por minutos de consumo");
        costo = entrada.nextDouble();
        System.out.println("Ingrese el valor de minutos consumidos");
        minutos = entrada.nextInt();
        planilla = costo * minutos;
        System.out.printf("Planilla de teléfono\nPendiente a pagar: %.2f", planilla);
    }
    
}
