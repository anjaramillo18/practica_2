package anjaramillo18.ejecutor;

import anjaramillo18.utiles.Utiles;

import java.util.Scanner;

/**
 * @author anahijaramillo
 */
public class Practica_2 {

    public static void main(String[] args) {

        // Crear instancia de Scanner
        Utiles u = new Utiles();
      
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
        System.out.println("17 Calcula la cuota mensual con la fórmula correspondiente y muestra amortización anual");
        System.out.println("18 Calcular el total de unidades a reabastecer");
        System.out.println("19 Análisis de datos climáticos");
        System.out.println("20 ⁠Simulación de fila en banco");
        System.out.println("21 Optimización de riego en cultivo ");
        System.out.println("=================================");
        System.out.println(" Preguntas del ensayo");
        System.out.println(" 22  Pregunta 8   ");
        System.out.println("  ==============================");
        System.out.println("Ingrese un opción de un 1 al 21:");
        // Leer la opción ingresada
        int op = sc.nextInt();

        // Presentar la opción ingresada
        switch (op) {
            case 1:
                System.out.println("Ingrese el número para generar la tabla de multiplicar:");
                int numero = sc.nextInt();

                System.out.println("¿Hasta qué número desea multiplicar?");
                int limite = sc.nextInt();

                System.out.println("\nTabla de multiplicar del " + numero + ":");
                System.out.println("------------------------");
                u.ejercicio_1(numero, limite);
                break;
            case 2:
                System.out.println("¿Cuántos números primos desea calcular?");
                int n = sc.nextInt();
                u.ejercicio2(n);
                break;
            case 3:
                System.out.println("Numeros de 3 digitos que cuya  suma sea 10 ");
                u.ejercicio_3();
                break;
            case 4:
                System.out.println("Ingrese el primer número:");
                int numero1 = sc.nextInt();

                System.out.println("Ingrese el segundo número:");
                int numero2 = sc.nextInt();
                u.ejercicio_4(numero1, numero2);
                break;

            case 5:
                System.out.println("Ingrese números (se detendrá cuando ingrese uno repetido)");
                int cantidad = sc.nextInt();
                u.ejercicio_5(cantidad);
                break;
            case 6:

                System.out.println("Ingrese un número: ");
                int numer1 = sc.nextInt();
                System.out.println("Numero original es: " + numer1);
                u.ejercicio_6(numer1);
                break;
            case 7:
                System.out.println("Ingrese la clave tiene 3 intentos");
                String clave = sc.nextLine();
                u.ejercicio_7(3, clave);
                break;
            case 8:
                System.out.println("Ingrese el numero ");
                int num = sc.nextInt();
                u.ejercicio_8(num);
                break;
            case 9:

                System.out.println("Ingrese letras (una a la vez).");
                System.out.println("El programa terminará cuando se repita una vocal.");
                u.ejercicio_9();
                break;
            case 10:

                System.out.println("Ingrese los  número: ");
                int numbers = sc.nextInt();
                u.ejercicio_10(numbers);
                break;

            case 11:

                int mayoresEdad = u.ejercicio_11();
                System.out.printf("\nCantidad de personas mayores de edad: %d\n", mayoresEdad);
                break;
            case 12:
                System.out.println("Ingrese el total mínimo a alcanzar: ");
                int totalMinimo = sc.nextInt();
                u.ejercicio_12(totalMinimo);
                break;
            case 13:
                u.ejercicio_13();
                break;
            case 14:
                u.ejercicio_14();
                break;
            case 15:
                u.ejercicio_15();
                break;
            case 16:
                System.out.println("=== DÍAS DEL MES ===");
                System.out.print("Ingrese el número del mes (1-12): ");
                int mes = sc.nextInt();
                String resultado = u.ejercicio_16(mes);
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opción no valida");

            case 17:
                System.out.println("Ingrese el monto del préstamo:");
                double monto = sc.nextDouble();
                System.out.println("Ingrese el número de meses:");
                int meses = sc.nextInt();
                System.out.println("Ingrese el tipo de préstamo (personal/hipotecario/cofidis):");
                String tipoPrestamo = sc.next();
                u.ejercicio_17(monto, meses, tipoPrestamo);
                break;
            case 18:

                u.ejercicio_18();
                break;

            case 19:

                u.ejercicio_19();
                break;
            case 20:

                u.ejercicio_20();
                break;
            case 21:

                u.ejercicio_21();
                break;
            
        }
       
    }
     

}
