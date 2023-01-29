package Basico;
import java.util.Scanner;
 
public class If_else {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner (System.in);
        
        int Edad;
        
        System.out.println ("Ingresa tu edad: ");
        Edad = Entrada.nextInt ();
        
        if (Edad < 18) {
            System.out.println ("Eres menor de edad");
        }
        else {
            System.out.println ("Eres mayor de edad");
        }
    }
}
