package Basico;

public class Operadores_aritmeticos {
    public static void main (String[] args) {
        int Resultado_sum, Resultado_res, Resultado_mul, Resultado_div, 
                Resultado_mod, Numero1 = 10, Numero2= 5;
        
        System.out.println ("Numero 1: " + Numero1);
        System.out.println ("Numero 2: " + Numero2);
        
        //Suma '+'
        Resultado_sum = Numero1 + Numero2;
        System.out.println ("Suma= " + Resultado_sum);
        
        //Resta '-'
        Resultado_res = Numero1 - Numero2;
        System.out.println ("Resta= " + Resultado_res);
    
        //Multiplicacion '*'
        Resultado_mul = Numero1 * Numero2;
        System.out.println ("Multiplicacion= " + Resultado_mul);
        
        //Division '/'
        Resultado_div = Numero1 / Numero2;
        System.out.println ("Division= " + Resultado_div);
        
        //Modulo '%'
        Resultado_mod = Numero1 % Numero2;
        System.out.println ("Modulo= " + Resultado_mod);
    }
}
