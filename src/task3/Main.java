package task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int n1 = n*1; // заданное число
        int b = 0;
        for (int c = 0; c < 3; c++) {
            b *= 10;
            b += n1 % 10;
            n1 /= 10;
        }
        System.out.println(b);


    }
}
