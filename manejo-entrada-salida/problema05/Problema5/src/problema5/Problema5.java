package problema5;
import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double subtotal;
        double descuento;
        double total;
        int edad;
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el costo pendiente de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el costo pendiente a pagar de Youtube Premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el costo pendiente a pagar de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo pendiente a pagar de Spotify");
        spotify = entrada.nextDouble();
        subtotal = netflix + youtube + dropbox + spotify;
        if (edad < 30) {
            descuento = (subtotal * 20) / 100;
            total = subtotal - descuento;
            System.out.println("Usted tiene un total por cancelar de: " + total);
        } else {
            System.out.println("Usted tiene un total por cancelar de: " + subtotal);

        }
        
    }
    
}
