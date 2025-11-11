import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
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



            //Ejercicio2
            //Crea una función sumMatrix() que sume los elementos de una matriz y
            //devuelva la suma.

            int[][] sumaMatrix ={
                    {1,2,6,5},
                    {3,5,4,3},
                    {7,4,3,2}
            };

            System.out.println(sumMatrix(sumaMatrix));


        //Ejercicio3
        //Escribe una función que se llame sumRow y devuelva en un array la suma
        //de cada fila
        int[][] sumaFila ={
                {1,2,6,5},
                {3,5,4,3},
                {7,4,3,2}
        };
        System.out.println(Arrays.toString(sumRow(sumaFila)));


        int[][] sumaColumna = {
                {1, 2, 6, 5},
                {3, 5, 4, 3},
                {7, 4, 3, 2}
        };
        System.out.println(Arrays.toString(sumColum(sumaColumna)));


        // Suma de todas las diagonales posibles
        int[][] sumaDiagonal = {
                {1, 2, 6},
                {3, 5, 4},
                {7, 4, 3}
        };
        System.out.println(Arrays.toString(sumDiagonal(sumaDiagonal)));


        //Ejercicio5
        // Crea una función que se le pasa una matriz como argumento y tiene que
        //devolver la misma matriz, pero cambiando la primera fila por la última.
        //Además, todos los elementos pares de la matriz deben de volverse
        //impares
        int[][] filasCambio = {
                {1, 2, 6,5},
                {3, 5, 4,3},
                {7, 4, 3,2}
        };
     CambioFila(filasCambio);


        //Ejercicio6
        // Crea una función que recorra una matriz y devuelva en un array el número
        //mayor y el menor.
        int[][] filasCambio = {
                {1, 2, 6, 5},
                {3, 5, 4, 3},
                {7, 4, 3, 2}
        };
        System.out.println(Arrays.toString(numeroMayor(filasCambio)));



        //EJERCICIO7
        // Crea una función que devuelva en un array todos los elementos que están
        //por encima de la diagonal principal.
        int[][] numDiagonal = {
                {1, 2, 6},
                {3, 5, 4},
                {7, 4, 3}
        };
        System.out.println(Arrays.toString(diagonal(numDiagonal)));


        int[][] maTranspuesta = {
                {1, 2, 6},
                {3, 5, 4},
                {7, 4, 3}
        };
        int[][] matriz = arrayTranspuesta(maTranspuesta);
        for (int i = 0; i < maTranspuesta.length; i++) {
            for (int j = 0; j < maTranspuesta.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Crea una función que dada una matriz devuelva la transpuesta. (Ya lo
        //hemos hecho pero puede repetirse ☺ )
        int[][] maTranspuesta = {
                {1, 2, 6},
                {3, 5, 4},
                {7, 4, 3}
        };
        int[][]matriz = arrayTranspuesta(maTranspuesta);
        for (int i = 0; i < maTranspuesta.length; i++) {
            for (int j = 0; j < maTranspuesta.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



        //===========================================================================
        //Ejercicio1(Arrays)Crea una función que dado un array devuelve el mismo array con sus
        //elementos multiplicados por 2.
        int [] multi2 = {1,5,4,3,6,7,8,5,3};
        System.out.println(Arrays.toString(multiplicador(multi2)));


        //Ejercicio2
        // Crea una función que se llame generateArray(String parImpar) que se le
        //pasa como parámetro un string que puede contener la palabra par o impar.
        //Si tiene otra palabra que no sea una de esa devuelve un array vacio. Si la
        //palabra es par devuelve los primeros 20 numeros pares en un array. Si es
        //impar devuelve los primeros 20 números impares

        Scanner sw = new Scanner(System.in);
        System.out.println("Introduce par o Impar ");
         String parImpar = sw.nextLine();
        System.out.println(Arrays.toString(generateArray(parImpar)));



        //EJERCICIO3
        // Crea una función que dado un array devuelve el mismo array, pero inverso.
        int [] inverso = {1,5,4,3,6,7,8,5,3};
        System.out.println(Arrays.toString(arrayInverso(inverso)));


        //Ejercicio4
        // Crea una función que dado un entero como argumento devuelva un array
        //de las mismas posiciones con números random.
        System.out.println("pon un numero");
        Scanner mg = new Scanner(System.in);
        int numero = mg.nextInt();
        System.out.println(Arrays.toString(crearArray(numero)));

 */

        //==========================================
        //Ejercicio 1 Crea una función que dado un array de enteros los devuelva ordenados de
        //menor a mayor.

        int[] ordenArray = {1,7,5,53,4,3,2,23,4,6,65,34};
        System.out.println(Arrays.toString(ordenarArray(ordenArray)));

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

    public static int[] sumRow(int[][] matrix) {
        int sumador = 0;
        int[] sumaFila = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumaFila[i] = sumaFila[i] + matrix[i][j];
            }
        }
        return sumaFila;
    }

    public static int[] sumColum(int[][] matrix) {
        int[] sumaColum = new int[matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumaColum[i] = sumaColum[i] + matrix[j][i];
            }
        }
        return sumaColum;
    }

    public static int[] sumDiagonal(int[][] matrix) {

        int n = matrix.length;
        int totalDiagonales = 2 * n - 1;
        int[] sumaDiagonal = new int[totalDiagonales];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int indice = j - i + (n - 1);
                sumaDiagonal[indice] = sumaDiagonal[indice] + matrix[i][j];
            }
        }
        return sumaDiagonal;
    }

    public static int[][] CambioFila(int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[matrix.length - 1][j];
            matrix[matrix.length - 1][j] = temp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[] numeroMayor(int[][] matrix) {
        int max = 0;
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        int[] mayorMenor = new int[2];
        mayorMenor[0] = min;
        mayorMenor[1] = max;
        return mayorMenor;
    }

    public static int[] diagonal(int[][] matrix) {
        int tamaño = 0;

        for (int i = matrix.length - 1; i >= 1; i--) {
            tamaño = tamaño + i;
        }

        int[] numerosEncima = new int[tamaño];
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j > i; j--) {//for (int j = 0;j < i;j++) ---- debajo
                numerosEncima[x] = matrix[i][j];
                x++;
            }
        }
        return numerosEncima;
    }

    public static int[][] arrayTranspuesta(int[][] matrix) {

        int filas = matrix.length;
        int columnas = matrix[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matrix[i][j];
            }

        }
        return transpuesta;
    }
    //===========================================================================================
    public static int[] multiplicador(int[]matrix) {

     int[] nuevoMulti = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            nuevoMulti[i] = matrix[i] * 2;
        }
        return nuevoMulti;
    }
    public static int[]  generateArray (String array) {

        int[] nuevaArray = new int[20];

        if(array.equals("par")) {
            for (int i = 0; i < nuevaArray.length; i++) {
                nuevaArray[i] = (i+1) * 2;
            }
        }else if(array.equals("imp")) {
            for (int i = 0; i < nuevaArray.length; i++) {
                nuevaArray[i] = (i * 2) + 1;
            }
        }
        return nuevaArray;
    }
    public static int[] arrayInverso(int[]matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            int temp = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = temp;
        }
        return matrix;
    }
    public static int[] crearArray(int matrix) {
        Random sj = new Random();
        int[] array = new int[matrix];
        for (int i = 0; i < matrix; i++) {
            array[i] = sj.nextInt(100);
        }
        return array;
    }
    public static int[] ordenarArray(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}






