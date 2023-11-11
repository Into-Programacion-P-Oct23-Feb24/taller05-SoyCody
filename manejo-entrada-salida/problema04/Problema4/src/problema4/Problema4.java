package problema4;
import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cpu;
        double pantalla;
        double teclado;
        double raton;
        double total;
        System.out.println("Ingrese el costo de cada parte de la computadora");
        System.out.println("CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Pantalla:");
        pantalla = entrada.nextDouble();
        System.out.println("Teclado:");
        teclado = entrada.nextDouble();
        System.out.println("Ratón:");
        raton = entrada.nextDouble();
        total = cpu + pantalla + teclado + raton;
        System.out.printf("CPU:%s\nPantalla:%s\nTeclado:%s\nRaton:%s\n"
                + "Usted tiene un total a cancelar de:%s",cpu, pantalla, teclado, raton, total);
    }
    
}
