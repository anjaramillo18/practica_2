/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anahijaramillo
 */
      import java.util.Scanner;

public class Banderas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        do {
            System.out.println("Usted desea salir del sistema?\n");
            String resp = sc.nextLine();
            if (resp.equals("si")) {
                salir = false;
                System.out.println("Has salido del sistema :)");
            } else {
                System.out.println("Usted sigue en el sistema :)");
            }
        } while(salir);
    }
}



