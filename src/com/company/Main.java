package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
// умножение матрицы на вектор
    public static void main(String[] args) {
        System.out.println("Введите размерность массивов");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Random random = new Random();
        int[][] array1 = new int[n][n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = random.nextInt(20);
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = random.nextInt(20);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }


        int i, j;
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1[i].length; j++) {
                array3[i] +=array1[i][j] * array2[j];
            }
        }

        System.out.println();
        System.out.println();

        for (i = 0; i < array1.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
