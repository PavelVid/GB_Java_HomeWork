// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int number = sc.nextInt();
        sc.close();

        int trgsum = 0;
        int factorial = 1;
        for (int i = 1; i < number + 1; i++) {
            trgsum += i;
            factorial *= i;
        }
        System.out.println("Треугольное число: " + trgsum);
        System.out.println("Факториал числа: " + factorial);

    }
}