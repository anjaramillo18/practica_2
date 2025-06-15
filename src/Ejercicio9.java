/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anahijaramillo
 */
public class Ejercicio9 {

    public static void main(String[] args) {
         /** 
         * En ves de float se utiliza un entero en dia
         * Se reemplaza de caracter ' ' a cadena de texto " "
         * Se imprime el mensaje con print
         * Se agrega en dias pares aprender Teoria de la programcion
         * Se utiliza un bucle while para imprimir todos los dias 
         * Se agrega contador para cortar el programa
         */

         
        int dia = 0;
        String msg = "";
        while (dia != 6) {
            dia++;
            switch (dia) {
                case 1:
                    msg = "Lunes, Mal dia\n"; //cambio '' a " "
                    System.out.println(msg);
                    break;
                case 2:
                    msg = "Martes, buen dia";
                    System.out.println(msg);
                    System.out.println("para aprender Teoria de la Programacion\n");
                    break;
                case 3:
                    msg = "Miercoles, Mal dia\n";
                    System.out.println(msg);
                    break;
                case 4:
                    msg = "Jueves, Buen dia ";
                    System.out.println(msg);
                    System.out.println("para aprender Teoria de la Programacion\n");
                    break;
                case 5:
                    msg = "Viernes, Mal dia\n";
                    System.out.println(msg);
                    break;
                case 6:
                    msg = "Descanso";
                    System.out.println(msg);
                    break;
            }
        }

    }

}


