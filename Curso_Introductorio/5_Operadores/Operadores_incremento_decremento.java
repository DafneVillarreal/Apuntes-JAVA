package Basico;

public class Operadores_incremento_decremento {
    public static void main (String [] args) {
        int Num1 = 5, Num2 = 18;
        
        //Incremento
        System.out.println (Num1);
        Num1++;
        System.out.println ("Incremento de 1= " + Num1);
        
        //Decremento
        System.out.println (Num2);
        Num2--;
        System.out.println ("Decremento de 1= " + Num2);
        
        /*
        En lugar de los clasicos incrementos como 
        Resultado = varible1 + variable1;
        podemos escribir 
        Resultado = variable1++;
        */
    }
}
