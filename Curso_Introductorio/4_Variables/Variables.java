/*
Datos primitivos

|TIPO    |   BITS    |   MINIMO                  |   MAXIMO               |
|        |           |                           |                        |
|byte    |   8       |   -128                    |   127                  |
|short   |   16      |   -32768                  |   32767                |
|int     |   32      |   -2147483648             |   2147483647           |
|long    |   64      |   -9223372036854775808    |   9223372036854775807  |
|float   |   32      |   -3.402823e38            |   3.402823e38          |
|double  |   64      |   -1.79769313486232e308   |   1.79769313486232e308 |
|chart   |   16      |   '\u000'                 |   '\ufff'              |


- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
Datos tipo objeto 

* De las bibliotecas estandar de JAVA:
    Sting, Scanner, ArrayList, etc

* Definidos por el programador:
    Cliente, Estudiante, Carro, etc

*Array:
    Vectores o matrices

* Envoltorio o wrapper:
    Byte, Short, Integer, Long, Float, Double, Character, Boolean

*/

package Basico;

/*
*El curso se manejara con paquetes y archivos java class,
*dentro de cada paquete estaran todos los ficheros necesarios
*siempre que estos se encuentren dentro de un paquete sera neceesario hacer
*referencia a este con la sintaxis
    package <nombre del paquete>;
*/

public class Variables {
 
/*
*Toda clase o metodo es necesario ponerlo entre llaves {}, para asi encapsular 
*la informacion y saber que corresponden a un escenario-
    
*Siempre sera necesario tener una clase principal, llamada main, definida con la
*estructura
    public static void main (String [] args) {}
*/
    
    public static void main (String[] args) {
        System.out.println ("Prueba");
        
        //JAVA es sensible a las mayusculas y minusculas
        
        int Edad;
        String Nombre;
        
        Edad = 15;
        Nombre = "Dafne";
        double Sueldo = 1500.23;
        Boolean Soltero = false; //or true
        //asignamos mediante '=', cuando es texto lo pondremos entre comillas
        
        System.out.println (Edad);
        System.out.println (Nombre);
        System.out.println (Sueldo);
        System.out.println (Soltero);
        //Para imprimir basta con mandar la variable
    }
}
