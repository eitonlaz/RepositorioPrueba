/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_s3_8;

/**
 *
 * @author LENOVO
 */
public class DivisionExt {
    public int dividir(int a, int b){
        int resultado = 0;
        try {
            resultado = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Nose puede dividir entre cero (0).");
        }
        return  resultado;
    }
}
