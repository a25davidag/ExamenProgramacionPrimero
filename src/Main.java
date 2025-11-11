import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        //Temperaturas diarias: Recibe temperaturas diarias de un mes. Encuentra la racha más larga
        // de días consecutivos con temperatura superior a 30°C.

        int[] temperaturas = {23, 45, 23, 7, 5, 342, 45, 30, 30, 30, 46, 34, 46, 34, 56,
                30, 30, 30, 30, 20, 40, 39, 32, 5, 46, 54, 34, 67, 30, 30};

        int contador = 0;
        int contadorMax = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] == 30) {
                contador++;
                if (contador > contadorMax) {
                    contadorMax = contador;
                }
            } else {
                contador = 0;
            }
        }
        System.out.println(contadorMax);

        //Patrones de dígitos: Recibe un número entero de al menos 10 dígitos y determina la longitud de la
        // mayor subsecuencia de dígitos consecutivos pares.

        int[] paresConsecutivos = {3, 5, 3, 6, 2, 4, 1, 7, 6, 8, 10, 12, 8, 6, 7, 5, 3, 9, 1};

        int contadorPar = 0;
        int contadorParMax = 0;
        for (int i = 0; i < paresConsecutivos.length; i++) {
            if (paresConsecutivos[i] % 2 == 0) {
                contadorPar++;
                if (contadorPar > contadorParMax) {
                    contadorParMax = contadorPar;
                }
            } else {
                contadorPar = 0;
            }
        }
        System.out.println(contadorParMax);

        //Pide al usuario que ingrese una serie de números hasta que ingrese un cero.
        // Detecta y cuenta todas las subsecuencias de al menos 3 números consecutivos que estén en orden creciente.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: (hasta que pongas unn 0 para salair");
        int x = 0;
        int numero;
        int[] numerostemp = new int[100];
        do {
            System.out.println("numero ");
            numero = sc.nextInt();
            if (numero != 0) {
                numerostemp[x] = numero;
                x++;
            }
        } while (numero != 0);

        int secuencia = 0;
        int secuenciaMax = 3;

        int[] numeros = new int[x];
        for (int i = 0; i < x; i++) {
            numeros[i] = numerostemp[i];
            if (numeros[i] % 2 == 0) {
                secuencia++;
                if (secuencia > secuenciaMax) {
                    secuenciaMax = secuencia;
                }
            } else {
                secuencia = 0;
            }
        }

        System.out.println(secuenciaMax);



        //RepasoSuperFinal
        //Ejercicio 1
        //Crea un programa que llene una matriz de 2x2 con números ingresados por
        //el usuario y luego imprima todos los elementos.
        Scanner sp = new Scanner(System.in);

        int[][] numeros1 = new int[2][2];
        System.out.println("pon numeors para rellenar la matriz");

        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[0].length; j++) {
                numeros1[i][j] = sp.nextInt();
            }
        }
        //Para representar la matriz en un print
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1.length; j++) {
                System.out.print(numeros1[i][j] + " ");
            }
            System.out.println();

 */

            //Ejercicio2
            //Crea una función sumMatrix() que sume los elementos de una matriz y
            //devuelva la suma.

            int[][] sumaMatrix ={
                    {1,2,6,5},
                    {3,5,4,3},
                    {7,4,3,2}
            };

            System.out.println(sumMatrix(sumaMatrix));
        }

    public static int sumMatrix(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
}
