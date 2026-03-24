/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema4sentenciaslogicas;
import java.util.Scanner;//Libreria importante que sirve para utilizar el teclado


/**
 *
 * @author PILARES
 */
public class Tema4sentenciaslogicas {

    public static void main(String[] args) {
        /*true
       if (true){
           System.out.println("Esta Linea se ejecuto exitosamente");
       }
       */
       
       //false
       if (false){
           System.out.println("Esta Linea se ejecuto exitosamente");
       }
       
       //Declaracion y asignacion de x,y
       Scanner sc= new Scanner (System.in);
        System.out.println("Ingresa el valor de X:");
       int x=sc.nextInt();
       System.out.println("Ingresa el valor de Y:");
       int y=sc.nextInt();
       
       //sentencia if- else -ef
       if (x>y){
           System.out.println("x es mayor que y");
       }else if(y>x){
            System.out.println("y es mayor que x");
       
       }
       else{
               System.out.println("X,Y tienen el mismo valor");
               }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("");
        //   otro ejemplo
        System.out.println("Ingresa un numeropara saber si es positivo, negativo");   
       int numero=sc.nextInt();
       if (numero>0){
           System.out.println("El numero "+numero+" es positivo");
       }else if(numero<0){
           System.out.println("El numero "+numero+" es negativo");
       
        }else{
            System.out.println("El numero es el cero");
        }
        System.out.println("Codigo creado por Nancy CA");
          
    }
}
