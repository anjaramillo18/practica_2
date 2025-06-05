package anjaramillo18.ejecutor;

import anjaramillo18.utiles.Utiles;

import java.util.Scanner;

/**
 * @author anahijaramillo
 */
public class Practica_2 {
    public static void main(String[] args) {

        // Crear instancia de Scanner
        Scanner sc = new Scanner(System.in);

        // Opciones de los ejercicios
        System.out.println("============================");

        // For
        System.out.println("Practica Programación 2");
        System.out.println("1 Tabla de multiplicar ");
        System.out.println("2 Números Primos");
        System.out.println("3 Generar 3 números = 10 ");
        System.out.println("4 Calcular el mcm de dos números");
        // While
        System.out.println("5 Leer números hasta que se repita uno");
        System.out.println("6 Contar cuántos dígitos tiene un número");
        System.out.println("7 Validar contraseña con tres intentos");
        System.out.println("8 Revertir un número entero");
        // Do while
        System.out.println("9  Ingresar letras hasta que se repita una vocal");
        System.out.println("10 Sumar dígitos de un número hasta que quede uno solo");
        System.out.println("11 Leer edades y determinar la cantidad de mayores de edad");
        System.out.println("12 Sumar  números aleatorios hasta alcanzar un total mínimo");
        // Switch
        System.out.println("13 Clasificar notas en categorías (A, B, C, etc.)");
        System.out.println("14 Juego de piedra-papel-tijera con opción para reiniciar");
        System.out.println("15 Detectar si un carácter es vocal, consonante o símbolo");
        System.out.println("16 Determinar número de días del mes ingresado");

        System.out.println("=============================");

        System.out.println("Ingrese un opción de un 1 al 16:");
        // Leer la opción ingresada
        int op = sc.nextInt();

        // Presentar la opción ingresada
        switch (op) {
            case 1:
                Utiles.ejercicio_1();
                break;
            case 2:
                Utiles.ejercicio_2();
                break;
            case 3:
                Utiles.ejercicio_3();
                break;
            case 4:
                Utiles.ejercicio_4();
                break;
            case 5:
                Utiles.ejercicio_5();
                break;
            case 6:
                Utiles.ejercicio_6();
                break;
            case 7:
                Utiles.ejercicio_7();
                break;
            case 8:
                Utiles.ejercicio_8();
                break;
            case 9:
                Utiles.ejercicio_9();
                break;
            case 10:
                Utiles.ejercicio_10();
                break;
            case 11:
                Utiles.ejercicio_11();
                break;
            case 12:
                Utiles.ejercicio_12();
                break;
            case 13:
                Utiles.ejercicio_13();
                break;
            case 14:
                Utiles.ejercicio_14();
                break;
            case 15:
                Utiles.ejercicio_15();
                break;
            case 16:
                Utiles.ejercicio_16();
                break;
            default:
                System.out.println("Opción no valida");
        }

        sc.close();
    }
}
