/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

/**
 *
 * @author usuario
 */
public class Tipodedatos {

    /**
     * @param args the command line arguments
     */
    
    //declara una nuemero variable
    // enteros -32768 a 32767
    int numeroEntero = 0;
    double numeroDouble= 0.0;
    char letra ='A';
    String cadena="hola mundi";
    boolean VoF= false;
    //para cambiar un valor
    //valorBool=true;
    
    //escribir funciones
    
    public  static void imprimirNombre(){
        //imprimir
        // \n salto de linea
        // \t tabular, espacio para un lado
        // \b borrar a la izquierca
        // \f comienzo de pagina
        // \r retroceder java script
        // comentario de un linea
        
       
        System.out.println("May \n Carrión");
        System.out.println("ca \t rrion");
        
        String nombre ="       MAYRA carrion 20";
        System.out.println(nombre.length());
        System.out.println(nombre.trim());
        System.out.println(nombre);
        // si le pongo doble slah hya no sale
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.replace(nombre, "1"));
        System.out.println(nombre);
        System.out.println(nombre.split("-"));
        
        
        
    }
   
    public static int suma2Numeros 
        (int num1, int num2){
        int suma=num1+num2;
        return suma;
    
    }
    
        public static void main(String[] args) {
        // TODO code application logic here
        imprimirNombre();
        suma2Numeros(5,8);
        System.out.println(suma2Numeros(5,8));
    }
    
    // comentario de una sola linea
    /* comentario
    de un
    parrafo o ms lineas
    */
    
}
