/*
OPERADORES DE IGUALDAD Y RELACIONALES

Son aquellos con los que podemos realizar comparaciones entre datos compatibles,
ya sean numericos, caracteres o booleanos

El resultado que retornaran siemmpre sera booleano

    |   Operador |  Significado     |
    |            |                  |
    |   ==       |  igual que       |
    |   !=       |  diferente que   |
    |   <        |  menor que       |
    |   >        |  mayor que       |   
    |   <=       |  menor o igual   |
    |   >=       |  mayor o igual   |
 */

package Basico;

public class Operadores_comparacion {
    public static void main (String [] args) {
        int Num1 = 10, Num2 = 20;
        Boolean Resultado;
        
        //igual que
        Resultado = Num1 == Num2;
        System.out.println ("Iguales= " + Resultado);
        
        //diferentes
        Resultado = Num1 != Num2;
        System.out.println ("Diferentes= " + Resultado);
        
        //menor que
        Resultado = Num1 < Num2;
        System.out.println ("Menor que= " + Resultado);
        
        //mayor que
        Resultado = Num1 > Num2;
        System.out.println ("Mayor que= " + Resultado);
        
        //menor o igual
        Resultado = Num1 <= Num2;
        System.out.println ("Menor o igual= " + Resultado);
        
        //mayor o igual
        Resultado = Num1 >= Num2;
        System.out.println ("Mayor o igual= " + Resultado);
    }
    
}
