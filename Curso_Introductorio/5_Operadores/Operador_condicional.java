package Basico;
/*
Los operadores condicionales se manejan bajo la siguiente sintaxis
    expresion1      ? expresion2        : expresion3
    (ex. a evaluar) ? (ex. si es true)  : (ex. si es false)

evaluan expresiones booleanas, en caso de que la expresion1 sea verdadera, 
se guardara comoo respuesta la expresion2, pero si la expresion1 obtiene el 
resultado false se guardara la expresion3
 */

public class Operador_condicional {
    public static void main (String [] args) {
        
        int Num1 = 5, Num2 = 6;
        String Respuesta = ""; //vacio porque sera una variable llenada despues
        
        Respuesta = (Num2 > Num1) ? "Es mayor" : "Es menor";
        /*
        La variable respuesta guardara el resultado indicado, en este caso al 
        resultar positiva la expresion, el resultado guardado fue la expresion2
        */
        System.out.println (Respuesta);
    }
}
