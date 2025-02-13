package task2;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int hours = n / 3600;
        int min = (n % 3600) / 60;
        int sec = n %60;

        System.out.println("полных часов:"+ hours);
        System.out.println("полных минут с начала текущего часа: "+ min);
        System.out.println("полных секунд с начала текущей минуты: "+ sec);
        System.out.println(hours + " " + min + " " + sec);

        int calculation=48/3600;
        System.out.println(calculation);

    }
}
