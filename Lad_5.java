package com.company;
import java.util.Scanner;

public class Lad_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter array length n: ");
        int n = num.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Insert array elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; ++j) {
                array[j][i] = num.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        }

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] > 0) {
                    array[i][j] = 1;
                }
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
                System.out.println(array[i][j]);
            }
        }
    }
}
