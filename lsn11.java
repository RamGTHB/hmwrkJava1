// Задание 1. Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class lsn11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int n = in.nextInt();
        int T = (n * (n + 1)) / 2;
        System.out.println(T);
    }
}
