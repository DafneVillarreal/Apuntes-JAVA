package Basico;
import java.util.Scanner;

public class While {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner (System.in);
        
        int Tabla, cont=1;
        
        System.out.println ("Ingrese de que numero quiere ver su tabla de multiplicar: ");
        Tabla = Entrada.nextInt();
        
        while (cont <= 12) {
            System.out.println(Tabla +" * " +cont +" = " +(Tabla * cont));
            cont++;
        }
    }
}
