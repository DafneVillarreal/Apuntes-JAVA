package Basico;
import java.util.Scanner;

public class Switch {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner (System.in);
        
        int Dia;
        String Resultado = "";
        
        System.out.println ("Ingrese el numero de dia de la semana: ");
        Dia = Entrada.nextInt();
        
        switch (Dia) {
            case 1:
            Resultado = "Lunes";
            break;
    
            case 2:
            Resultado = "Martes";
            break;
        
            case 3:
            Resultado = "Miércoles";
            break;
        
            case 4:
            Resultado = "Jueves";
            break;
        
            case 5:
            Resultado = "Viernes";
            break;
        
            case 6:
            Resultado = "Sábado";
            break;
        
            case 7:
            Resultado = "Domingo";
            break;
        
            Default:
            Resultado = "Número inválido";
        }
        
        System.out.println (Resultado);
    }
    
}
