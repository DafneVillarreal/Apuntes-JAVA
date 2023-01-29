package Basico;
import java.util.Scanner;

public class For {
    public static void main (String [] args) {
        
        int Numero;
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println ("Ingrese el numero del cual quiere saber su tabla de multiplicar: ");
        Numero = Entrada.nextInt();
        
        for (int i = 1; i<12; i++) {
            System.out.println (Numero +" * " +i +"= " +(Numero*i));
        }
        //La sintaxis sigue siendo muy similar a derivados de C
    }
}
