
package anjaramillo18.utiles;

import java.util.Random;
import java.util.Scanner;

/**
 * @author anahijaramillo
 */
public class Utiles {

    public static void ejercicio_1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número para generar la tabla de multiplicar:");
        int numero = sc.nextInt();

        System.out.println("¿Hasta qué número desea multiplicar?");
        int limite = sc.nextInt();

        System.out.println("\nTabla de multiplicar del " + numero + ":");
        System.out.println("------------------------");

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }

        sc.close();

    }

    public static void ejercicio_2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números primos desea calcular?");
        int n = sc.nextInt();

        System.out.println("Primeros " + n + " números primos");
        System.out.println("\t═══════════════════════════════════");

        int numero = 2;
        int encontrados = 0;
        int numerosPorFila = 5;

        while (encontrados < n) {
            if (esPrimo(numero)) {
                System.out.printf("\t%-6d", numero);
                encontrados++;

                if (encontrados % numerosPorFila == 0) {
                    System.out.println();
                }
            }
            numero++;
        }

        if (encontrados % numerosPorFila != 0) {
            System.out.println();
        }

        System.out.println("\t═══════════════════════════════════");

        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ejercicio_3() {
        System.out.println("Numeros de 3 digitos que cuya  suma sea 10 ");
        int numero1, numero2, numero3;
        for (int num = 100; num <= 1000; num++) {

            numero1 = num / 100;
            numero2 = (num / 10) % 10;
            numero3 = num % 10;

            int suma = numero1 + numero2 + numero3;
            if (suma == 10) {
                System.out.println("num 1= " + numero1 + " num 2= " + numero2 + " num 3= " + numero3);
                System.out.println(" ");

            }
        }
    }


    public static void ejercicio_4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = sc.nextInt();

        // Calculamos el MCD usando el algoritmo de Euclides
        int mcd = 1;

        for (int i = 1; i <= numero1 && i <= numero2; i++) {
            if (numero1 % i == 0 && numero2 % i == 0) {
                mcd = i;
            }
        }

        // Calculamos el MCM usando la fórmula: MCM = (a * b) / MCD
        int mcm = (numero1 * numero2) / mcd;

        System.out.printf("El mínimo común múltiplo de %d y %d es: %d%n", numero1, numero2, mcm);

        sc.close();
    }

    public static void ejercicio_5() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int cantidad = 0;
        boolean repetido = false;

        System.out.println("Ingrese números (se detendrá cuando ingrese uno repetido)");

        while (!repetido) {

            System.out.println("Número: ");

            int num = sc.nextInt();

            int i = 0;
            while (i < cantidad) {
                if (numeros[i] != num) {
                    i++;
                } else {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {

                numeros[cantidad] = num;

                cantidad++;

            } else {
                System.out.printf("\n¡%d está repetido!\n", num);
            }
        }

        System.out.println("Números que ingresaste:");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d ", numeros[i]);
        }
        System.out.printf("\nTotal de números: %d\n", cantidad);

        sc.close();

    }

    public static void ejercicio_6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        // Guardamos el número original para mostrarlo al final
        int numeroOriginal = numero;

        // Para manejar números negativos
        if (numero < 0) {
            numero = -numero;
        }

        // Contamos los dígitos
        int digitos = 0;
        while (numero > 0) {
            numero = numero / 10;  // Dividimos entre 10 en cada iteración
            digitos++;
        }

        System.out.printf("El número %d tiene %d dígitos\n", numeroOriginal, digitos);

        sc.close();

    }

    public static void ejercicio_7() {
        Scanner sc = new Scanner(System.in);

        String clave = "123";
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Ingrese la clave: ");
            String entrada = sc.nextLine();

            if (entrada.equals(clave)) {
                System.out.println("¡Clave correcta!\n");
                break;
            } else {
                intentos--;
                System.out.printf("Clave incorrecta, te quedan %d intentos\n", intentos);
            }
        }

        sc.close();

    }

    public static void ejercicio_8() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        int numeroOriginal = numero;
        int numeroRevertido = 0;

        while (numero != 0) {
            int digito = numero % 10;         // obtenemos el último dígito
            numeroRevertido = numeroRevertido * 10 + digito;  // construimos el número revertido
            numero = numero / 10;             // eliminamos el último dígito
        }

        System.out.printf("Número original: %d\n", numeroOriginal);
        System.out.printf("Número revertido: %d\n", numeroRevertido);

        sc.close();

    }

    public static void ejercicio_9() {
        Scanner sc = new Scanner(System.in);

        String vocalesEncontradas = "";
        char letra;
        boolean vocalRepetida = false;

        System.out.println("Ingrese letras (una a la vez).");
        System.out.println("El programa terminará cuando se repita una vocal.");

        do {
            System.out.println("Ingrese una letra: ");

            // Leemos la letra y la convertimos a minúscula para evitar problemas de mayúsculas
            letra = sc.next().toLowerCase().charAt(0);

            // Verificamos si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                // Si la vocal ya estaba registrada
                if (vocalesEncontradas.indexOf(letra) >= 0) {
                    vocalRepetida = true;
                    System.out.printf("¡La vocal '%c' está repetida!\n", letra);
                } else {
                    vocalesEncontradas += letra;
                    System.out.printf("Vocal registrada: %c\n", letra);
                }
            }

        } while (!vocalRepetida);

        System.out.println("\nVocales encontradas: " + vocalesEncontradas);

        sc.close();

    }

    public static void ejercicio_10() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        do {
            int suma = 0;

            // Sumar los dígitos
            while (numero > 0) {
                suma += numero % 10;
                numero = numero / 10;
            }

            System.out.printf("Suma: %d\n", suma);
            numero = suma;

        } while (numero > 9);

        sc.close();

    }

    public static void ejercicio_11() {
        Scanner sc = new Scanner(System.in);

        int mayoresEdad = 0;
        char continuar;

        do {
            System.out.println("Ingrese una edad: ");
            int edad = sc.nextInt();

            if (edad >= 18) {
                mayoresEdad++;
            }

            System.out.println("¿Desea ingresar otra edad? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.printf("\nCantidad de personas mayores de edad: %d\n", mayoresEdad);

        sc.close();

    }

    public static void ejercicio_12() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese el total mínimo a alcanzar: ");
        int totalMinimo = sc.nextInt();

        int suma = 0;
        int contador = 0;

        do {
            int numeroAleatorio = rand.nextInt(100) + 1; // Genera números entre 1 y 100
            suma += numeroAleatorio;
            contador++;

            System.out.printf("Número generado: %d, Suma actual: %d\n", numeroAleatorio, suma);

        } while (suma < totalMinimo);

        System.out.printf("\nSe alcanzó el total mínimo de %d\n", totalMinimo);
        System.out.printf("Suma final: %d\n", suma);
        System.out.printf("Cantidad de números generados: %d\n", contador);

        sc.close();

    }

    public static void ejercicio_13() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese una nota (0-20) o -1 para terminar: ");
            int nota = sc.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 20) {
                System.out.println("Nota inválida. Debe estar entre 0 y 20.");
                continue;
            }

            // Convertimos la nota a una escala de 0-4
            int escala = nota / 5;

            System.out.printf("Nota %d - ", nota);
            switch (escala) {
                case 4:
                    System.out.println("Categoría A (Excelente)");
                    break;
                case 3:
                    System.out.println("Categoría B (Muy Bueno)");
                    break;
                case 2:
                    System.out.println("Categoría C (Regular)");
                    break;
                case 1:
                    System.out.println("Categoría D (Deficiente)");
                    break;
                case 0:
                    System.out.println("Categoría F (Reprobado)");
                    break;
            }

        } while (true);

        System.out.println("\n¡Programa terminado!");
        sc.close();

    }

    public static void ejercicio_14() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int victoriasJugador = 0;
        int victoriasComputadora = 0;

        do {
            System.out.println("\n=== PIEDRA, PAPEL O TIJERA ===");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("Elige tu jugada (1-3): ");

            int jugadaJugador = sc.nextInt();
            int jugadaComputadora = rand.nextInt(3) + 1;

            // Mostrar elecciones
            System.out.println("\nTu elección: " + convertirJugada(jugadaJugador));
            System.out.println("Computadora: " + convertirJugada(jugadaComputadora));

            // Determinar ganador
            if (jugadaJugador == jugadaComputadora) {
                System.out.println("¡Empate!");
            } else {
                switch (jugadaJugador) {
                    case 1: // Piedra
                        switch (jugadaComputadora) {
                            case 2: // Papel
                                System.out.println("¡Perdiste! Papel envuelve piedra");
                                victoriasComputadora++;
                                break;
                            case 3: // Tijera
                                System.out.println("¡Ganaste! Piedra rompe tijera");
                                victoriasJugador++;
                                break;
                        }
                        break;

                    case 2: // Papel
                        switch (jugadaComputadora) {
                            case 1: // Piedra
                                System.out.println("¡Ganaste! Papel envuelve piedra");
                                victoriasJugador++;
                                break;
                            case 3: // Tijera
                                System.out.println("¡Perdiste! Tijera corta papel");
                                victoriasComputadora++;
                                break;
                        }
                        break;

                    case 3: // Tijera
                        switch (jugadaComputadora) {
                            case 1: // Piedra
                                System.out.println("¡Perdiste! Piedra rompe tijera");
                                victoriasComputadora++;
                                break;
                            case 2: // Papel
                                System.out.println("¡Ganaste! Tijera corta papel");
                                victoriasJugador++;
                                break;
                        }
                        break;
                }
            }

            // Mostrar marcador
            System.out.printf("\nMarcador - Tú: %d, Computadora: %d\n", victoriasJugador, victoriasComputadora);

            // Preguntar si quiere jugar de nuevo
            System.out.println("\n¿Quieres jugar otra vez? (s/n): ");

        } while (sc.next().toLowerCase().charAt(0) == 's');

        // Mostrar resultado final
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.printf("Tus victorias: %d\n", victoriasJugador);
        System.out.printf("Victorias de la computadora: %d\n", victoriasComputadora);

        if (victoriasJugador > victoriasComputadora) {
            System.out.println("¡Felicidades! ¡Eres el ganador final!");
        } else if (victoriasComputadora > victoriasJugador) {
            System.out.println("¡La computadora es la ganadora final!");
        } else {
            System.out.println("¡El juego terminó en empate!");
        }

        sc.close();


    }

    private static String convertirJugada(int jugada) {
        String resultado;
        switch (jugada) {
            case 1:
                resultado = "Piedra ✊";
                break;
            case 2:
                resultado = "Papel ✋";
                break;
            case 3:
                resultado = "Tijera ✌️";
                break;
            default:
                resultado = "Jugada inválida";
                break;
        }
        return resultado;
    }


    public static void ejercicio_15() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un carácter (0 para salir): ");
            char caracter = sc.next().toLowerCase().charAt(0);

            if (caracter == '0') {
                System.out.println("¡Programa terminado!");
                break;
            }

            System.out.printf("El carácter '%c' es: ", caracter);

            switch (caracter) {
                // Vocales
                case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú':
                    System.out.println("una VOCAL");
                    break;

                // Consonantes
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                     'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                    System.out.println("una CONSONANTE");
                    break;

                // Números
                case '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    System.out.println("un NÚMERO");
                    break;

                // Espacios en blanco
                case ' ', '\t', '\n':
                    System.out.println("un ESPACIO EN BLANCO");
                    break;

                // Símbolos especiales comunes
                case '.', ',', ';', ':', '!', '¡', '?', '¿', '"', '\'',
                     '+', '-', '*', '/', '=', '@', '#', '$', '%', '&',
                     '(', ')', '[', ']', '{', '}':
                    System.out.println("un SÍMBOLO ESPECIAL");
                    break;

                // Cualquier otro carácter
                default:
                    System.out.println("un CARÁCTER NO CLASIFICADO");
                    break;
            }

            // Información adicional sobre el código ASCII
            System.out.printf("Código ASCII: %d\n\n", (int) caracter);

        } while (true);

        sc.close();

    }

    public static void ejercicio_16() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DÍAS DEL MES ===");
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = sc.nextInt();

        String nombreMes;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Mes no válido";
                break;
        }

        String dias;
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                dias = "30 días";
                break;
            case 2:
                dias = "28 o 29 días (depende si es año bisiesto)";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = "31 días";
                break;
            default:
                dias = "Número de días no válido";
                break;
        }

        System.out.printf("%s tiene %s", nombreMes, dias);

        sc.close();


    }
}
