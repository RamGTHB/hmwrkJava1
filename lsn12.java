// Задание 2. Написать программу возвращающую число, которое без остатка делится на сумму цифр этого числа.

import java.util.Scanner;

public class lsn12 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int x = iScanner.nextInt();
        iScanner.close();
        int sum = 0;

        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        System.out.println(sum);
        }
    }

// Далее не разобрался как вернуть число









