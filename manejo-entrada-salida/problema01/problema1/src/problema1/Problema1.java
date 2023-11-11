package problema1;
import java.util.Scanner;
public class Problema1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        
        System.out.print("Ingrese la base del triángulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
    
}
