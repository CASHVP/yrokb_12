package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = input.nextInt();
        System.out.println("Сумма цифр равна: " + sumdigits(n));
    }

    public static int sumdigits(int n) {

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

