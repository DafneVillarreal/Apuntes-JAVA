package Basico;
import java.util.Scanner;
//Para realizar la entrada de datos desde teclado debemos importar la libreria

public class entrada_datos {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner (System.in);
      /*
        tipo de dato scanner para recibir datos, y lo inicializamos creando 
        el nuevo objeto de la clase Scanner, entre parentesis indicamos de donde
        recibiremos los datos, en este caso entraran desde el teclado
      */   
        
      String Datos;
      System.out.println("Ingresa un dato: ");
      Datos = Entrada.nextLine();
      //el objeto scanner hara un salto de linea al leer la informacion
      System.out.println ("Esta es la informacion que ingresaste por el teclado: " +Datos);
      System.out.println();
      
      String Nombre, Profesion;
      int Edad;
      double Sueldo;
      
      System.out.println ("Ingresa tu nombre: ");
      Nombre = Entrada.nextLine();
      
      System.out.println ("Ingresa tu profesion: ");
      Profesion = Entrada.nextLine();
      /*
      al ser datos tipo caracter, no hay problemas con la entrada de informacion,
      pero cuando ingresamos otro tipo de dato es importante especificarlo al 
      llamar al objeto que asignamos para la entrada de datos con la siguiente
      sintaxis
        variable = <objeto de entrada>.next<Tipo de dato>;
      */
      
      System.out.println ("Ingresa tu edad: ");
      Edad = Entrada.nextInt();
      
      System.out.println ("Ingresa tu sueldo: ");
      Sueldo = Entrada.nextDouble();
      
      System.out.println();
      System.out.println("Hola, mi nombre es " +Nombre +" y mi profesion es " +Profesion +", tengo " +Edad +" años, y mi sueldo es " +Sueldo);
      
    }
}
