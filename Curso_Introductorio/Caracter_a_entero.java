package Basico;

public class Caracter_a_entero {
    public static void main (String [] args) {
        System.out.println ("15" + "20");
        /*
        no podemos realizar operaciones aritmeticas con estos datos ya que son
        de tipo caracter, para ello debemos realizar una conversion del tipo de 
        dato
        */
        
        System.out.println (Integer.parseInt("15") + Integer.parseInt("20") );
        //seguimos la siguiente sintaxis para la conversion de datos
        //  <tipo de dato>.parse<Tipo de dato>(dato a convertir);
    }
}
