/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author carol
 */
import java.util.Scanner;
public class Operaciones {
    public static void main (String[] args){
        int n1,n2,suma;
            Scanner lectura=new Scanner(System.in);
            //entrada
            System.out.print ("Ingresar Número 1:");
            n1=lectura.nextInt();
            System.out.print ("Ingresar Número 2:");
            n2=lectura.nextInt();
            //proceso
            suma=n1+n2;
            //salida
            System.out.println("La suma de los números es;"+suma);
    }
}
