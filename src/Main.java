import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int c = 25;
        int d = 45;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;

        double sum1 = a1 + a2;
        System.out.println(sum1);

        float a3 = 10.2f;
        float a4 = 15.3f;
        float sum2 = a3 + a4;
        System.out.println(sum2);

        double test = a2 + a3;
        System.out.println(test);

        boolean trueVar = true;
        boolean falseVar = false;

        char digit = '1';
        String digits = "123456";

        boolean sumBool = true || false;
        boolean antiTrueVar = !trueVar;

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        System.out.println(a1 + str3);

        int calculation = (1 + 2) * 3 * (4 + 8) / 3 + 6;
        System.out.println(calculation);

        int result = 1 + 2 + 2 / (3 * 4) + 6;
        System.out.println(result);
        System.out.println(result);

        System.out.print("Введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age <= 25) {

            System.out.println("покажи документы и я тебе продам ");
        } else if (age >= 25 && age < 65) {

            System.out.println("Продаем без документов");
        } else if (age >= 65 && age <= 100) {

            System.out.println("Продаем спокойно но с таблетками");
        } else if (age <= 18) {
            System.out.println("иди учись");
        } else {
            System.out.println("Иди поспи");
        }

    }
}