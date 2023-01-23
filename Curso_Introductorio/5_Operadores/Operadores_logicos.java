package Basico;

/*
OPERADORES LOGICOS

Las premisas logicas son una base fundamental en la programacion, por lo tanto
existen los operadores logicos, los cuales se usan en tipos de datos booleanos

|   &&  |   AND |   ambas expresiones deben ser verdaderas      |
|   ||  |   OR  |   una de las expresiones deben ser verdaderas |
|   |   |   NOT |   negacion o inversion de la expresion logica |

*/

public class Operadores_logicos {
    public static void main (String [] args) {
        Boolean Resultado;
        
        //or
        Resultado = (7==5) || (1==1);
        System.out.println (Resultado);
        
        //and
        Resultado = (1==1) && (2==2);
        System.out.println (Resultado);
    
        Resultado = (1==1) && (23==2);
        System.out.println (Resultado);
        
        //booleano que dara negativo al comparar
        Resultado = (23==2);
        System.out.println (Resultado);
        
        //operador not, invierte el resultado
        Resultado = !(23==2);
        System.out.println (Resultado);
    }
}
