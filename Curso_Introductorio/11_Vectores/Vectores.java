package Basico;

/*
Para poder definir los vectores podemos hacerlo de dos maneras

<tipo de dato> [] <nombre del vector>;
<nombre de vector> = new <tipo de dato> [tamaño];

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

<tipo de dato> [] <nombre del vector> = new <tipo de dato> [tamaño];
*/

public class Vectores {
    public static void main (String [] args) {
        String [] Nombres = new String [3];
        
        Nombres [0] = "Pedro";
        Nombres [1] = "Pochita";
        Nombres [2] = "Manolo";
        
        for (int i =0; i <=2; i++) {
            System.out.println (Nombres [i]);
        }
    }
}
