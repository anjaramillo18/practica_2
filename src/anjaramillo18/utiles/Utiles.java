package anjaramillo18.utiles;

import java.util.Random;
import java.util.Scanner;

/**
 * @author anahijaramillo
 */
public class Utiles {

    public String ejercicio_1(int numero, int limite) {
        String tablamultiplicar = "";

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }
        return tablamultiplicar;

    }

    public void ejercicio2(int n) {

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

    }

    public boolean esPrimo(int numero) {
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

    public void ejercicio_3() {
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

    public void ejercicio_4(int numero1, int numero2) {

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

    }

    public void ejercicio_5(int cantidad) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        boolean repetido = false;

        //System.out.println("Ingrese números (se detendrá cuando ingrese uno repetido)");
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

    }

    public void ejercicio_6(int numero_original) {

        // Para manejar números negativos
        if (numero_original < 0) {
            numero_original = -numero_original;
        }
        // Contamos los dígitos
        int digitos = 0;
        while (numero_original > 0) {
            numero_original = numero_original / 10;  // Dividimos entre 10 en cada iteración
            digitos++;
        }
        System.out.println("el numero de digitos es: " + digitos);
    }

    public void ejercicio_7(int intentos, String clave) {
        Scanner sc = new Scanner(System.in);

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

    }

    public void ejercicio_8(int numero) {

        int numeroOriginal = numero;
        int numeroRevertido = 0;

        while (numero != 0) {
            int digito = numero % 10;         // obtenemos el último dígito
            numeroRevertido = numeroRevertido * 10 + digito;  // construimos el número revertido
            numero = numero / 10;             // eliminamos el último dígito
        }

        System.out.printf("Número original: %d\n", numeroOriginal);
        System.out.printf("Número revertido: %d\n", numeroRevertido);
    }

    public void ejercicio_9() {

        String vocalesEncontradas = "";
        char letra = 0;
        boolean vocalRepetida = false;

        do {
            System.out.println("Ingrese una letra: ");
             letra = new Scanner(System.in).next().toLowerCase().charAt(0);

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

    }

    public int ejercicio_10(int numeros) {

        do {
            int suma = 0;

            // Sumar los dígitos
            while (numeros > 0) {
                suma += numeros % 10;
                numeros = numeros / 10;
            }

            System.out.printf("Suma: %d\n", suma);
            numeros = suma;

        } while (numeros > 9);

        return numeros = numeros;

    }

    public int ejercicio_11() {
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

        return mayoresEdad;

    }

    public void ejercicio_12(int totalMinimo) {

        Random rand = new Random();

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

    }

    public void ejercicio_13() {
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

    }

    public void ejercicio_14() {
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

    public void ejercicio_15() {
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
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
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
                case '.', ',', ';', ':', '!', '¡', '?', '¿', '"', '\'', '+', '-', '*', '/', '=', '@', '#', '$', '%', '&', '(', ')', '[', ']', '{', '}':
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

    }

    public String ejercicio_16(int mes) {
        Scanner sc = new Scanner(System.in);

        String resultado;
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

        resultado = String.format("%s tiene %s", nombreMes, dias);

        return resultado;

    }

    public void ejercicio_17(double cantidad, int meses, String tipo) {
        // Primero definimos el interés según el tipo de préstamo
        double interes;

        if (tipo.equalsIgnoreCase("personal")) {
            interes = 12; // 12%
        } else if (tipo.equalsIgnoreCase("hipotecario")) {
            interes = 6;  // 6%
        } else if (tipo.equalsIgnoreCase("cofidis")) {
            interes = 18; // 18%
        } else {
            System.out.println("Tipo de préstamo no válido");
            return;
        }

        // Hacemos los cálculos básicos
        double interesAnual = interes / 100;
        double cuotaMensual = (cantidad + (cantidad * interesAnual)) / meses;
        double totalPagar = cuotaMensual * meses;

        // Mostramos los resultados
        System.out.println("=== DETALLES DEL PRÉSTAMO ===");
        System.out.println("Cantidad solicitada: " + cantidad + "€");
        System.out.println("Tipo de préstamo: " + tipo);
        System.out.println("Duración: " + meses + " meses");
        System.out.println("Interés anual: " + interes + "%");
        System.out.println("Cuota mensual: " + Math.round(cuotaMensual) + "€");
        System.out.println("Total a pagar: " + Math.round(totalPagar) + "€");
    }

    public void ejercicio_18() {
        // Los productos con su stock (nombre y cantidad)
        String[] nombres = {"Celular", "Tablet", "Laptop", "Auriculares", "Monitor"};
        int[] cantidades = {2, 8, 3, 4, 10};

        // Para contar cuánto necesitamos en total
        int totalReponer = 0;

        // Mostramos el inventario actual
        System.out.println("=== INVENTARIO ACTUAL ===");

        // Revisamos producto por producto
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + cantidades[i] + " unidades");

            // Si hay menos de 5, hay que reponer
            if (cantidades[i] < 5) {
                int faltantes = 5 - cantidades[i];
                System.out.println("-> Reponer " + faltantes + " " + nombres[i]);
                totalReponer += faltantes;
            }
        }

        // Mostramos el total a reponer
        System.out.println("\nTotal de unidades a reponer: " + totalReponer);
    }

    public void ejercicio_19() {
        // Variables para contar
        int diasCalor = 0;
        int diasFrio = 0;
        int sumaTemperaturas = 0;

        // Simulamos 365 días
        System.out.println("=== ANÁLISIS DEL CLIMA ===");

        for (int dia = 1; dia <= 365; dia++) {
            // Generamos temperatura aleatoria entre -5 y 40 grados
            int temperatura = (int) (Math.random() * 46) - 5;

            // Sumamos para el promedio
            sumaTemperaturas += temperatura;

            // Verificamos si es ola de calor o frío
            if (temperatura > 35) {
                diasCalor++;
                System.out.println("Día " + dia + ": " + temperatura + "°C - ¡Ola de calor!");
            } else if (temperatura < 0) {
                diasFrio++;
                System.out.println("Día " + dia + ": " + temperatura + "°C - ¡Ola de frío!");
            }
        }

        // Calculamos el promedio
        double temperaturaPromedio = (double) sumaTemperaturas / 365;

        // Mostramos resultados
        System.out.println("\nRESULTADOS DEL AÑO:");
        System.out.println("Días con ola de calor: " + diasCalor);
        System.out.println("Días con ola de frío: " + diasFrio);
        System.out.println("Temperatura promedio: " + Math.round(temperaturaPromedio) + "°C");
    }

    public void ejercicio_20() {
        // Contadores de clientes atendidos
        int clientesCajero = 0;
        int clientesAsesor = 0;

        System.out.println("=== SIMULACIÓN DEL BANCO ===");

        // Simulamos 120 minutos
        for (int minuto = 1; minuto <= 120; minuto++) {
            // Decidimos aleatoriamente qué servicio quiere el cliente (0 = cajero, 1 = asesor)
            int servicio = (int) (Math.random() * 2);

            if (servicio == 0) {
                // Simulamos atención del cajero (2 minutos)
                System.out.println("Minuto " + minuto + ": Llega cliente para CAJERO");
                for (int i = 0; i < 2; i++) {
                    minuto++;
                    if (minuto > 120) {
                        break;
                    }
                }
                clientesCajero++;
                System.out.println("Cliente atendido por CAJERO");
            } else {
                // Simulamos atención del asesor (5 minutos)
                System.out.println("Minuto " + minuto + ": Llega cliente para ASESOR");
                for (int i = 0; i < 5; i++) {
                    minuto++;
                    if (minuto > 120) {
                        break;
                    }
                }
                clientesAsesor++;
                System.out.println("Cliente atendido por ASESOR");
            }
        }

        // Mostramos resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Clientes atendidos por cajero: " + clientesCajero);
        System.out.println("Clientes atendidos por asesor: " + clientesAsesor);
        System.out.println("Total de clientes atendidos: " + (clientesCajero + clientesAsesor));
    }

    public void ejercicio_21() {
        // Variables para el control
        int horasRiego = 0;
        int HORAS_DIA = 24;

        System.out.println("=== CONTROL DE RIEGO DIARIO ===");

        // Revisar cada 2 horas (12 revisiones al día)
        for (int hora = 0; hora < HORAS_DIA; hora += 2) {
            // Generamos humedad aleatoria (0-100%)
            int humedad = (int) (Math.random() * 101);

            System.out.println("\nHora " + hora + ":00 - Humedad: " + humedad + "%");

            // Decidimos si regar según la humedad
            if (humedad < 30) {
                System.out.println("¡RIEGO ENCENDIDO! (Humedad baja)");
                horasRiego += 2; // Sumamos 2 horas de riego
            } else if (humedad <= 60) {
                System.out.println("Humedad normal. Manteniendo estado.");
            } else {
                System.out.println("Humedad alta. Riego apagado.");
            }
        }

        // Mostramos resumen
        System.out.println("\n=== RESUMEN DEL DÍA ===");
        System.out.println("Tiempo total de riego: " + horasRiego + " horas");
        System.out.println("Agua estimada: " + (horasRiego * 100) + " litros");

    }

}
