/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anahijaramillo
 */
import java.util.Scanner;

public class Pregunta7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE UN NUMERO");
        int numer = sc.nextInt();
        System.out.println("Sin llamar al metodo: " + numer);
        numer = modificar(numer);
        System.out.println("Despues de llamar al metodo: " + numer);
    }

    // Método que intenta cambiar el valor del parámetro sumando 15
    public static int modificar(int valor) {
        return valor = valor + 15;
    }

}

