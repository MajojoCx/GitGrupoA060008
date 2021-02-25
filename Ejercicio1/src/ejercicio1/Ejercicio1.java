/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author MR GB
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);    
        int Num1, Num2, Num3;
        System.out.println("Introdusca primer número: ");
        Num1 = sc.nextInt();
        System.out.println("Introdusca segundo número: ");
        Num2 = sc.nextInt();
        System.out.println("Introdusca tercer número: ");
        Num3 = sc.nextInt();
        if (Num1 > Num2) {
            if(Num1 > Num3) {
                System.out.println("El numero mayor es: " + Num1);
            } else { 
                System.out.println("El numero mayor es: " + Num3);
            }
        } else if (Num2 > Num3) {
           System.out.println("El numero mayor es: " + Num2); 
        } else {
           System.out.println("El numero mayor es: " + Num3); 
           
        }
        
    }
    }
