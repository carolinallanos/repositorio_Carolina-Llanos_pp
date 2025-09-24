/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;
//Paquete de datos e/s datos por consola
/**
 *
 * @author carol
 */
import java.util.Scanner;
public class Operaciones {
    //Método principal
    public static void main(String args[]){
    //Declaración de variables
    String empleado;
    double ht,th,sb,d,sn,bs;
    //Creando el objeto lectura
    Scanner lectura=new Scanner(System.in);
    //Entrada de datos
    System.out.print("Nombre de empleado: ");
    empleado=lectura.next();
    System.out.print("Horas trabajadas: ");
    ht=lectura.nextDouble();
    System.out.print("Tarifa por hora: ");
    th=lectura.nextDouble();
    //Proceso de datos
    sb=ht*th;
    d=sb*0.13;
    sn=sb-d;
    bs=sb*0.3689;
    //Salida de datos
    System.out.println("Sueldo Bruto: "+sb);
    System.out.println("Descuento: "+d);
    System.out.println("Sueldo Neto: "+sn);
    System.out.println("Beneficios Sociales: "+bs);
    }//Fin del método
}//Fin del programa
