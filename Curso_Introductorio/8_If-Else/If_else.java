package Basico;
import java.util.Scanner;
 
public class If_else {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner (System.in);
        
        int Edad;
        
        System.out.println ("Ingresa tu edad: ");
        Edad = Entrada.nextInt ();
        
        if (Edad < 12) {
            System.out.println ("Eres un niño");
        }
        else if (Edad < 18) {
            System.out.println ("Eres un adolescente");
        }
        else {
            System.out.println ("Eres un adulto");
        }
        /*
        Para agregar mas condiciones a un if basta con agregar los else if
        y poner los casos deseados
        */
    }
}
