/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer_s3_8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ejer_s3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DivisionExt div = new DivisionExt();
        
        try {
            System.out.println("Ingrese el dividendo (número entero): ");
        int dendo = sc.nextInt();
        
        System.out.println("Ingrese el divisor (número entero): ");
        int dsor = sc.nextInt();
        
        int resultado = div.dividir(dendo, dsor);
        System.out.println("Resultado de la división es:  "+resultado);
          
        
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar únicaente números enteros.");
        } finally {
            
            sc.close();
        }
    }
    
}
