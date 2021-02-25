/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares060008;

/**
 *
 * @author MR GB
 */
public class NumParesImpares060008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int num = 0;
        while (i<=100) {
            if (i%1==00) {
                num = i + num;
            }
            i++;
        }
        System.out.println(" La suma de todos los números pares e impares del 1 al 100 es " + num);
    }
    
}
